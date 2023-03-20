package com.github.StormWyrm.wanandroid.base.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\n\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00050\fH\u0007J:\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\n\u0018\u00010\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\fH\u0007J:\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\n\u0018\u00010\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\fH\u0007J2\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\n\u0018\u00010\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\fH\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/github/StormWyrm/wanandroid/base/net/RequestManager;", "", "()V", "execute", "", "T", "mActivity", "Landroidx/appcompat/app/AppCompatActivity;", "sendDanmu", "Lio/reactivex/Observable;", "Lcn/lvdou/vod/bean/BaseResult;", "baseObserver", "Lcn/lvdou/vod/base/observer/BaseObserver;", "activity", "Lcn/lvdou/vod/base/BaseActivity;", "observable", "observer", "fragment", "Lcn/lvdou/vod/base/BaseFragment;", "app_release"})
public final class RequestManager {
    public static final com.github.StormWyrm.wanandroid.base.net.RequestManager INSTANCE = null;
    
    public static final <T extends java.lang.Object>void execute(@org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.base.BaseActivity activity, @org.jetbrains.annotations.Nullable()
    io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<T>> observable, @org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.base.observer.BaseObserver<T> observer) {
    }
    
    public static final <T extends java.lang.Object>void execute(@org.jetbrains.annotations.Nullable()
    io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<T>> observable, @org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.base.observer.BaseObserver<T> observer) {
    }
    
    public static final <T extends java.lang.Object>void execute(@org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.base.BaseFragment fragment, @org.jetbrains.annotations.Nullable()
    io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<T>> observable, @org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.base.observer.BaseObserver<T> observer) {
    }
    
    public static final <T extends java.lang.Object>void execute(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity mActivity, @org.jetbrains.annotations.Nullable()
    io.reactivex.Observable<cn.lvdou.vod.bean.BaseResult<T>> sendDanmu, @org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.base.observer.BaseObserver<T> baseObserver) {
    }
    
    private RequestManager() {
        super();
    }
}