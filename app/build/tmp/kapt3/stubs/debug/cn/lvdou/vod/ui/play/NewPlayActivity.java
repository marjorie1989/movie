package cn.lvdou.vod.ui.play;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00e0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b$\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u00b1\u0001\u00b2\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010h\u001a\u00020iH\u0002J\u000e\u0010j\u001a\u00020i2\u0006\u0010k\u001a\u00020lJ\u000e\u0010m\u001a\u00020i2\u0006\u0010n\u001a\u00020AJ\u0016\u0010m\u001a\u00020i2\u0006\u0010n\u001a\u00020A2\u0006\u0010Q\u001a\u00020\u001cJ\u0016\u0010o\u001a\u00020i2\u0006\u0010p\u001a\u00020\u001c2\u0006\u0010q\u001a\u00020\u0005J\b\u0010r\u001a\u00020iH\u0002J\u0010\u0010s\u001a\u00020i2\b\b\u0002\u0010p\u001a\u00020\u001cJ\b\u0010t\u001a\u00020\u0005H\u0002J\b\u0010u\u001a\u00020iH\u0002J\b\u0010v\u001a\u00020iH\u0002J\b\u0010w\u001a\u00020iH\u0002J\u0010\u0010x\u001a\u00020i2\u0006\u0010y\u001a\u00020\u0007H\u0002J\u0010\u0010z\u001a\u00020i2\u0006\u0010{\u001a\u00020\"H\u0002J\b\u0010|\u001a\u00020\u001cH\u0014J\u0017\u0010}\u001a\u00020~2\u0006\u0010\u007f\u001a\u00020\"2\u0007\u0010\u0080\u0001\u001a\u00020\"J\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001J\t\u0010\u0083\u0001\u001a\u00020iH\u0002J\t\u0010\u0084\u0001\u001a\u00020iH\u0002J\u0007\u0010\u0085\u0001\u001a\u00020iJ\u0007\u0010\u0086\u0001\u001a\u00020iJ\t\u0010\u0087\u0001\u001a\u00020iH\u0014J\t\u0010\u0088\u0001\u001a\u00020iH\u0014J\t\u0010\u0089\u0001\u001a\u00020iH\u0014J\t\u0010\u008a\u0001\u001a\u00020iH\u0016J\t\u0010\u008b\u0001\u001a\u00020iH\u0014J\u001e\u0010\u008c\u0001\u001a\u00020\u00052\u0007\u0010\u008d\u0001\u001a\u00020\u001c2\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u0001H\u0016J\t\u0010\u0090\u0001\u001a\u00020iH\u0014J\t\u0010\u0091\u0001\u001a\u00020iH\u0014J\u0012\u0010\u0092\u0001\u001a\u00020i2\u0007\u0010\u0093\u0001\u001a\u00020\u0007H\u0016J\t\u0010\u0094\u0001\u001a\u00020iH\u0014J\t\u0010\u0095\u0001\u001a\u00020iH\u0002J\t\u0010\u0096\u0001\u001a\u00020iH\u0002J\u0011\u0010\u0097\u0001\u001a\u00020i2\u0006\u0010y\u001a\u00020\u0007H\u0002J\u0011\u0010\u0098\u0001\u001a\u00020i2\u0006\u0010y\u001a\u00020\u0007H\u0002J\t\u0010\u0099\u0001\u001a\u00020iH\u0002J\t\u0010\u009a\u0001\u001a\u00020iH\u0002J\t\u0010\u009b\u0001\u001a\u00020iH\u0002J\t\u0010\u009c\u0001\u001a\u00020iH\u0002J\t\u0010\u009d\u0001\u001a\u00020iH\u0002J\t\u0010\u009e\u0001\u001a\u00020iH\u0002J\u0012\u0010\u009f\u0001\u001a\u00020i2\u0007\u0010\u00a0\u0001\u001a\u00020\u0005H\u0002J\u0012\u0010\u00a1\u0001\u001a\u00020i2\u0007\u0010\u00a2\u0001\u001a\u00020\u0007H\u0002J\t\u0010\u00a3\u0001\u001a\u00020iH\u0002J\t\u0010\u00a4\u0001\u001a\u00020iH\u0002J\u0010\u0010\u00a5\u0001\u001a\u00020i2\u0007\u0010\u00a6\u0001\u001a\u00020:J\u0007\u0010\u00a7\u0001\u001a\u00020iJ\t\u0010\u00a8\u0001\u001a\u00020iH\u0002J\t\u0010\u00a9\u0001\u001a\u00020iH\u0002J\t\u0010\u00aa\u0001\u001a\u00020iH\u0002J\u0012\u0010\u00ab\u0001\u001a\u00020i2\u0007\u0010\u00ac\u0001\u001a\u00020\u001cH\u0002J\u0007\u0010\u00ad\u0001\u001a\u00020iJ\u0007\u0010\u00ae\u0001\u001a\u00020iJ\t\u0010\u00af\u0001\u001a\u00020iH\u0002J\t\u0010\u00b0\u0001\u001a\u00020iH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00100\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u000206X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u00107\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u00108R\u000e\u00109\u001a\u00020:X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010B\u001a\u00020AX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010G\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010@X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0010\u0010M\u001a\u0004\u0018\u00010NX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010O\u001a\u0004\u0018\u00010PX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010Q\u001a\u00020\u001cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0010\u0010V\u001a\u0004\u0018\u00010WX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010X\u001a\u0004\u0018\u00010YX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010Z\u001a\u0004\u0018\u00010[X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\\\u001a\u0004\u0018\u00010]X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010^\u001a\u0004\u0018\u00010_X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010a\u001a\u0004\u0018\u00010bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00b3\u0001"}, d2 = {"Lcn/lvdou/vod/ui/play/NewPlayActivity;", "Lcn/lvdou/vod/base/BaseActivity;", "Lcn/lvdou/vod/ui/play/OnSpeedItemClickListener;", "()V", "IsSwitchkernel", "", "Speeds", "", "getSpeeds", "()Ljava/lang/String;", "setSpeeds", "(Ljava/lang/String;)V", "TAG", "advControl", "Lcn/lvdou/vod/ui/widget/AdControlView;", "getAdvControl", "()Lcn/lvdou/vod/ui/widget/AdControlView;", "setAdvControl", "(Lcn/lvdou/vod/ui/widget/AdControlView;)V", "advData", "Lcn/lvdou/vod/entity/AdvEntity;", "getAdvData", "()Lcn/lvdou/vod/entity/AdvEntity;", "setAdvData", "(Lcn/lvdou/vod/entity/AdvEntity;)V", "controller", "Lcn/lvdou/av/play/AvVideoController;", "curFailIndex", "", "curParseIndex", "curPlayUrl", "getCurPlayUrl", "setCurPlayUrl", "curProgressHistory", "", "index", "isAllowCastScreen", "isCanPlayAd2", "isLandscape", "isParseSuccess", "isParsed", "isPlay", "isSeekToHistory", "isShowPlayProgress", "isSuccess", "lastTime_getdanmu", "lbm", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "loadingDanmu", "getLoadingDanmu", "()Z", "setLoadingDanmu", "(Z)V", "localReceiver", "Lcn/lvdou/vod/ui/play/NewPlayActivity$LocalReceiver;", "mIsShowing", "Ljava/lang/Boolean;", "mVodBean", "Lcn/lvdou/vod/bean/VodBean;", "onJiexiResultListener", "Lcn/lvdou/vod/jiexi/BackListener;", "pipManager", "Lcn/lvdou/vod/pip/PIPManager;", "playFormList", "", "Lcn/lvdou/vod/bean/PlayFromBean;", "playFrom", "getPlayFrom", "()Lcn/lvdou/vod/bean/PlayFromBean;", "setPlayFrom", "(Lcn/lvdou/vod/bean/PlayFromBean;)V", "playList", "Lcn/lvdou/vod/bean/UrlBean;", "getPlayList", "()Ljava/util/List;", "setPlayList", "(Ljava/util/List;)V", "playListFragment", "Lcn/lvdou/vod/ui/play/PlayListFragment;", "playScoreInfo", "Lcn/lvdou/vod/bean/PlayScoreBean;", "playSourceIndex", "getPlaySourceIndex", "()I", "setPlaySourceIndex", "(I)V", "startService", "Lcn/lvdou/vod/netservice/StartService;", "summaryFragment", "Lcn/lvdou/vod/ui/play/SummaryFragment;", "timer", "Ljava/util/Timer;", "timerCount", "Lcn/lvdou/vod/ui/play/NewPlayActivity$MyCount;", "timerTask", "Ljava/util/TimerTask;", "urlIndex", "videoDetailFragment", "Lcn/lvdou/vod/ui/play/VideoDetailFragment;", "videoNetProgress", "videoView", "Lcn/lvdou/av/play/AvVideoView;", "vodDuration", "watchVideoLong", "cancelTimer", "", "castScreen", "device", "Lcom/liuwei/android/upnpcast/device/CastDevice;", "changePlaySource", "playFromBean", "changeSelection", "position", "isNeedOrder", "changeTitle", "changeVideoUrlIndex", "checekPlayVip", "checkVodTrySee", "chengeNextLine", "chengeNextLineFromHead", "getAdv", "url", "getDanmu", "atTime", "getLayoutResID", "getPercentage", "", "curPosition", "duration", "getPipMsgBean", "Lcn/lvdou/vod/bean/PipMsgBean;", "getStartData", "getVideoDetail", "hidePlayList", "hideSummary", "initData", "initListener", "initView", "onBackPressedSupport", "onDestroy", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "onPause", "onResume", "onSpeedItemClick", "speed", "onStart", "parseData", "payPlay", "play", "play2", "playNext", "play_img_url", "prepared", "recordPlay", "registerReceiver", "releaseAdVideo", "savePlayRecord", "isClose", "sendDanmu", "content", "showAnnouncement", "showCastScreenDialog", "showNewVideo", "vodBean", "showPlayList", "showPlayListDialog", "showPlaySourceDialog", "showPlayerAd", "showSpeedListDialog", "pos", "showSummary", "showVideoDetail", "startTimer", "updateVip", "LocalReceiver", "MyCount", "app_debug"})
public class NewPlayActivity extends cn.lvdou.vod.base.BaseActivity implements cn.lvdou.vod.ui.play.OnSpeedItemClickListener {
    private final java.lang.String TAG = "NewPlayActivity";
    private cn.lvdou.av.play.AvVideoController controller;
    private cn.lvdou.vod.bean.VodBean mVodBean;
    private boolean isShowPlayProgress;
    private boolean isCanPlayAd2;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String curPlayUrl;
    private boolean isAllowCastScreen;
    private int curParseIndex;
    private int curFailIndex;
    private boolean isPlay;
    private int playSourceIndex;
    private int urlIndex;
    private java.util.List<? extends cn.lvdou.vod.bean.PlayFromBean> playFormList;
    @org.jetbrains.annotations.NotNull()
    public cn.lvdou.vod.bean.PlayFromBean playFrom;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends cn.lvdou.vod.bean.UrlBean> playList;
    private cn.lvdou.vod.bean.PlayScoreBean playScoreInfo;
    private boolean isParseSuccess;
    private boolean isSeekToHistory;
    private long curProgressHistory;
    private long vodDuration;
    private long videoNetProgress;
    private cn.lvdou.vod.pip.PIPManager pipManager;
    private java.lang.Boolean mIsShowing;
    private boolean IsSwitchkernel;
    private long lastTime_getdanmu;
    private cn.lvdou.vod.netservice.StartService startService;
    private final cn.lvdou.vod.jiexi.BackListener onJiexiResultListener = null;
    private cn.lvdou.vod.ui.play.VideoDetailFragment videoDetailFragment;
    private cn.lvdou.vod.ui.play.SummaryFragment summaryFragment;
    private cn.lvdou.vod.ui.play.PlayListFragment playListFragment;
    private boolean isParsed;
    private boolean isLandscape;
    private cn.lvdou.vod.ui.play.NewPlayActivity.MyCount timerCount;
    private cn.lvdou.av.play.AvVideoView videoView;
    private boolean loadingDanmu;
    @org.jetbrains.annotations.Nullable()
    private cn.lvdou.vod.entity.AdvEntity advData;
    @org.jetbrains.annotations.Nullable()
    private cn.lvdou.vod.ui.widget.AdControlView advControl;
    private boolean isSuccess;
    private androidx.localbroadcastmanager.content.LocalBroadcastManager lbm;
    private final cn.lvdou.vod.ui.play.NewPlayActivity.LocalReceiver localReceiver = null;
    private java.util.Timer timer;
    private java.util.TimerTask timerTask;
    private int watchVideoLong;
    private int index;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String Speeds;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getCurPlayUrl() {
        return null;
    }
    
