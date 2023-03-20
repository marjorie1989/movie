package cn.lvdou.vod.ui.share;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0014J\b\u0010\u0011\u001a\u00020\u000bH\u0014J\b\u0010\u0012\u001a\u00020\u000bH\u0002J\"\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u000bH\u0002J\u000e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcn/lvdou/vod/ui/share/ShareActivity;", "Lcn/lvdou/vod/base/BaseActivity;", "()V", "shareInfo", "Lcn/lvdou/vod/bean/ShareInfoBean;", "vod_blurd", "", "vod_pic_slide", "vod_tag", "vom_name", "copyLink", "", "copyShareCode", "getLayoutResID", "", "getShareUrl", "initData", "initListener", "inviteFriend", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "shareScore", "shareSingleImage", "file", "Ljava/io/File;", "Companion", "app_debug"})
public final class ShareActivity extends cn.lvdou.vod.base.BaseActivity {
    private cn.lvdou.vod.bean.ShareInfoBean shareInfo;
    private java.lang.String vom_name;
    private java.lang.String vod_tag;
    private java.lang.String vod_pic_slide;
    private java.lang.String vod_blurd;
    public static final int REQOUEST_SHARE = 1;
    public static final cn.lvdou.vod.ui.share.ShareActivity.Companion Companion = null;
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
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void getShareUrl() {
    }
    
    private final void inviteFriend() {
    }
    
    public final void shareSingleImage(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
    }
    
    private final void copyLink() {
    }
    
    private final void copyShareCode() {
    }
    
    private final void shareScore() {
    }
    
    public ShareActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcn/lvdou/vod/ui/share/ShareActivity$Companion;", "", "()V", "REQOUEST_SHARE", "", "start", "", "mVodBean", "Lcn/lvdou/vod/bean/VodBean;", "app_debug"})
    public static final class Companion {
        
        public final void start(@org.jetbrains.annotations.NotNull()
        cn.lvdou.vod.bean.VodBean mVodBean) {
        }
        
        private Companion() {
            super();
        }
    }
}