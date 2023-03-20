package cn.lvdou.vod.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0005H\u0014J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0014J\b\u0010\u001b\u001a\u00020\u000fH\u0002J\b\u0010\u001c\u001a\u00020\u000fH\u0002J\b\u0010\u001d\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcn/lvdou/vod/ui/login/ForgetPswActivity;", "Lcn/lvdou/vod/base/BaseActivity;", "Landroid/os/Handler$Callback;", "()V", "MAX_NUM", "", "WHAT_COUNT", "index", "mHanlder", "Landroid/os/Handler;", "task", "Ljava/util/TimerTask;", "timer", "Ljava/util/Timer;", "cancelTimer", "", "forgetPsw", "phone", "", "code", "psw", "getLayoutResID", "handleMessage", "", "msg", "Landroid/os/Message;", "initView", "sendVerifyCode", "setLisenter", "startTimer", "Companion", "app_debug"})
public final class ForgetPswActivity extends cn.lvdou.vod.base.BaseActivity implements android.os.Handler.Callback {
    private android.os.Handler mHanlder;
    private final int WHAT_COUNT = 1;
    private final int MAX_NUM = 60;
    private int index;
    private java.util.Timer timer;
    private java.util.TimerTask task;
    public static final cn.lvdou.vod.ui.login.ForgetPswActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutResID() {
        return 0;
    }
    
    @java.lang.Override()
    protected void initView() {
    }
    
    private final void setLisenter() {
    }
    
    private final void forgetPsw(java.lang.String phone, java.lang.String code, java.lang.String psw) {
    }
    
    private final void sendVerifyCode() {
    }
    
    private final void startTimer() {
    }
    
    private final void cancelTimer() {
    }
    
    @java.lang.Override()
    public boolean handleMessage(@org.jetbrains.annotations.Nullable()
    android.os.Message msg) {
        return false;
    }
    
    public ForgetPswActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcn/lvdou/vod/ui/login/ForgetPswActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private Companion() {
            super();
        }
    }
}