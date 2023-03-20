package cn.lvdou.vod.ui.play;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0013\u001a\u00060\u0014R\u00020\u00008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcn/lvdou/vod/ui/play/PlaySourceDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "playSourceIndex", "", "playList", "", "Lcn/lvdou/vod/bean/PlayFromBean;", "(Landroid/content/Context;ILjava/util/List;)V", "playActivity", "Ljava/lang/ref/WeakReference;", "Lcn/lvdou/vod/ui/play/NewPlayActivity;", "getPlayList", "()Ljava/util/List;", "getPlaySourceIndex", "()I", "setPlaySourceIndex", "(I)V", "selectionAdapter", "Lcn/lvdou/vod/ui/play/PlaySourceDialog$SelectionAdapter;", "getSelectionAdapter", "()Lcn/lvdou/vod/ui/play/PlaySourceDialog$SelectionAdapter;", "selectionAdapter$delegate", "Lkotlin/Lazy;", "spanCount", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "SelectionAdapter", "app_release"})
public final class PlaySourceDialog extends android.app.Dialog {
    private java.lang.ref.WeakReference<cn.lvdou.vod.ui.play.NewPlayActivity> playActivity;
    private int spanCount;
    private final kotlin.Lazy selectionAdapter$delegate = null;
    private int playSourceIndex;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<cn.lvdou.vod.bean.PlayFromBean> playList = null;
    
    private final cn.lvdou.vod.ui.play.PlaySourceDialog.SelectionAdapter getSelectionAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final int getPlaySourceIndex() {
        return 0;
    }
    
    public final void setPlaySourceIndex(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<cn.lvdou.vod.bean.PlayFromBean> getPlayList() {
        return null;
    }
    
    public PlaySourceDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int playSourceIndex, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends cn.lvdou.vod.bean.PlayFromBean> playList) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014\u00a8\u0006\u000b"}, d2 = {"Lcn/lvdou/vod/ui/play/PlaySourceDialog$SelectionAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcn/lvdou/vod/bean/PlayFromBean;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "data", "", "(Lcn/lvdou/vod/ui/play/PlaySourceDialog;Ljava/util/List;)V", "convert", "", "helper", "item", "app_release"})
    public final class SelectionAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<cn.lvdou.vod.bean.PlayFromBean, com.chad.library.adapter.base.BaseViewHolder> {
        
        @java.lang.Override()
        protected void convert(@org.jetbrains.annotations.NotNull()
        com.chad.library.adapter.base.BaseViewHolder helper, @org.jetbrains.annotations.NotNull()
        cn.lvdou.vod.bean.PlayFromBean item) {
        }
        
        public SelectionAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends cn.lvdou.vod.bean.PlayFromBean> data) {
            super(0, null);
        }
    }
}