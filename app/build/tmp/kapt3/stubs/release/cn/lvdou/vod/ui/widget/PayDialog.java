package cn.lvdou.vod.ui.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcn/lvdou/vod/ui/widget/PayDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "data", "Lcn/lvdou/vod/bean/PointPurchseBean;", "(Landroid/content/Context;Lcn/lvdou/vod/bean/PointPurchseBean;)V", "getData", "()Lcn/lvdou/vod/bean/PointPurchseBean;", "onHitDialogClickListener", "Lcn/lvdou/vod/ui/widget/PayDialog$OnPayDialogClickListener;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setOnPayDialogClickListener", "OnPayDialogClickListener", "app_release"})
public final class PayDialog extends android.app.Dialog {
    private cn.lvdou.vod.ui.widget.PayDialog.OnPayDialogClickListener onHitDialogClickListener;
    @org.jetbrains.annotations.NotNull()
    private final cn.lvdou.vod.bean.PointPurchseBean data = null;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.lvdou.vod.ui.widget.PayDialog setOnPayDialogClickListener(@org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.ui.widget.PayDialog.OnPayDialogClickListener onHitDialogClickListener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.lvdou.vod.bean.PointPurchseBean getData() {
        return null;
    }
    
    public PayDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.bean.PointPurchseBean data) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcn/lvdou/vod/ui/widget/PayDialog$OnPayDialogClickListener;", "", "()V", "onPayTypeClick", "", "dialog", "Lcn/lvdou/vod/ui/widget/PayDialog;", "payment", "", "app_release"})
    public static abstract class OnPayDialogClickListener {
        
        public void onPayTypeClick(@org.jetbrains.annotations.NotNull()
        cn.lvdou.vod.ui.widget.PayDialog dialog, @org.jetbrains.annotations.NotNull()
        java.lang.String payment) {
        }
        
        public OnPayDialogClickListener() {
            super();
        }
    }
}