package cn.lvdou.vod.base.observer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000eH\u0016J\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcn/lvdou/vod/base/observer/BaseObserver;", "E", "Lio/reactivex/Observer;", "showErrorTip", "", "(Z)V", "disposable", "Lio/reactivex/disposables/Disposable;", "getDisposable", "onComplete", "", "onError", "e", "Lcn/lvdou/vod/base/exception/ResponseException;", "", "onNext", "data", "(Ljava/lang/Object;)V", "onSubscribe", "d", "onSuccess", "app_release"})
public abstract class BaseObserver<E extends java.lang.Object> implements io.reactivex.Observer<E> {
    private io.reactivex.disposables.Disposable disposable;
    private final boolean showErrorTip = false;
    
    @java.lang.Override()
    public void onSubscribe(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable d) {
    }
    
    @java.lang.Override()
    public void onNext(E data) {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    @java.lang.Override()
    public void onComplete() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.Disposable getDisposable() {
        return null;
    }
    
    public abstract void onSuccess(E data);
    
    public abstract void onError(@org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.base.exception.ResponseException e);
    
    public BaseObserver(boolean showErrorTip) {
        super();
    }
    
    public BaseObserver() {
        super();
    }
}