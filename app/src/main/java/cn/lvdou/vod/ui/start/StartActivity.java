package cn.lvdou.vod.ui.start;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.CacheDiskStaticUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.StringUtils;
import com.github.StormWyrm.wanandroid.base.net.RequestManager;
import com.google.gson.Gson;
import com.youxiao.ssp.ad.bean.SSPAd;
import com.youxiao.ssp.ad.core.AdClient;
import com.youxiao.ssp.ad.listener.AdLoadAdapter;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import java.util.Objects;
import butterknife.BindView;
import butterknife.OnClick;
import cn.lvdou.vod.ApiConfig;
import cn.lvdou.vod.MainActivity;
import cn.lvdou.vod.R;
import cn.lvdou.vod.ad.AdClickListener;
import cn.lvdou.vod.ad.AdWebView;
import cn.lvdou.vod.base.BaseActivity;
import cn.lvdou.vod.base.exception.ResponseException;
import cn.lvdou.vod.base.observer.BaseObserver;
import cn.lvdou.vod.bean.AppConfigBean;
import cn.lvdou.vod.bean.BaseResult;
import cn.lvdou.vod.bean.CloseSplashEvent;
import cn.lvdou.vod.bean.PageResult;
import cn.lvdou.vod.bean.SpecialtTopicBean;
import cn.lvdou.vod.bean.StartBean;
import cn.lvdou.vod.download.SPKey;
import cn.lvdou.vod.entity.AdvEntity;
import cn.lvdou.vod.netservice.StartService;
import cn.lvdou.vod.netservice.TopicService;
import cn.lvdou.vod.netservice.VodService;
import cn.lvdou.vod.network.RetryWhen;
import cn.lvdou.vod.ui.login.LoginActivity;
import cn.lvdou.vod.utils.AgainstCheatUtil;
import cn.lvdou.vod.utils.MMkvUtils;
import cn.lvdou.vod.utils.Retrofit2Utils;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class StartActivity extends BaseActivity {

    public static final String KEY_START_BEAN = "KEY_START_BEAN";
    private static final String TAG = "start";

    private String ad_str;
    private Disposable disposable;
    private StartService startService;
    private Disposable disposable1;

    @BindView(R.id.awv_start)
    AdWebView webView;
    @BindView(R.id.tv_start)
    TextView textView;
    @BindView(R.id.iv_image)
    ImageView imageView;
    @BindView(R.id.tv_load)
    TextView loadTv;
    @BindView(R.id.start_frame)
    ViewGroup start_frame;

    private AdClient adClient;
    private boolean isInit = false;
    private static final int MAX_TIME = 5;
    private int start_time = MAX_TIME;
    private Handler handler = new Handler();
    private boolean isClosed = false;
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            setTime(start_time);
            start_time -= 1;
            if (start_time >= 0 && !isClosed) {
                handler.postDelayed(runnable, 1000);
            } else {
                gotoMain();
            }
        }
    };

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_start;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_Launcher);
        super.onCreate(savedInstanceState);
        adClient = new AdClient(getMActivity());
