package cn.lvdou.vod.ui.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcn/lvdou/vod/ui/widget/AppUpdateDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "data", "Lcn/lvdou/vod/bean/AppUpdateBean;", "(Landroid/content/Context;Lcn/lvdou/vod/bean/AppUpdateBean;)V", "getData", "()Lcn/lvdou/vod/bean/AppUpdateBean;", "isDownLoading", "", "mHandler", "Landroid/os/Handler;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_release"})
public final class AppUpdateDialog extends android.app.Dialog {
    private final android.os.Handler mHandler = null;
    private boolean isDownLoading;
    @org.jetbrains.annotations.NotNull()
    private final cn.lvdou.vod.bean.AppUpdateBean data = null;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.lvdou.vod.bean.AppUpdateBean getData() {
        return null;
    }
    
    public AppUpdateDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.bean.AppUpdateBean data) {
        super(null);
    }
}