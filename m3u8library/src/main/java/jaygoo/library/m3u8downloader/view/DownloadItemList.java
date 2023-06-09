package jaygoo.library.m3u8downloader.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lxj.xpopup.XPopup;
import com.lxj.xpopup.impl.LoadingPopupView;
import com.lxj.xpopup.interfaces.OnConfirmListener;

import java.util.ArrayList;
import java.util.List;

import jaygoo.library.m3u8downloader.M3U8DownloaderPro;
import jaygoo.library.m3u8downloader.OnDeleteTaskListener;
import jaygoo.library.m3u8downloader.R;
import jaygoo.library.m3u8downloader.control.DownloadPresenter;
import jaygoo.library.m3u8downloader.db.M3U8dbManager;
import jaygoo.library.m3u8downloader.db.dao.DoneDao;
import jaygoo.library.m3u8downloader.db.table.M3u8DoneInfo;
import jaygoo.library.m3u8downloader.view.item.M3u8DoneItem;
import jaygoo.library.m3u8downloader.view.item.M3u8DoneItemViewBinder;
import me.drakeet.multitype.MultiTypeAdapter;

/**
 * @author huangyong
 * createTime 2019-09-27
 */
public class DownloadItemList extends Fragment implements View.OnClickListener {

    private ArrayList<Object> items;
    private RecyclerView recyclerView;
    private MultiTypeAdapter multiTypeAdapter;
    private M3u8DoneItemViewBinder m3u8DoneItemViewBinder;
    private LinearLayout rlEdit;
    private TextView tvSelect, tvSelectCount;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item_list_layout, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        //读取数据库，获取已经完成的任务
        rlEdit = view.findViewById(R.id.rlEdit);
        tvSelect = view.findViewById(R.id.tvSelect);
        tvSelectCount = view.findViewById(R.id.tvSelectCount);

        m3u8DoneItemViewBinder = new M3u8DoneItemViewBinder();
        recyclerView = view.findViewById(R.id.down_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        multiTypeAdapter = new MultiTypeAdapter();
        multiTypeAdapter.register(M3u8DoneItem.class, m3u8DoneItemViewBinder);
        items = new ArrayList<>();
        multiTypeAdapter.setItems(items);
        recyclerView.setAdapter(multiTypeAdapter);


        initData();
    }

    private void initData() {
        tvSelect.setOnClickListener(this);
        tvSelectCount.setOnClickListener(this);

        DoneDao downingDao = M3U8dbManager.getInstance(getActivity()).doneDao();
        final List<M3u8DoneInfo> daoAll = downingDao.getAll();
        if (daoAll != null && daoAll.size() > 0) {
            for (final M3u8DoneInfo info : daoAll) {
                final LoadingPopupView loadingPopupView = new XPopup.Builder(getActivity()).asLoading("正在处理...");
                M3u8DoneItem doneItem = new M3u8DoneItem(info, new M3u8DoneItemViewBinder.OnItemListener() {
                    @Override
                    public void onLongClick(final M3u8DoneItem m3u8DoneItem, final int index) {
                        if (m3u8DoneItemViewBinder.getEditModel()) {
                            m3u8DoneItemViewBinder.setEditModel(false);
                            multiTypeAdapter.notifyDataSetChanged();
                            rlEdit.setVisibility(View.GONE);
                        } else {
                            rlEdit.setVisibility(View.VISIBLE);
                            m3u8DoneItemViewBinder.setEditModel(true);
                            multiTypeAdapter.notifyDataSetChanged();
                        }

                    }

                    @Override
                    public void onSelect(int selectSize) {
                        tvSelectCount.setText("删除(" + m3u8DoneItemViewBinder.getSelectItem().size() + ")");
                        if (selectSize != 0 && selectSize == daoAll.size()) {
                            tvSelect.setText("取消全选");
                        } else {
                            tvSelect.setText("全选");
                        }
                    }
                });
                items.add(doneItem);
            }
            multiTypeAdapter.notifyDataSetChanged();
        }
    }


    public void refreshList() {
        if (multiTypeAdapter != null && items != null) {
            recyclerView.post(new Runnable() {
                @Override
                public void run() {
                    items.clear();
                    initData();
                    multiTypeAdapter.notifyDataSetChanged();
                }
            });

        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tvSelect) {
            if (m3u8DoneItemViewBinder.isSelectAll()) {
                tvSelect.setText("全选");
                m3u8DoneItemViewBinder.setSelectAll(false);
                multiTypeAdapter.notifyDataSetChanged();
                tvSelectCount.setText("删除(" + m3u8DoneItemViewBinder.getSelectItem().size() + ")");
            } else {
                tvSelect.setText("取消全选");
                m3u8DoneItemViewBinder.setSelectAll(true);
                multiTypeAdapter.notifyDataSetChanged();
                tvSelectCount.setText("删除(" + m3u8DoneItemViewBinder.getSelectItem().size() + ")");
            }

        } else if (v.getId() == R.id.tvSelectCount) {
            final List<M3u8DoneItem> selectItem = m3u8DoneItemViewBinder.getSelectItem();
            if (selectItem.size() != 0) {
                new XPopup.Builder(getActivity()).asConfirm("提示！", "确定删除？", new OnConfirmListener() {
                    @Override
                    public void onConfirm() {
                        List<M3u8DoneItem> deletList = new ArrayList<>();
                        deletList.addAll(selectItem);
                        for (int i = 0; i < deletList.size(); i++) {
                            M3u8DoneItem m3u8DoneItem = deletList.get(i);
                            M3U8DownloaderPro.getInstance().deleteLocal(m3u8DoneItem.getM3u8DoneInfo().getTaskData(), null);
                            DownloadPresenter.DeleteDoneTask(m3u8DoneItem.getM3u8DoneInfo().getTaskId());
                            items.remove(m3u8DoneItem);
                            m3u8DoneItemViewBinder.deleteSlectItem(m3u8DoneItem);
                        }
                        multiTypeAdapter.notifyDataSetChanged();
                        if (items.size() == 0) {
                            rlEdit.setVisibility(View.GONE);
                            tvSelectCount.setText("删除(0)");
                        }
                    }
                }).show();
            }
        }

    }
}