//        EventBus.getDefault().register(this);
//        getAppConfig();
//        BarUtils.setStatusBarVisibility(this, false);
//        BarUtils.setNavBarVisibility(this, false);
    }

    private void goooo() {
        EventBus.getDefault().register(StartActivity.this);
        getAppConfig();
        BarUtils.setStatusBarVisibility(StartActivity.this, false);
        BarUtils.setNavBarVisibility(StartActivity.this, false);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("xxxxxxx", "startbean========001onResume");
        if (!isInit) getStartData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    private void getStartData() {
        Log.i("xxxxxxx", "startbean========001");
        if (startService == null) {
            startService = Retrofit2Utils.INSTANCE.createByGson(StartService.class);
        }
        if (AgainstCheatUtil.showWarn(startService)) {
            return;
        }
        startService.getStartBean()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .onTerminateDetach()
                .retryWhen(new RetryWhen(3, 30))
                .subscribe(new Observer<BaseResult<StartBean>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.i("xxxxxxx", "disposable========haha111");
                        if (disposable != null && !disposable.isDisposed()) {
                            disposable.dispose();
                            disposable = null;
                        }
                        disposable = d;
                    }

                    @Override
                    public void onNext(@NonNull BaseResult<StartBean> result) {
                        Log.i("xxxxxxx", "startbean========haha111");
                        if (result != null) {
                            Log.i("xxxxxxx", "startbean========111");
                            if (result.isSuccessful()) {
                                Log.i("xxxxxxx", "startbean========222");
                                if (result.getData() != null) {
                                    Log.i("xxxxxxx", "startbean========333");
                                    StartBean startBean = result.getData();
                                    CacheDiskStaticUtils.put(KEY_START_BEAN, startBean);
                                    if (startBean != null) {
                                        StartBean.Ads ads = startBean.getAds();
                                        VodService vodService2 = Retrofit2Utils.INSTANCE.createByGson(VodService.class);
                                        RequestManager.execute(vodService2.getAdv(),
                                                new BaseObserver<AdvEntity>() {
                                                    @Override
                                                    public void onSuccess(AdvEntity data) {
                                                        MMkvUtils.Companion.Builds().saveAdvEntity(data);
                                                    }

                                                    @Override
                                                    public void onError(@NotNull ResponseException e) {

                                                    }
                                                }
                                        );


                                        StartBean.Ads newAds = startBean.getAds();
                                        StartBean.Ads oldAds = new StartBean.Ads();
                                        Gson gson = new Gson();

                                        String indexGet = SPUtils.getInstance().getString(SPKey.AD_INDEX);
                                        StartBean.Ad oldIndex = gson.fromJson(indexGet, StartBean.Ad.class);
                                        String cartoonGet = SPUtils.getInstance().getString(SPKey.AD_CARTOON);
                                        StartBean.Ad oldCartoon = gson.fromJson(cartoonGet, StartBean.Ad.class);
                                        String sitcomGet = SPUtils.getInstance().getString(SPKey.AD_SITCOM);
                                        StartBean.Ad oldSitcom = gson.fromJson(sitcomGet, StartBean.Ad.class);
                                        String vodGet = SPUtils.getInstance().getString(SPKey.AD_VOD);
                                        StartBean.Ad oldVod = gson.fromJson(vodGet, StartBean.Ad.class);
                                        String searcherGet = SPUtils.getInstance().getString(SPKey.AD_SEARCHER);
                                        StartBean.Ad oldSearcher = gson.fromJson(searcherGet, StartBean.Ad.class);
                                        String varietyGet = SPUtils.getInstance().getString(SPKey.AD_VARIETY);
                                        StartBean.Ad oldVariety = gson.fromJson(varietyGet, StartBean.Ad.class);

                                        oldAds.setIndex(oldIndex);
                                        oldAds.setCartoon(oldCartoon);
                                        oldAds.setSitcom(oldSitcom);
                                        oldAds.setVod(oldVod);
                                        oldAds.setSearcher(oldSearcher);
                                        oldAds.setVariety(oldVariety);

                                        MMkvUtils.Companion.Builds().saveStartBean(startBean);

                                        if (newAds != null) {
                                            StartBean.Ad index = newAds.getIndex();

                                            if (newAds.getIndex().getDescription() == null || newAds.getIndex().getDescription().isEmpty()) {
                                                if (oldAds.getIndex() != null && oldAds.getIndex().getDescription() != null && !oldAds.getIndex().getDescription().isEmpty()) {
                                                    index.setDescription(oldAds.getIndex().getDescription());
                                                }
                                            }
                                            String indexStr = gson.toJson(newAds.getIndex(), StartBean.Ad.class);
                                            SPUtils.getInstance().put(SPKey.AD_INDEX, indexStr);


                                            StartBean.Ad cartoon = newAds.getCartoon();
                                            if (newAds.getCartoon().getDescription() == null || newAds.getCartoon().getDescription().isEmpty()) {
                                                if (oldAds.getCartoon() != null && oldAds.getCartoon().getDescription() != null && !oldAds.getCartoon().getDescription().isEmpty()) {
                                                    cartoon.setDescription(oldAds.getCartoon().getDescription());
                                                }
                                            }
                                            String cartoonStr = gson.toJson(newAds.getCartoon(), StartBean.Ad.class);
                                            SPUtils.getInstance().put(SPKey.AD_CARTOON, cartoonStr);


                                            StartBean.Ad sitcom = newAds.getSitcom();
                                            if (newAds.getSitcom().getDescription() == null || newAds.getSitcom().getDescription().isEmpty()) {
                                                if (oldAds.getSitcom() != null && oldAds.getSitcom().getDescription() != null && !oldAds.getSitcom().getDescription().isEmpty()) {
                                                    sitcom.setDescription(oldAds.getSitcom().getDescription());
                                                }
                                            }
                                            String sitcomStr = gson.toJson(newAds.getSitcom(), StartBean.Ad.class);
                                            SPUtils.getInstance().put(SPKey.AD_SITCOM, sitcomStr);


                                            StartBean.Ad vod = newAds.getVod();
                                            if (newAds.getVod().getDescription() == null || newAds.getVod().getDescription().isEmpty()) {
                                                if (oldAds.getVod() != null && oldAds.getVod().getDescription() != null && !oldAds.getVod().getDescription().isEmpty()) {
                                                    vod.setDescription(oldAds.getVod().getDescription());
                                                }
                                            }
                                            String vodStr = gson.toJson(newAds.getVod(), StartBean.Ad.class);
                                            SPUtils.getInstance().put(SPKey.AD_VOD, vodStr);


                                            StartBean.Ad searcher = newAds.getSearcher();
                                            if (newAds.getSearcher().getDescription() == null || newAds.getSearcher().getDescription().isEmpty()) {
                                                if (oldAds.getSearcher() != null && oldAds.getSearcher().getDescription() != null && !oldAds.getSearcher().getDescription().isEmpty()) {
                                                    searcher.setDescription(oldAds.getSearcher().getDescription());
                                                }
                                            }
                                            String searcherStr = gson.toJson(newAds.getSearcher(), StartBean.Ad.class);
                                            SPUtils.getInstance().put(SPKey.AD_SEARCHER, searcherStr);


                                            StartBean.Ad variety = newAds.getVariety();
                                            if (newAds.getVariety().getDescription() == null || newAds.getVariety().getDescription().isEmpty()) {
                                                if (oldAds.getVariety() != null && oldAds.getVariety().getDescription() != null && !oldAds.getVariety().getDescription().isEmpty()) {
                                                    variety.setDescription(oldAds.getVariety().getDescription());
                                                }
                                            }
                                            String varietyStr = gson.toJson(newAds.getVariety(), StartBean.Ad.class);
                                            SPUtils.getInstance().put(SPKey.AD_VARIETY, varietyStr);

                                            if (MMkvUtils.Companion.Builds().loadStartBean("") != null) {
                                                StartBean startBean1 = MMkvUtils.Companion.Builds().loadStartBean("");

                                                startBean1.setAds(newAds);
                                                MMkvUtils.Companion.Builds().saveStartBean(startBean1);
                                            }
                                            MMkvUtils.Companion.Builds().saveSearchHot(startBean.getSearch_hot());
                                            if (ads != null) {
                                                StartBean.Ad ad = ads.getStartup_adv();
                                                if (ad != null) {
                                                    ad_str = ad.getDescription();
                                                    if (ad.getStatus() == 0) {
                                                        gotoMain();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    assert startBean != null;
                                    if (startBean.getAds().getCsj_startup_adv() != null && startBean.getAds().getCsj_startup_adv().getStatus() == 1) {
                                        adClient.requestSplashAd(start_frame, "10802", new AdLoadAdapter() {
                                            @Override
                                            public void onError(int i, String s) { //拉取广告失败
                                                goooo();
                                            }

                                            @Override
                                            public void onAdDismiss(SSPAd ad) { //进入主页
                                                super.onAdDismiss(ad);
                                                gotoMain();
                                                //广告关闭（ 开屏广告展示时间到或用户点击跳转） ， 跳转主页
                                            }
                                        });
                                    }else{
                                        goooo();
                                    }
                                }
                            }
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        Log.i("xxxxxxx", "startbean========555" + e.getMessage());
                        init();
                    }

                    @Override
                    public void onComplete() {
                        init();
                    }
                });

    }

    private void stopGet() {
        if (disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
            disposable.dispose();
        }
    }

    private void init() {
        if (StringUtils.isEmpty(ad_str)) return;
        webView.setVisibility(View.VISIBLE);
        LogUtils.e(ad_str);

        isInit = true;
        webView.isforceFullScreen(true);
        webView.addAdClickListener(new AdClickListener() {
            @Override
            public void onAdClick(String url) {
                isClosed = true;
                handler.removeCallbacks(runnable);
            }
        });
        webView.loadHtmlBody(ad_str);
    }

    private void cancleImage() {
        ValueAnimator anim = ValueAnimator.ofFloat(1, 0);
        anim.setDuration(500);
        anim.setRepeatCount(0);
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                if (imageView != null) {
                    imageView.setAlpha((Float) animation.getAnimatedValue());
                    loadTv.setAlpha((Float) animation.getAnimatedValue());
                }
                System.out.println("onAnimationUpdate " + (Float) animation.getAnimatedValue());
            }
        });
        anim.start();
    }

    private void setTime(int i) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (textView != null) {
                    textView.setText(StringUtils.getString(R.string.skip, i));
                }
            }
        });
    }

    private boolean GenuineVerification() {

        if (MMkvUtils.Companion.Builds().loadStartBean("") == null) {
            Toast.makeText(mActivity, "网络链接错误0。。", Toast.LENGTH_LONG).show();
            Log.e(TAG, "checkversion: 网络链接错误0..");
            return true;
        }
        StartBean.Comment com = Objects.requireNonNull(MMkvUtils.Companion.Builds().loadStartBean("")).getComment();
        if (com != null) {
            if (!com.getSg().contains("o/")) {
                Toast.makeText(mActivity, "网络链接错误1。。", Toast.LENGTH_LONG).show();
                Log.e(TAG, com.getSg());
                return true;
            }

            if (!com.getSg().contains("a/")) {
                Toast.makeText(mActivity, "网络链接错误2。。", Toast.LENGTH_LONG).show();
                Log.e(TAG, "checkversion: 网络链接错误2..");
                return true;
            }

            if (com.getSg() == null || com.getSg().equals("")) {
                Toast.makeText(mActivity, "网络链接错误3。。", Toast.LENGTH_LONG).show();
                Log.e(TAG, "checkversion: 网络链接错误3..");
                return true;
            }


            byte[] sgb = Base64.decode(com.getSg().replaceAll("(o/)|(a/)|(c/)|/", "").getBytes(), Base64.DEFAULT);
            String sg = new String(sgb);
            if (!sg.equals(ApiConfig.MOGAI_BASE_URL)) {
                Toast.makeText(mActivity, "网络链接错误4。。", Toast.LENGTH_LONG).show();
                Log.e(TAG, "checkversion: 网络链接错误4..");
                return true;
            }

        } else {
            Toast.makeText(mActivity, "连接成功", Toast.LENGTH_LONG);
            return true;
        }
        return false;
    }

    private void gotoMain() {
        isClosed = true;
        handler.removeCallbacks(runnable);
        stopGet();
        String PASSWD = MMkvUtils.Buildsx().loadAccount2();
        Log.d("密码", PASSWD);
        if (PASSWD.length() != 0) {
            ActivityUtils.startActivity(MainActivity.class);
        } else {
            ActivityUtils.startActivity(LoginActivity.class);
        }
        finish();
    }

    @SuppressLint("NonConstantResourceId")
    @OnClick(R.id.tv_start)
    void missAd() {
        isClosed = true;
        handler.removeCallbacks(runnable);
        stopGet();
        String PASSWD = MMkvUtils.Buildsx().loadAccount2();
        Log.d("密码", PASSWD);
        if (PASSWD.length() != 0) {
            ActivityUtils.startActivity(MainActivity.class);
        } else {
            ActivityUtils.startActivity(LoginActivity.class);
        }
        finish();
    }

    public void getAppConfig() {
        VodService vodService = Retrofit2Utils.INSTANCE.createByGson(VodService.class);
        if (AgainstCheatUtil.showWarn(vodService)) {
            return;
        }
        RequestManager.execute(
                this, vodService.getPlayAd(2 + ""),
                new BaseObserver<AppConfigBean>() {
                    @Override
                    public void onSuccess(AppConfigBean data) {
                        MMkvUtils.Companion.Builds().saveAppConfigAd(data);
                    }

                    @Override
                    public void onError(@NotNull ResponseException e) {

                    }
                }
        );

        //获取标签状态
        RequestManager.execute(
                this, vodService.getPlayAd(1 + ""),
                new BaseObserver<AppConfigBean>() {
                    @Override
                    public void onSuccess(AppConfigBean data) {
                        MMkvUtils.Companion.Builds().saveAppConfig(data);
                    }

                    @Override
                    public void onError(@NotNull ResponseException e) {

                    }
                }
        );

    }

    private void getTopicData() {
        TopicService cardService = Retrofit2Utils.INSTANCE.createByGson(TopicService.class);
        if (AgainstCheatUtil.showWarn(cardService)) {
            return;
        }
        cardService.getTopicList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .onTerminateDetach()
                .retryWhen(new RetryWhen(3, 3))
                .subscribe(new Observer<PageResult<SpecialtTopicBean>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        if (disposable1 != null && !disposable1.isDisposed()) {
                            disposable1.dispose();
                            disposable1 = null;
                        }
                        disposable1 = d;
                    }

                    @Override
                    public void onNext(PageResult<SpecialtTopicBean> result) {
                        if (result != null) {
                            if (result.isSuccessful()) {
                                List<SpecialtTopicBean> list = result.getData().getList();
//                                topicEntities.clear();
//                                topicEntities.addAll(list);
//                                activityLevelAdpter.notifyDataSetChanged();
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

    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void onCloseEvent(CloseSplashEvent event) {
        start_time = MAX_TIME;
        setTime(start_time);
        handler.postDelayed(runnable, 1000);
        cancleImage();
    }

}
