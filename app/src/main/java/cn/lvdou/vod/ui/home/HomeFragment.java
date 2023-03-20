package cn.lvdou.vod.ui.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.CacheDiskStaticUtils;
import com.blankj.utilcode.util.LogUtils;

import com.blankj.utilcode.util.StringUtils;
import com.google.android.material.tabs.TabLayout;
import com.sunfusheng.marqueeview.MarqueeView;
//import com.sunfusheng.marqueeview.MarqueeView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

import butterknife.BindView;
import butterknife.OnClick;
import cn.lvdou.vod.R;
import cn.lvdou.vod.base.BackMainFragment;
import cn.lvdou.vod.base.BaseMainFragment;
import cn.lvdou.vod.bean.BaseResult;
import cn.lvdou.vod.bean.Page;
import cn.lvdou.vod.bean.PageResult;
import cn.lvdou.vod.bean.PlayLogBean;
import cn.lvdou.vod.bean.PlayScoreBean;
import cn.lvdou.vod.bean.StartBean;
import cn.lvdou.vod.bean.TypeBean;
import cn.lvdou.vod.entity.AdvEntity;
import cn.lvdou.vod.netservice.TypeService;
import cn.lvdou.vod.netservice.VodService;
import cn.lvdou.vod.network.RetryWhen;
import cn.lvdou.vod.ui.down.AllDownloadActivity;
import cn.lvdou.vod.ui.login.LoginActivity;
import cn.lvdou.vod.ui.play.PlayActivity;
import cn.lvdou.vod.ui.score.PlayScoreActivity;
import cn.lvdou.vod.ui.screen.ScreenActivity3;
import cn.lvdou.vod.ui.seek.SeekActivity;
import cn.lvdou.vod.utils.AgainstCheatUtil;
import cn.lvdou.vod.utils.LoginUtils;
import cn.lvdou.vod.utils.MMkvUtils;
import cn.lvdou.vod.utils.Retrofit2Utils;
import cn.lvdou.vod.utils.UserUtils;
import cn.lvdou.vod.wqddg.MyLog;
import cn.lvdou.vod.wqddg.Wqddg_Code;
import cn.lvdou.vod.bean.Wqddg_items;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.ResourceObserver;
import io.reactivex.schedulers.Schedulers;

public class HomeFragment extends BaseMainFragment implements BackMainFragment {

    @SuppressWarnings("WeakerAccess")
    public static volatile int mPosition;
    private List<TypeBean> typeBeans;
    private boolean isInit = false;

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.iv_home_top_bg)
    ImageView iv_home_top_bg;

