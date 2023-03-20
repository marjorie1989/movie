package cn.lvdou.vod.ui.down;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\b\u0010\u0012\u001a\u00020\u0010H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcn/lvdou/vod/ui/down/AllDownloadActivity;", "Lcn/lvdou/vod/base/BaseActivity;", "()V", "downloadItemList", "Ljaygoo/library/m3u8downloader/view/DownloadItemList;", "downloadingItemList", "Ljaygoo/library/m3u8downloader/view/DownloadingItemList;", "receiver", "Landroid/content/BroadcastReceiver;", "getReceiver", "()Landroid/content/BroadcastReceiver;", "setReceiver", "(Landroid/content/BroadcastReceiver;)V", "getLayoutResID", "", "initData", "", "initView", "onDestroy", "Companion", "app_release"})
public final class AllDownloadActivity extends cn.lvdou.vod.base.BaseActivity {
    private jaygoo.library.m3u8downloader.view.DownloadingItemList downloadingItemList;
    private jaygoo.library.m3u8downloader.view.DownloadItemList downloadItemList;
    @org.jetbrains.annotations.NotNull()
    private android.content.BroadcastReceiver receiver;
    public static final cn.lvdou.vod.ui.down.AllDownloadActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void initView() {
    }
    
    @java.lang.Override()
    protected void initData() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected int getLayoutResID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.BroadcastReceiver getReceiver() {
        return null;
    }
    
    public final void setReceiver(@org.jetbrains.annotations.NotNull()
    android.content.BroadcastReceiver p0) {
    }
    
    public AllDownloadActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcn/lvdou/vod/ui/down/AllDownloadActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", "app_release"})
    public static final class Companion {
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private Companion() {
            super();
        }
    }
}