package cn.lvdou.vod;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.WindowManager;
import com.dpuntu.downloader.DownloadManager;
import com.dpuntu.downloader.Downloader;
import com.dueeeke.videoplayer.player.VideoViewConfig;
import com.dueeeke.videoplayer.player.VideoViewManager;
import com.orhanobut.hawk.Hawk;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.DefaultRefreshFooterCreator;
import com.scwang.smartrefresh.layout.api.DefaultRefreshHeaderCreator;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.tencent.mmkv.MMKV;
import com.tencent.smtt.sdk.QbSdk;
import com.umeng.commonsdk.UMConfigure;
import com.youxiao.ssp.core.SSPSdk;
import org.litepal.LitePal;
import org.xutils.x;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import cn.lvdou.av.play.MyIjkPlayerFactory;
import cn.lvdou.vod.base.BaseApplication;
import cn.lvdou.vod.download.GetFileSharePreance;
import io.reactivex.functions.Consumer;
import io.reactivex.plugins.RxJavaPlugins;
import jaygoo.library.m3u8downloader.M3U8Library;

public class App extends BaseApplication {
    @SuppressLint("StaticFieldLeak")
    private static App vocApp;
    private static final String TAG = "App";
    public static String SDKID = "";  //媒体ID
    public static String UMENG_KEY = ""; //友盟统计
//    public static String BASE_URL = "";
    public static String BASE_URL = "http://www.ax196.top:81";
    private static WeakReference<App> weakReference;
    public static List<Downloader> downloaders = new ArrayList<>();
    public static App getInstance() {
        return weakReference.get();
    }
    public static App getApplication() {
        return vocApp;
    }

    // 页面刷新代码 static 代码段可以防止内存泄露
    static {
        //设置全局的Footer构建器
        SmartRefreshLayout.setDefaultRefreshFooterCreator(new DefaultRefreshFooterCreator() {
            @Override
            public RefreshFooter createRefreshFooter(Context context, RefreshLayout layout) {
                return new ClassicsFooter(context);
            }
        });
    }

    @Override
    public void onCreate() {
        super.onCreate();
        xtwinit();
        try {
            setRxJavaErrorHandler();
        } catch (Exception e) {
        }
        //setTypeface();
        LitePal.initialize(this);
        UMConfigure.init(this, UMENG_KEY, "lvdoui", UMConfigure.DEVICE_TYPE_PHONE, "");
        weakReference = new WeakReference<>(this);
        vocApp = this; //xUtils 初始化
        x.Ext.init(this);
        x.Ext.setDebug(true);//是否输出Debug日志
        Hawk.init(this).build();
        DownloadManager.initDownloader(vocApp);
        MMKV.initialize(this);
        QbSdk.initX5Environment(this, new QbSdk.PreInitCallback() {
            @Override
            public void onCoreInitFinished() {
                Log.i(getClass().getName().toString(), "initX5Environment onCoreInitFinished");
            }

            @Override
            public void onViewInitFinished(boolean b) {
                Log.i(getClass().getName().toString(), "initX5Environment onViewInitFinished");
            }
        });

        //播放器配置，注意：此为全局配置，按需开启
        VideoViewManager.setConfig(VideoViewConfig.newBuilder()
                .setPlayerFactory(MyIjkPlayerFactory.create())
                .build());
        M3U8Library.init(this);
    }

    private void xtwinit() {
        //初始化SDK
        SSPSdk.init(getApplication(), SDKID, "ch_official", true);
        SSPSdk.getExtData().setAppName(getString(R.string.app_name));
        SSPSdk.getExtData().setAppDesc(getString(R.string.app_name));
        SSPSdk.getExtData().setEnableUserInfo(true);
    }

    public void setTypeface(){
        typeFace = Typeface.createFromAsset(getAssets(), "fonts/iconfont.ttf");
        try
        {
            Field field = Typeface.class.getDeclaredField("SERIF");
            field.setAccessible(true);
            field.set(null, typeFace);
        }
        catch (NoSuchFieldException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
    }

    public static int getSrceenWidth() {
        return ((WindowManager) getApplication().getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getWidth();
    }

    // 页面刷新代码 static 代码段可以防止内存泄露
    static {
        //设置全局的Header构建器
        SmartRefreshLayout.setDefaultRefreshHeaderCreator(new DefaultRefreshHeaderCreator() {
            @Override
            public RefreshHeader createRefreshHeader(Context context, RefreshLayout layout) {
//                layout.setPrimaryColorsId(R.color.colorPrimary, android.R.color.white);//全局设置主题颜色
                return new ClassicsHeader(context);//.setTimeFormat(new DynamicTimeFormat("更新于 %s"));//指定为经典Header，默认是 贝塞尔雷达Header
            }
        });
        //设置全局的Footer构建器
        SmartRefreshLayout.setDefaultRefreshFooterCreator(new DefaultRefreshFooterCreator() {
            @Override
            public RefreshFooter createRefreshFooter(Context context, RefreshLayout layout) {
                //指定为经典Footer，默认是 BallPulseFooter
                return new ClassicsFooter(context).setDrawableSize(20);
            }
        });
    }

    public synchronized static GetFileSharePreance getFileSharePreance() {
        return new GetFileSharePreance(vocApp);
    }

    /**
     * RxJava2 当取消订阅后(dispose())，RxJava抛出的异常后续无法接收(此时后台线程仍在跑，可能会抛出IO等异常),全部由RxJavaPlugin接收，需要提前设置ErrorHandler
     * 详情：http://engineering.rallyhealth.com/mobile/rxjava/reactive/2017/03/15/migrating-to-rxjava-2.html#Error Handling
     */
    private void setRxJavaErrorHandler() {
        RxJavaPlugins.setErrorHandler(new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                Log.d(TAG, "RxJavaPlugins throw test");
            }
        });
    }
}
