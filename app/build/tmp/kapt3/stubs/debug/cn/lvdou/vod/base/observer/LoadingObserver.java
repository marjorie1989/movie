package cn.lvdou.vod.base.observer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u0007\u001a\u00020\u0010H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcn/lvdou/vod/base/observer/LoadingObserver;", "E", "Lcn/lvdou/vod/base/observer/BaseObserver;", "context", "Landroid/content/Context;", "loadingMsg", "", "showLoading", "", "showErrorTip", "(Landroid/content/Context;IZZ)V", "loadingDialog", "Landroid/app/ProgressDialog;", "wrContext", "Ljava/lang/ref/WeakReference;", "dismissLoading", "", "initLoading", "onError", "e", "", "onNext", "data", "(Ljava/lang/Object;)V", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "app_debug"})
public abstract class LoadingObserver<E extends java.lang.Object> extends cn.lvdou.vod.base.observer.BaseObserver<E> {
    private final java.lang.ref.WeakReference<android.content.Context> wrContext = null;
    private android.app.ProgressDialog loadingDialog;
    private final int loadingMsg = 0;
    
    @java.lang.Override()
    public void onSubscribe(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable d) {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    @java.lang.Override()
    public void onNext(E data) {
    }
    
    /**
     * 初始化loading
     */
    private final android.app.ProgressDialog initLoading() {
        return null;
    }
    
    /**
     * 显示loading
     */
    private final void showLoading() {
    }
    
    /**
     * 取消loading
     */
    private final void dismissLoading() {
    }
    
    public LoadingObserver(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int loadingMsg, boolean showLoading, boolean showErrorTip) {
        super(false);
    }
}