//    @SuppressLint("NonConstantResourceId")
//    @BindView(R.id.iv_item_banner)
//    ImageView iv_item_banner;

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.wqddg_line)
    LinearLayout wqddg_line;

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.tv_home_seek)
    MarqueeView tv_home_seek;

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.tv_home_all)
    TextView tv_home_all;

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.iv_home_history)
    ImageView iv_home_history;

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.iv_home_download)
    ImageView iv_home_download;

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.tl_home)
    TabLayout tl_home;

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.conPlayHis)
    ConstraintLayout conPlayHis;

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.imgClosHis)
    ImageView imgClosHis;

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.tvHis)
    TextView tvHis;

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.tvHis1)
    TextView tvHis1;

    private PagerFragmentAdapter pagerFragmentAdapter;
    public static final String KEY_START_BEAN = "KEY_START_BEAN";

    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.vp_home)
    ViewPager vp_home;
    private int start = 0;
    private int time = 5;
    private Wqddg_items bean;
    private List<String> search_hot;

    public HomeFragment() {
    }

    public static HomeFragment newInstance() {
        Bundle args = new Bundle();
        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutResID() {
        return R.layout.fragment_home;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initData();
        search_hot();
    }

    private void initData() {
        wqddg_line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityUtils.startActivity(SeekActivity.class);
            }
        });
        tv_home_seek.setOnItemClickListener(new MarqueeView.OnItemClickListener() {
            @Override
            public void onItemClick(int position, TextView textView) {
                ActivityUtils.startActivity(SeekActivity.class);
            }
        });
    }

    private void search_hot() {
        StartBean startBean = MMkvUtils.Companion.Builds().loadStartBean("");
        if (startBean != null && startBean.getSearch_hot() != null) { //存在热搜词
            search_hot = startBean.getSearch_hot();
        }
        if (search_hot.size() == 0) { //获取不到热搜词的话定义一个
            search_hot = new ArrayList<>();
            search_hot.add("想看什么搜一下吧");
            search_hot.add("热门影视想看就看");
            search_hot.add("全网影视一触即发");
        }
        tv_home_seek.startWithList(search_hot);
        tv_home_seek.startWithList(search_hot, R.anim.anim_bottom_in, R.anim.anim_top_out);
    }

    @Override
    public void onResume() {
        super.onResume();
        EventBus.getDefault().register(HomeFragment.this);
        if (!isInit) getData();
    }

    @SuppressWarnings("unused")
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void setTopBarBg(TopBarEvent event) {
//        iv_home_top_bg.setImageBitmap(event.getTopBarBg());
//        iv_item_banner.setImageBitmap(event.getTopBarBg());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void gonePlayHistory(String msg) {
        if (msg.equals("隐藏播放历史")) {
            conPlayHis.setVisibility(View.GONE);
        }
    }

    @Override
    public void onPause() {
        EventBus.getDefault().unregister(HomeFragment.this);
        //conPlayHis.setVisibility(View.GONE);
        super.onPause();
        stopGet();
    }

    private View oldView;
    private TabLayout.Tab oldTab;

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
    }

    private void initView() {
        AdvEntity adv = MMkvUtils.Companion.Builds().loadAdvEntity("");
        if (adv != null) {
            if (adv.getHome_history()) {
                getPlayHistory();
            }
        }
        vp_home.setAdapter(pagerFragmentAdapter = new PagerFragmentAdapter(getChildFragmentManager(), "推荐"));
        tl_home.setupWithViewPager(vp_home);
        TabLayout.OnTabSelectedListener onTabSelectedListener;
        tl_home.addOnTabSelectedListener(onTabSelectedListener = new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                LogUtils.e("选项卡切换！" + tab.toString());
                if (tab != oldTab) {
                    oldTab = tab;
                    if (oldView != null) oldView.animate().scaleX(1).scaleY(1).start();
                    LinearLayout linearLayout = tab.view;
                    linearLayout.setClipChildren(false);
                    linearLayout.setClipToPadding(false);
                    View view = linearLayout.getChildAt(1);
                    view.animate().scaleX(1.3f).scaleY(1.3f).start();
                    mPosition = tab.getPosition();
                    if (mPosition == 0) {
                        EventBus.getDefault().post("隐藏播放历史");
                        iv_home_history.setVisibility(View.VISIBLE);
                        iv_home_download.setVisibility(View.VISIBLE);
                        tv_home_all.setVisibility(View.GONE);
                    } else {
                        EventBus.getDefault().post("隐藏播放历史");
                        iv_home_history.setVisibility(View.GONE);
                        iv_home_download.setVisibility(View.GONE);
                        tv_home_all.setVisibility(View.VISIBLE);
                    }
                    oldView = view;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        TabLayout.Tab tab = tl_home.getTabAt(0);
        if (tab != null) {
            onTabSelectedListener.onTabSelected(tab);
        }
    }

    private void getPlayHistory() {
        if (UserUtils.isLogin()) {
            Retrofit2Utils instance = Retrofit2Utils.INSTANCE;
            VodService vodService = instance.createByGson(VodService.class);
            if (AgainstCheatUtil.showWarn(vodService)) {
                return;
            }
            assert vodService != null;
            vodService.getPlayLogList("1", "12")
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .onTerminateDetach()
                    .subscribe(new Observer<BaseResult<Page<PlayLogBean>>>() {
                        @Override
                        public void onSubscribe(@io.reactivex.annotations.NonNull Disposable d) {
                            if (hisToryDisposable != null && !hisToryDisposable.isDisposed()) {
                                hisToryDisposable.dispose();
                                hisToryDisposable = null;
                            }
                            hisToryDisposable = d;
                        }

                        @SuppressLint("SetTextI18n")
                        @Override
                        public void onNext(@io.reactivex.annotations.NonNull BaseResult<Page<PlayLogBean>> pageBaseResult) {
                            System.out.println(pageBaseResult.toString());
                            System.out.println(222222);
                            if (pageBaseResult.getData() != null && pageBaseResult.getData().getList().size() > 0) {
                                List<PlayLogBean> list = pageBaseResult.getData().getList();
                                PlayScoreBean playScoreBean = new PlayScoreBean();
                                playScoreBean.setVodName(list.get(0).getVod_name());
                                playScoreBean.setVodImgUrl(list.get(0).getVod_pic());
                                if (list.get(0).getPercent().equals("NaN")) {
                                    playScoreBean.setPercentage(0.0f);
                                } else {
                                    try {
                                        playScoreBean.setPercentage(Float.valueOf(list.get(0).getPercent()));
                                    } catch (Exception e) {
                                    }
                                }
                                playScoreBean.setTypeId(list.get(0).getType_id());
                                playScoreBean.setVodId(Integer.valueOf(list.get(0).getVod_id()));
                                playScoreBean.setSelect(false);
                                playScoreBean.setVodSelectedWorks(list.get(0).getNid());
                                playScoreBean.setUrlIndex(list.get(0).urlIndex);
                                playScoreBean.setCurProgress(list.get(0).curProgress);
                                playScoreBean.setPlaySourceIndex(list.get(0).playSourceIndex);
                                tvHis.setText(" 上次观看 : " + list.get(0).getVod_name() + list.get(0).getNid());
                                conPlayHis.setVisibility(View.VISIBLE);
                                imgClosHis.setOnClickListener(v -> conPlayHis.setVisibility(View.GONE));
                                conPlayHis.setOnClickListener(v -> {
                                    conPlayHis.setVisibility(View.GONE);
                                    MMkvUtils.Companion.Builds().savePlayScore(playScoreBean);
                                    PlayActivity.startByPlayScore(playScoreBean.getVodId());
                                });
                                tvHis1.setText("继续观看");
                                conPlayHis.setVisibility(View.VISIBLE);
                                imgClosHis.setOnClickListener(v -> conPlayHis.setVisibility(View.GONE));
                                conPlayHis.setOnClickListener(v -> {
                                    conPlayHis.setVisibility(View.GONE);
                                    MMkvUtils.Companion.Builds().savePlayScore(playScoreBean);
                                    PlayActivity.startByPlayScore(playScoreBean.getVodId());
                                });
                            }
                        }

                        @Override
                        public void onError(@io.reactivex.annotations.NonNull Throwable e) {
                            e.printStackTrace();
                        }

                        @Override
                        public void onComplete() {

                        }
                    });
        }
    }

    private Disposable disposable;
    private Disposable hisToryDisposable;

    private void getData() {
        isInit = false;
        TypeService typeService = Retrofit2Utils.INSTANCE.createByGson(TypeService.class);
        if (AgainstCheatUtil.showWarn(typeService)) {
            return;
        }
        assert typeService != null;
        typeService.getTypeList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .onTerminateDetach()
                .retryWhen(new RetryWhen(3, 3))
                .subscribe(new Observer<PageResult<TypeBean>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        if (disposable != null && !disposable.isDisposed()) {
                            disposable.dispose();
                            disposable = null;
                        }
                        disposable = d;
                    }

                    @Override
                    public void onNext(PageResult<TypeBean> result) {
                        if (result != null) {
                            if (result.isSuccessful()) {
                                isInit = true;
                                List<TypeBean> list = result.getData().getList();
                                List<TypeBean> newList = new ArrayList<>();
                                ArrayList<Integer> sortList = new ArrayList<>();
                                for (TypeBean bean : list) {
                                    sortList.add(bean.getType_sort());
                                }
                                Collections.sort(sortList);

                                for (int i = 0; i < sortList.size(); i++) {
                                    for (int j = 0; j < list.size(); j++) {
                                        TypeBean bean = list.get(j);
                                        if (sortList.get(i) == bean.getType_sort()) {
                                            newList.add(bean);
                                        }
                                    }
                                }
                                typeBeans = newList;
                                if (pagerFragmentAdapter != null) {
                                    pagerFragmentAdapter.addData(newList);
                                }
                            }
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onComplete() {
                    }
                });
    }

    private void stopGet() {
        if (disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
            disposable = null;
        }
        if (hisToryDisposable != null && !hisToryDisposable.isDisposed()) {
            hisToryDisposable.dispose();
            hisToryDisposable = null;
        }
    }

    @SuppressLint("NonConstantResourceId")
    @OnClick(R.id.tv_home_all)
    void allScreen() {
        if (typeBeans != null && (mPosition - 1) < typeBeans.size()) {
            ScreenActivity3.start("", typeBeans.get(mPosition - 1));
        }
    }

    @SuppressLint("NonConstantResourceId")
    @OnClick(R.id.iv_home_history)
    void playScore() {
        if (UserUtils.isLogin()) {
            ActivityUtils.startActivity(PlayScoreActivity.class);
        } else {
            ActivityUtils.startActivity(LoginActivity.class);
        }
    }

    @SuppressLint("NonConstantResourceId")
    @OnClick(R.id.iv_home_download)
    void clickDownload() {
        if (LoginUtils.checkLogin(getActivity())) {
            AllDownloadActivity.Companion.start(getActivity());
        }

    }

    @Override
    public boolean onBackPressedSupport() {
        if (tl_home != null && tl_home.getSelectedTabPosition() != 0) {
            TabLayout.Tab tab = tl_home.getTabAt(0);
            if (tab != null) {
                tab.select();
                return true;
            }
        }
        return super.onBackPressedSupport();
    }

}
