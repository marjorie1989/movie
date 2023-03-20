package cn.lvdou.vod.ui.play;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcn/lvdou/vod/ui/play/CommentDialog;", "Landroid/app/Dialog;", "mContext", "Landroid/content/Context;", "s", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getMContext", "()Landroid/content/Context;", "onCommentSubmitClickListener", "Lcn/lvdou/vod/ui/play/CommentDialog$OnCommentSubmitClickListener;", "wqddgs", "closeSoftInput", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setOnCommentSubmitClickListener", "OnCommentSubmitClickListener", "app_debug"})
public final class CommentDialog extends android.app.Dialog {
    private cn.lvdou.vod.ui.play.CommentDialog.OnCommentSubmitClickListener onCommentSubmitClickListener;
    private java.lang.String wqddgs;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void closeSoftInput() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.lvdou.vod.ui.play.CommentDialog setOnCommentSubmitClickListener(@org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.ui.play.CommentDialog.OnCommentSubmitClickListener onCommentSubmitClickListener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public CommentDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    java.lang.String s) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcn/lvdou/vod/ui/play/CommentDialog$OnCommentSubmitClickListener;", "", "onCommentSubmit", "", "comment", "", "app_debug"})
    public static abstract interface OnCommentSubmitClickListener {
        
        public abstract void onCommentSubmit(@org.jetbrains.annotations.NotNull()
        java.lang.String comment);
    }
}