    public void setCurPlayUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public int getPlaySourceIndex() {
        return 0;
    }
    
    public void setPlaySourceIndex(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public cn.lvdou.vod.bean.PlayFromBean getPlayFrom() {
        return null;
    }
    
    public void setPlayFrom(@org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.bean.PlayFromBean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.util.List<cn.lvdou.vod.bean.UrlBean> getPlayList() {
        return null;
    }
    
    public void setPlayList(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends cn.lvdou.vod.bean.UrlBean> p0) {
    }
    
    private final void getDanmu(long atTime) {
    }
    
    private final void getStartData() {
    }
    
    @java.lang.Override()
    protected int getLayoutResID() {
        return 0;
    }
    
    public final boolean getLoadingDanmu() {
        return false;
    }
    
    public final void setLoadingDanmu(boolean p0) {
    }
    
    @java.lang.Override()
    protected void initView() {
    }
    
    @java.lang.Override()
    protected void initListener() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final cn.lvdou.vod.entity.AdvEntity getAdvData() {
        return null;
    }
    
    public final void setAdvData(@org.jetbrains.annotations.Nullable()
    cn.lvdou.vod.entity.AdvEntity p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final cn.lvdou.vod.ui.widget.AdControlView getAdvControl() {
        return null;
    }
    
    public final void setAdvControl(@org.jetbrains.annotations.Nullable()
    cn.lvdou.vod.ui.widget.AdControlView p0) {
    }
    
    @java.lang.Override()
    protected void initData() {
    }
    
    /**
     * 视频准备完成
     */
    private final void prepared() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onBackPressedSupport() {
    }
    
    @java.lang.Override()
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.Nullable()
    android.view.KeyEvent event) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.lvdou.vod.bean.PipMsgBean getPipMsgBean() {
        return null;
    }
    
    public final void showSummary() {
    }
    
    public final void hideSummary() {
    }
    
    public final void showVideoDetail() {
    }
    
    public final void showPlayList() {
    }
    
    public final void hidePlayList() {
    }
    
    public final void showNewVideo(@org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.bean.VodBean vodBean) {
    }
    
    public final void changeSelection(int position, boolean isNeedOrder) {
    }
    
    public final void changeVideoUrlIndex(int position) {
    }
    
    public final void changePlaySource(@org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.bean.PlayFromBean playFromBean, int playSourceIndex) {
    }
    
    public final void changePlaySource(@org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.bean.PlayFromBean playFromBean) {
    }
    
    public final void castScreen(@org.jetbrains.annotations.NotNull()
    com.liuwei.android.upnpcast.device.CastDevice device) {
    }
    
    private final void changeTitle() {
    }
    
    private final void chengeNextLine() {
    }
    
    private final void chengeNextLineFromHead() {
    }
    
    private final void showSpeedListDialog(int pos) {
    }
    
    private final void showPlayListDialog() {
    }
    
    private final void showPlaySourceDialog() {
    }
    
    private final void showCastScreenDialog() {
    }
    
    private final void play_img_url() {
    }
    
    private final void getVideoDetail() {
    }
    
    private final void getAdv(java.lang.String url) {
    }
    
    /**
     * 释放视频广告
     */
    private final void releaseAdVideo() {
    }
    
    private final void play2(java.lang.String url) {
    }
    
    private final void checkVodTrySee() {
    }
    
    private final void parseData() {
    }
    
    private final boolean checekPlayVip() {
        return false;
    }
    
    private final void showPlayerAd() {
    }
    
    private final void showAnnouncement() {
    }
    
    private final void play(java.lang.String url) {
    }
    
    private final void recordPlay() {
    }
    
    private final void savePlayRecord(boolean isClose) {
    }
    
    private final void playNext() {
    }
    
    private final void updateVip() {
    }
    
    private final void payPlay() {
    }
    
    private final void registerReceiver() {
    }
    
    private final void startTimer() {
    }
    
    private final void cancelTimer() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSpeeds() {
        return null;
    }
    
    public final void setSpeeds(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void onSpeedItemClick(@org.jetbrains.annotations.NotNull()
    java.lang.String speed) {
    }
    
    private final void sendDanmu(java.lang.String content) {
    }
    
    public final float getPercentage(long curPosition, long duration) {
        return 0.0F;
    }
    
    public NewPlayActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcn/lvdou/vod/ui/play/NewPlayActivity$LocalReceiver;", "Landroid/content/BroadcastReceiver;", "act", "Lcn/lvdou/vod/ui/play/NewPlayActivity;", "(Lcn/lvdou/vod/ui/play/NewPlayActivity;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
    public static final class LocalReceiver extends android.content.BroadcastReceiver {
        private cn.lvdou.vod.ui.play.NewPlayActivity act;
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.Nullable()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        android.content.Intent intent) {
        }
        
        public LocalReceiver(@org.jetbrains.annotations.NotNull()
        cn.lvdou.vod.ui.play.NewPlayActivity act) {
            super();
        }
    }
    
    /**
     * CountDownTimer 实现倒计时
     */
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcn/lvdou/vod/ui/play/NewPlayActivity$MyCount;", "Landroid/os/CountDownTimer;", "context", "Landroid/app/Activity;", "millisInFuture", "", "countDownInterval", "lisenter", "Lcn/lvdou/vod/ui/play/NewPlayActivity$MyCount$timerFinsihLisenter;", "(Landroid/app/Activity;JJLcn/lvdou/vod/ui/play/NewPlayActivity$MyCount$timerFinsihLisenter;)V", "mView", "Landroid/view/View;", "onFinish", "", "onTick", "millisUntilFinished", "timerFinsihLisenter", "app_debug"})
    public static final class MyCount extends android.os.CountDownTimer {
        private android.view.View mView;
        private android.app.Activity context;
        private cn.lvdou.vod.ui.play.NewPlayActivity.MyCount.timerFinsihLisenter lisenter;
        
        @java.lang.Override()
        public void onFinish() {
        }
        
        @java.lang.Override()
        public void onTick(long millisUntilFinished) {
        }
        
        public MyCount(@org.jetbrains.annotations.NotNull()
        android.app.Activity context, long millisInFuture, long countDownInterval, @org.jetbrains.annotations.NotNull()
        cn.lvdou.vod.ui.play.NewPlayActivity.MyCount.timerFinsihLisenter lisenter) {
            super(0L, 0L);
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcn/lvdou/vod/ui/play/NewPlayActivity$MyCount$timerFinsihLisenter;", "", "onFinish", "", "onTicks", "mill", "", "app_debug"})
        public static abstract interface timerFinsihLisenter {
            
            public abstract void onFinish();
            
            public abstract void onTicks(long mill);
        }
    }
}