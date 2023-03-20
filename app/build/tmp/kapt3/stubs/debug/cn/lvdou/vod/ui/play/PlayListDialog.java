package cn.lvdou.vod.ui.play;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u000f\u001a\u00060\u0010R\u00020\u00008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001f"}, d2 = {"Lcn/lvdou/vod/ui/play/PlayListDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "urlIndex", "", "playList", "", "Lcn/lvdou/vod/bean/UrlBean;", "(Landroid/content/Context;ILjava/util/List;)V", "playActivity", "Ljava/lang/ref/WeakReference;", "Lcn/lvdou/vod/ui/play/NewPlayActivity;", "getPlayList", "()Ljava/util/List;", "selectionAdapter", "Lcn/lvdou/vod/ui/play/PlayListDialog$SelectionAdapter;", "getSelectionAdapter", "()Lcn/lvdou/vod/ui/play/PlayListDialog$SelectionAdapter;", "selectionAdapter$delegate", "Lkotlin/Lazy;", "spanCount", "getUrlIndex", "()I", "setUrlIndex", "(I)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "SelectionAdapter", "app_debug"})
public final class PlayListDialog extends android.app.Dialog {
    private java.lang.ref.WeakReference<cn.lvdou.vod.ui.play.NewPlayActivity> playActivity;
    private int spanCount;
    private final kotlin.Lazy selectionAdapter$delegate = null;
    private int urlIndex;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<cn.lvdou.vod.bean.UrlBean> playList = null;
    
    private final cn.lvdou.vod.ui.play.PlayListDialog.SelectionAdapter getSelectionAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final int getUrlIndex() {
        return 0;
    }
    
    public final void setUrlIndex(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<cn.lvdou.vod.bean.UrlBean> getPlayList() {
        return null;
    }
    
    public PlayListDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int urlIndex, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends cn.lvdou.vod.bean.UrlBean> playList) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014\u00a8\u0006\u000b"}, d2 = {"Lcn/lvdou/vod/ui/play/PlayListDialog$SelectionAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcn/lvdou/vod/bean/UrlBean;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "data", "", "(Lcn/lvdou/vod/ui/play/PlayListDialog;Ljava/util/List;)V", "convert", "", "helper", "item", "app_debug"})
    public final class SelectionAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<cn.lvdou.vod.bean.UrlBean, com.chad.library.adapter.base.BaseViewHolder> {
        
        @java.lang.Override()
        protected void convert(@org.jetbrains.annotations.NotNull()
        com.chad.library.adapter.base.BaseViewHolder helper, @org.jetbrains.annotations.NotNull()
        cn.lvdou.vod.bean.UrlBean item) {
        }
        
        public SelectionAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends cn.lvdou.vod.bean.UrlBean> data) {
            super(0, null);
        }
    }
}