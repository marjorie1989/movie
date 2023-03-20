package cn.lvdou.vod.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\tH\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0014J\u0012\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0017J\b\u0010\u001f\u001a\u00020\u0018H\u0014J\b\u0010 \u001a\u00020\u0018H\u0015J\b\u0010!\u001a\u00020\u0018H\u0002J\b\u0010\"\u001a\u00020\u0018H\u0002J\b\u0010#\u001a\u00020\u0018H\u0002J\b\u0010$\u001a\u00020\u0018H\u0002J\b\u0010%\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcn/lvdou/vod/ui/login/LoginActivity;", "Lcn/lvdou/vod/base/BaseActivity;", "Landroid/os/Handler$Callback;", "()V", "MAX_NUM", "", "WHAT_COUNT", "curType", "define_account", "", "idpass", "", "iduser", "imageHeightSize", "imageWidthSize", "index", "isOpenRegister", "mHanlder", "Landroid/os/Handler;", "task", "Ljava/util/TimerTask;", "timer", "Ljava/util/Timer;", "cancelTimer", "", "check", "checkIsOpenRegister", "getLayoutResID", "handleMessage", "msg", "Landroid/os/Message;", "initListener", "initView", "login", "register", "registerByCode", "sendVerifyCode", "startTimer", "Companion", "app_release"})
public final class LoginActivity extends cn.lvdou.vod.base.BaseActivity implements android.os.Handler.Callback {
    private int curType;
    private java.lang.String iduser;
    private java.lang.String idpass;
    private final int WHAT_COUNT = 1;
    private android.os.Handler mHanlder;
    private final int MAX_NUM = 60;
    private int index;
    private java.util.Timer timer;
    private java.util.TimerTask task;
    private boolean isOpenRegister;
    private boolean define_account;
    private int imageWidthSize;
    private int imageHeightSize;
    public static final cn.lvdou.vod.ui.login.LoginActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutResID() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    protected void initView() {
    }
    
    @java.lang.Override()
    protected void initListener() {
    }
    
    private final void login() {
    }
    
    private final void registerByCode() {
    }
    
    private final void register() {
    }
    
    private final void checkIsOpenRegister() {
    }
    
    private final void sendVerifyCode() {
    }
    
    private final void startTimer() {
    }
    
    private final void cancelTimer() {
    }
    
    private final boolean check() {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public boolean handleMessage(@org.jetbrains.annotations.Nullable()
    android.os.Message msg) {
        return false;
    }
    
    public LoginActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcn/lvdou/vod/ui/login/LoginActivity$Companion;", "", "()V", "start", "", "app_release"})
    public static final class Companion {
        
        public final void start() {
        }
        
        private Companion() {
            super();
        }
    }
}