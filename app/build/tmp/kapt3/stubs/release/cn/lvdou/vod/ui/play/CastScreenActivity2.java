package cn.lvdou.vod.ui.play;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\u0004H\u0014J\b\u0010!\u001a\u00020\u001eH\u0014J\b\u0010\"\u001a\u00020\u001eH\u0014J\b\u0010#\u001a\u00020\u001eH\u0015J\b\u0010$\u001a\u00020\u001eH\u0014J\b\u0010%\u001a\u00020\u001eH\u0014J\b\u0010&\u001a\u00020\u001eH\u0002J\b\u0010\'\u001a\u00020\u001eH\u0002J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcn/lvdou/vod/ui/play/CastScreenActivity2;", "Lcn/lvdou/vod/base/BaseActivity;", "()V", "curParseIndex", "", "device", "Lcom/liuwei/android/upnpcast/device/CastDevice;", "isStartPlay", "", "mControlListener", "Lcom/liuwei/android/upnpcast/controller/ICastEventListener;", "mVodBean", "Lcn/lvdou/vod/bean/VodBean;", "onJiexiResultListener", "Lcn/lvdou/vod/jiexi/BackListener;", "playFormList", "Ljava/util/ArrayList;", "Lcn/lvdou/vod/bean/PlayFromBean;", "Lkotlin/collections/ArrayList;", "playFrom", "playList", "", "Lcn/lvdou/vod/bean/UrlBean;", "playSourceIndex", "urlIndex", "vodLong", "", "vodurl", "", "changeTitle", "", "chengeNextLine", "getLayoutResID", "initData", "initListener", "onDestroy", "onPause", "onResume", "parseData", "playNext", "startPlay", "videoUrl", "app_release"})
public final class CastScreenActivity2 extends cn.lvdou.vod.base.BaseActivity {
    private cn.lvdou.vod.bean.VodBean mVodBean;
    private int curParseIndex;
    private int playSourceIndex;
    private int urlIndex;
    private java.lang.String vodurl;
    private long vodLong;
    private com.liuwei.android.upnpcast.device.CastDevice device;
    private java.util.ArrayList<cn.lvdou.vod.bean.PlayFromBean> playFormList;
    private cn.lvdou.vod.bean.PlayFromBean playFrom;
    private java.util.List<? extends cn.lvdou.vod.bean.UrlBean> playList;
    private boolean isStartPlay;
    private final cn.lvdou.vod.jiexi.BackListener onJiexiResultListener = null;
    private final com.liuwei.android.upnpcast.controller.ICastEventListener mControlListener = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutResID() {
        return 0;
    }
    
    @java.lang.Override()
    protected void initData() {
    }
    
    @java.lang.Override()
    protected void initListener() {
    }
    
    private final void changeTitle() {
    }
    
    private final void chengeNextLine() {
    }
    
    private final void playNext() {
    }
    
    private final void parseData() {
    }
    
    private final void startPlay(java.lang.String videoUrl) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.KITKAT)
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public CastScreenActivity2() {
        super();
    }
}