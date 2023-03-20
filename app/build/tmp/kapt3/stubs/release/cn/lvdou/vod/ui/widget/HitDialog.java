package cn.lvdou.vod.ui.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcn/lvdou/vod/ui/widget/HitDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onHitDialogClickListener", "Lcn/lvdou/vod/ui/widget/HitDialog$OnHitDialogClickListener;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setInputView", "vodid", "", "setMessage", "message", "", "setOnHitDialogClickListener", "setTitle", "title", "OnHitDialogClickListener", "app_release"})
public final class HitDialog extends android.app.Dialog {
    private cn.lvdou.vod.ui.widget.HitDialog.OnHitDialogClickListener onHitDialogClickListener;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.lvdou.vod.ui.widget.HitDialog setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.lvdou.vod.ui.widget.HitDialog setMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.lvdou.vod.ui.widget.HitDialog setInputView(int vodid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.lvdou.vod.ui.widget.HitDialog setOnHitDialogClickListener(@org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.ui.widget.HitDialog.OnHitDialogClickListener onHitDialogClickListener) {
        return null;
    }
    
    public HitDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a8\u0006\f"}, d2 = {"Lcn/lvdou/vod/ui/widget/HitDialog$OnHitDialogClickListener;", "", "()V", "onCancelClick", "", "dialog", "Lcn/lvdou/vod/ui/widget/HitDialog;", "onOkClick", "onTz", "touSpeed", "", "weiSpeed", "app_release"})
    public static abstract class OnHitDialogClickListener {
        
        public void onCancelClick(@org.jetbrains.annotations.NotNull()
        cn.lvdou.vod.ui.widget.HitDialog dialog) {
        }
        
        public void onOkClick(@org.jetbrains.annotations.NotNull()
        cn.lvdou.vod.ui.widget.HitDialog dialog) {
        }
        
        public void onTz(@org.jetbrains.annotations.NotNull()
        cn.lvdou.vod.ui.widget.HitDialog dialog, @org.jetbrains.annotations.NotNull()
        java.lang.String touSpeed, @org.jetbrains.annotations.NotNull()
        java.lang.String weiSpeed) {
        }
        
        public OnHitDialogClickListener() {
            super();
        }
    }
}