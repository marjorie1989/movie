package cn.lvdou.vod.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0015J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0017J\b\u0010\u001b\u001a\u00020\u001cH$J\b\u0010\u001d\u001a\u00020\u0015H\u0014J\b\u0010\u001e\u001a\u00020\u0015H\u0014J\b\u0010\u001f\u001a\u00020\u0015H\u0014J\b\u0010 \u001a\u00020!H\u0014J\u0012\u0010\"\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\b\u0010%\u001a\u00020\u0015H\u0014J\b\u0010&\u001a\u00020\u0015H\u0014J\b\u0010\'\u001a\u00020\u0015H\u0014J\u000e\u0010(\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010)\u001a\u00020\u00152\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150+H\u0016R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0000X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcn/lvdou/vod/base/BaseActivity;", "Lme/yokeyword/fragmentation/SupportActivity;", "()V", "PICTURE_PERMISSION", "", "", "[Ljava/lang/String;", "mActivity", "getMActivity", "()Lcn/lvdou/vod/base/BaseActivity;", "setMActivity", "(Lcn/lvdou/vod/base/BaseActivity;)V", "mDisposablePool", "Lio/reactivex/disposables/CompositeDisposable;", "getMDisposablePool", "()Lio/reactivex/disposables/CompositeDisposable;", "mDisposablePool$delegate", "Lkotlin/Lazy;", "unbinder", "Lbutterknife/Unbinder;", "addDisposable", "", "disposable", "Lio/reactivex/disposables/Disposable;", "detach", "finish", "getAndroidID", "getLayoutResID", "", "initData", "initListener", "initView", "isUseEventBus", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "removeDisposable", "requePer", "getPermissionSuccess", "Lkotlin/Function0;", "app_debug"})
public abstract class BaseActivity extends me.yokeyword.fragmentation.SupportActivity {
    private butterknife.Unbinder unbinder;
    @org.jetbrains.annotations.NotNull()
    public cn.lvdou.vod.base.BaseActivity mActivity;
    private final java.lang.String[] PICTURE_PERMISSION = null;
    private final kotlin.Lazy mDisposablePool$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final cn.lvdou.vod.base.BaseActivity getMActivity() {
        return null;
    }
    
    public final void setMActivity(@org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.base.BaseActivity p0) {
    }
    
    private final io.reactivex.disposables.CompositeDisposable getMDisposablePool() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * 请求画中画权限
     */
    public void requePer(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> getPermissionSuccess) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    protected abstract int getLayoutResID();
    
    protected void initView() {
    }
    
    protected void initListener() {
    }
    
    protected void initData() {
    }
    
    protected boolean isUseEventBus() {
        return false;
    }
    
    public final void addDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable disposable) {
    }
    
    public final void removeDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable disposable) {
    }
    
    public final void detach() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void finish() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    public java.lang.String getAndroidID() {
        return null;
    }
    
    public BaseActivity() {
        super();
    }
}