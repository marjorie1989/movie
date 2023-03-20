package cn.lvdou.vod.ui.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 72\u00020\u0001:\u0003789B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u001eH\u0002J\b\u0010$\u001a\u00020\u001eH\u0002J\n\u0010%\u001a\u0004\u0018\u00010\u0004H\u0003J\u000e\u0010&\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\u0004J\b\u0010(\u001a\u00020\u001eH\u0014J\b\u0010)\u001a\u00020\u001eH\u0015J\"\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\"2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0014\u0010/\u001a\u00020\u001e2\n\b\u0002\u0010-\u001a\u0004\u0018\u000100H\u0007J\b\u00101\u001a\u00020\u001eH\u0016J\u0010\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\nH\u0016J\b\u00104\u001a\u00020\u001eH\u0002J\u0014\u00105\u001a\u00020\u001e2\n\b\u0002\u0010-\u001a\u0004\u0018\u000106H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006:"}, d2 = {"Lcn/lvdou/vod/ui/user/UserFragmentB;", "Lcn/lvdou/vod/base/BaseFragment;", "()V", "ggtime", "", "getGgtime", "()Ljava/lang/String;", "setGgtime", "(Ljava/lang/String;)V", "isInit", "", "()Z", "setInit", "(Z)V", "isUseEventBus", "setUseEventBus", "playScoreAdapter", "Lcn/lvdou/vod/ui/user/UserFragmentB$PlayScoreAdapter;", "getPlayScoreAdapter", "()Lcn/lvdou/vod/ui/user/UserFragmentB$PlayScoreAdapter;", "playScoreAdapter$delegate", "Lkotlin/Lazy;", "playVideoReceiver", "Lcn/lvdou/vod/ui/user/UserFragmentB$PlayVideoReceiver;", "getPlayVideoReceiver", "()Lcn/lvdou/vod/ui/user/UserFragmentB$PlayVideoReceiver;", "setPlayVideoReceiver", "(Lcn/lvdou/vod/ui/user/UserFragmentB$PlayVideoReceiver;)V", "d_date", "getAdsClass", "", "getExpandList", "getGroupChatList", "getLayoutId", "", "getPlayScore", "getStartData", "getTimeData", "gotoWeb", "url", "initListener", "initView", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onLoginSucces", "Lcn/lvdou/vod/bean/LoginBean;", "onResume", "setUserVisibleHint", "isVisibleToUser", "sign", "updateUserInfo", "Lcn/lvdou/vod/bean/UserInfoBean;", "Companion", "PlayScoreAdapter", "PlayVideoReceiver", "app_debug"})
public final class UserFragmentB extends cn.lvdou.vod.base.BaseFragment {
    private final kotlin.Lazy playScoreAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String ggtime;
    private boolean isInit;
    private boolean isUseEventBus;
    @org.jetbrains.annotations.NotNull()
    private cn.lvdou.vod.ui.user.UserFragmentB.PlayVideoReceiver playVideoReceiver;
    public static final cn.lvdou.vod.ui.user.UserFragmentB.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final cn.lvdou.vod.ui.user.UserFragmentB.PlayScoreAdapter getPlayScoreAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGgtime() {
        return null;
    }
    
    public final void setGgtime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isInit() {
        return false;
    }
    
    public final void setInit(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean isUseEventBus() {
        return false;
    }
    
    @java.lang.Override()
    public void setUseEventBus(boolean p0) {
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    private final void getExpandList() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.lvdou.vod.ui.user.UserFragmentB.PlayVideoReceiver getPlayVideoReceiver() {
        return null;
    }
    
    public final void setPlayVideoReceiver(@org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.ui.user.UserFragmentB.PlayVideoReceiver p0) {
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    @java.lang.Override()
    protected void initView() {
    }
    
    /**
     * 信天翁
     */
    private final void getStartData() {
    }
    
    @java.lang.Override()
    protected void initListener() {
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void onLoginSucces(@org.jetbrains.annotations.Nullable()
    cn.lvdou.vod.bean.LoginBean data) {
    }
    
    @java.lang.Override()
    public void setUserVisibleHint(boolean isVisibleToUser) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final java.lang.String getTimeData() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final java.lang.String d_date() {
        return null;
    }
    
    private final void sign() {
    }
    
    private final void updateUserInfo(cn.lvdou.vod.bean.UserInfoBean data) {
    }
    
    private final void getAdsClass() {
    }
    
    private final void getPlayScore() {
    }
    
    public final void gotoWeb(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    private final void getGroupChatList() {
    }
    
    public UserFragmentB() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final cn.lvdou.vod.ui.user.UserFragmentB newInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcn/lvdou/vod/ui/user/UserFragmentB$PlayVideoReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
    public static final class PlayVideoReceiver extends android.content.BroadcastReceiver {
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
        
        public PlayVideoReceiver() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0014\u00a8\u0006\t"}, d2 = {"Lcn/lvdou/vod/ui/user/UserFragmentB$PlayScoreAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcn/lvdou/vod/bean/PlayScoreBean;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "()V", "convert", "", "helper", "item", "app_debug"})
    static final class PlayScoreAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<cn.lvdou.vod.bean.PlayScoreBean, com.chad.library.adapter.base.BaseViewHolder> {
        
        @java.lang.Override()
        protected void convert(@org.jetbrains.annotations.NotNull()
        com.chad.library.adapter.base.BaseViewHolder helper, @org.jetbrains.annotations.Nullable()
        cn.lvdou.vod.bean.PlayScoreBean item) {
        }
        
        public PlayScoreAdapter() {
            super(0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcn/lvdou/vod/ui/user/UserFragmentB$Companion;", "", "()V", "newInstance", "Lcn/lvdou/vod/ui/user/UserFragmentB;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final cn.lvdou.vod.ui.user.UserFragmentB newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}