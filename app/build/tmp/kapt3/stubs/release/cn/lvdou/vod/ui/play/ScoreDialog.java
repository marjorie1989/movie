package cn.lvdou.vod.ui.play;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcn/lvdou/vod/ui/play/ScoreDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onScoreSubmitClickListener", "Lcn/lvdou/vod/ui/play/ScoreDialog$OnScoreSubmitClickListener;", "score", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setOnScoreSubmitClickListener", "OnScoreSubmitClickListener", "app_release"})
public final class ScoreDialog extends android.app.Dialog {
    private cn.lvdou.vod.ui.play.ScoreDialog.OnScoreSubmitClickListener onScoreSubmitClickListener;
    private float score;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.lvdou.vod.ui.play.ScoreDialog setOnScoreSubmitClickListener(@org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.ui.play.ScoreDialog.OnScoreSubmitClickListener onScoreSubmitClickListener) {
        return null;
    }
    
    public ScoreDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcn/lvdou/vod/ui/play/ScoreDialog$OnScoreSubmitClickListener;", "", "onScoreSubmit", "", "scoreDialog", "Lcn/lvdou/vod/ui/play/ScoreDialog;", "score", "", "app_release"})
    public static abstract interface OnScoreSubmitClickListener {
        
        public abstract void onScoreSubmit(@org.jetbrains.annotations.NotNull()
        cn.lvdou.vod.ui.play.ScoreDialog scoreDialog, float score);
    }
}