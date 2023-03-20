package cn.lvdou.vod.ui.home;

import static net.lucode.hackware.magicindicator.ScrollState.SCROLL_STATE_IDLE;
import static org.litepal.LitePalApplication.getContext;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import cn.lvdou.vod.R;
import cn.lvdou.vod.base.BaseItemFragment;
import cn.lvdou.vod.bean.PageResult;
import cn.lvdou.vod.bean.RefreshEvent;
import cn.lvdou.vod.bean.TypeBean;
import cn.lvdou.vod.bean.VodBean;
import cn.lvdou.vod.netservice.ScreenService;
import cn.lvdou.vod.network.RetryWhen;
import cn.lvdou.vod.ui.filtrate.FiltrateResult;
import cn.lvdou.vod.ui.screen.MainRecyclerViewAdapter;
import cn.lvdou.vod.ui.screen.Title;
import cn.lvdou.vod.ui.screen.Titles;
import cn.lvdou.vod.utils.AgainstCheatUtil;
import cn.lvdou.vod.utils.DefaultItemAnimator;
import cn.lvdou.vod.utils.Retrofit2Utils;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class HomeOtherChildFragment2 extends BaseItemFragment<Type> {
    private static final String TAG = "HomeOtherChildFragment2";
    public static HomeOtherChildFragment2 newInstance(int position, Type data) {
        Bundle args = new Bundle();
        //设置当前位置
        args.putInt(key_position, position);
        args.putSerializable(key_data, data);
        HomeOtherChildFragment2 fragment = new HomeOtherChildFragment2();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_screen3;
    }

    private String mClass;
    @BindView(R.id.rv_screen_result)
    RecyclerView rv_screen_result;
    private MainRecyclerViewAdapter result_adapter;
    private List<VodBean> itmes = new ArrayList<>();
    private Titles titles1;
    private Titles titles2;
    private Titles titles3;
    private Titles titles4;
    private FiltrateResult filtrateResult;
    @BindView(R.id.srl_home_other_child)
    SmartRefreshLayout refreshLayout;

    private int mPage = 1;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EventBus.getDefault().register(this);
        initResult();
        getData();
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        //下拉刷新
        SwipeRefreshLayout.OnRefreshListener onRefreshListener;
        refreshLayout.setEnableRefresh(false);
        refreshLayout.setEnableAutoLoadMore(true);
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                mPage = mPage + 1;
                getData();
            }
        });
    }

    private void initResult() {
        MyDividerItemDecoration dividerItemDecoration = new MyDividerItemDecoration(getContext(), RecyclerView.HORIZONTAL, false);
        dividerItemDecoration.setDrawable(getContext().getResources().getDrawable(R.drawable.divider_image));
        rv_screen_result.addItemDecoration(dividerItemDecoration);
        ((SimpleItemAnimator) rv_screen_result.getItemAnimator()).setSupportsChangeAnimations(false);
        rv_screen_result.setItemAnimator(new DefaultItemAnimator());
//        //根据数据类型显示占据的item个数
        rv_screen_result.setNestedScrollingEnabled(false);
        rv_screen_result.setLayoutManager(new MainRecyclerViewAdapter.GridLayoutManager(getContext()));
        result_adapter = new MainRecyclerViewAdapter(getActivity(), rv_screen_result);
//        result_adapter.register(Titles.class, new ScreenClassItemViewBinder(new BaseItemClickListener() {
//            @Override
//            public void onClickItem(View view, Object item) {
//                if (filtrateResult.getList() != null) {
//                    filtrateResult.getList().clear();
//                }
//                result_adapter.notifyDataSetChanged();
//                mPage = 1;
//                getData();
//            }
//        }));


        //滑动加载
        rv_screen_result.addOnScrollListener(new RecyclerView.OnScrollListener() {

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (!recyclerView.canScrollVertically(1) ||
                        !recyclerView.canScrollVertically(-1)) {
                    refreshLayout.setEnabled(true);
                } else {
                    refreshLayout.setEnabled(false);
                }
            }

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                // 查看源码可知State有三种状态：SCROLL_STATE_IDLE（静止）、SCROLL_STATE_DRAGGING（上升）、SCROLL_STATE_SETTLING（下落）
                if (newState == SCROLL_STATE_IDLE) { // 滚动静止时才加载图片资源，极大提升流畅度
                    //    result_adapter.setScrolling(false);
                    //    result_adapter.notifyDataSetChanged(); // notify调用后onBindViewHolder会响应调用
                } else
                    //    result_adapter.setScrolling(true);
                    super.onScrollStateChanged(recyclerView, newState);
            }
        });

        titles2 = new Titles();
        String[] zlasss = _data.getExtend().getZlass().split(",");
        List<Title> list = new ArrayList<>();
        list.add(new Title("全部", ""));
        for (String s : zlasss) {
            list.add(new Title(s, s));
        }
        titles2.setTitles(list);
        titles2.setCurTitle(titles2.getTitles().get(0));


        titles1 = new Titles();
        String[] area = _data.getExtend().getArea().split(",");
        List<Title> list2 = new ArrayList<>();
        list2.add(new Title("全部", ""));
        for (String s : area) {
            list2.add(new Title(s, s));
        }
        titles1.setTitles(list2);
        titles1.setCurTitle(titles1.getTitles().get(0));

        titles3 = new Titles();
        String[] years = _data.getExtend().getYear().split(",");
        List<Title> list3 = new ArrayList<>();
        list3.add(new Title("全部", ""));
        for (String s : years) {
            list3.add(new Title(s, s));
        }
        titles3.setTitles(list3);
        titles3.setCurTitle(titles3.getTitles().get(0));

        titles4 = new Titles();

        List<Title> list4 = new ArrayList<>();
        list4.add(new Title("最多播放", "hits"));
        list4.add(new Title("最近更新", "time"));
        list4.add(new Title("最多收藏", "store_num"));
        list4.add(new Title("最高评分", "score"));
        titles4.setTitles(list4);

        result_adapter.setHeader(titles1, titles2, titles3, titles4);
        result_adapter.setDataList(itmes);
        rv_screen_result.setAdapter(result_adapter);
    }

    private ScreenService screenService;
    private Disposable disposable;
    private void getData() {
        if (screenService == null) {
            screenService = Retrofit2Utils.INSTANCE.createByGson(ScreenService.class);
        }
        if (AgainstCheatUtil.showWarn(screenService)) {
            refreshLayout.finishLoadMore();
            return;
        }

        String title4 = "";
        if (titles4.getCurTitle() != null) {
            title4 = titles4.getCurTitle().getValue();
        }
        Log.d(TAG, "getData: "+title4);
        screenService.getVodList(_data.getTypeId(), titles2.getCurTitle().getValue(), "", titles1.getCurTitle().getValue(), titles3.getCurTitle().getValue(), title4, mPage, 9)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .onTerminateDetach()
                .retryWhen(new RetryWhen(3, 3))
                .subscribe(new Observer<PageResult<VodBean>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        if (disposable != null && !disposable.isDisposed()) {
                            disposable.dispose();
                            disposable = null;
                        }
                        disposable = d;
                    }

                    @Override
                    public void onNext(PageResult<VodBean> result) {
                        if (result != null) {
                            if (result.isSuccessful()) {
                                List<VodBean> list = result.getData().getList();
                                if (list == null || list.size() < 1) {
                                } else {
                                    setResultData(list);
                                }
                            }
                        }
//                        result_adapter.notifyDataSetChanged();
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        result_adapter.notifyDataSetChanged();
                    }

                    @Override
                    public void onComplete() {
                        if (refreshLayout != null) refreshLayout.finishLoadMore(200);
                    }
                });
    }

    private void setResultData(List<VodBean> list) {
        if (list != null) {
            if (mPage == 1) {
                itmes.clear();
            }
            itmes.addAll(list);
            result_adapter.setDataList(itmes);
            result_adapter.notifyDataSetChanged();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void onEvent(RefreshEvent event) {
//        result_adapter.setHeader(titles1, titles2, titles3, titles4);
//        result_adapter.notifyDataSetChanged();
        mPage = 1;
        getData();
    }

    @Override
    public void onPause() {
        super.onPause();
        if (disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
            disposable = null;
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
