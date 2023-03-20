package cn.lvdou.vod.ui.play;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001!B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0013\u001a\u00060\u0014R\u00020\u00008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006\""}, d2 = {"Lcn/lvdou/vod/ui/play/SpeedListDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "listener", "Lcn/lvdou/vod/ui/play/OnSpeedItemClickListener;", "urlIndex", "", "(Landroid/content/Context;Lcn/lvdou/vod/ui/play/OnSpeedItemClickListener;I)V", "playActivity", "Ljava/lang/ref/WeakReference;", "Lcn/lvdou/vod/ui/play/NewPlayActivity;", "playList", "Ljava/util/ArrayList;", "", "getPlayList", "()Ljava/util/ArrayList;", "setPlayList", "(Ljava/util/ArrayList;)V", "selectionAdapter", "Lcn/lvdou/vod/ui/play/SpeedListDialog$SelectionAdapter;", "getSelectionAdapter", "()Lcn/lvdou/vod/ui/play/SpeedListDialog$SelectionAdapter;", "selectionAdapter$delegate", "Lkotlin/Lazy;", "getUrlIndex", "()I", "setUrlIndex", "(I)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "SelectionAdapter", "app_debug"})
public final class SpeedListDialog extends android.app.Dialog {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> playList;
    private java.lang.ref.WeakReference<cn.lvdou.vod.ui.play.NewPlayActivity> playActivity;
    private final kotlin.Lazy selectionAdapter$delegate = null;
    private int urlIndex;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getPlayList() {
        return null;
    }
    
    public final void setPlayList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    private final cn.lvdou.vod.ui.play.SpeedListDialog.SelectionAdapter getSelectionAdapter() {
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
    
    public SpeedListDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.ui.play.OnSpeedItemClickListener listener, int urlIndex) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014\u00a8\u0006\u000b"}, d2 = {"Lcn/lvdou/vod/ui/play/SpeedListDialog$SelectionAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "Lcom/chad/library/adapter/base/BaseViewHolder;", "data", "", "(Lcn/lvdou/vod/ui/play/SpeedListDialog;Ljava/util/List;)V", "convert", "", "helper", "item", "app_debug"})
    public final class SelectionAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<java.lang.String, com.chad.library.adapter.base.BaseViewHolder> {
        
        @java.lang.Override()
        protected void convert(@org.jetbrains.annotations.NotNull()
        com.chad.library.adapter.base.BaseViewHolder helper, @org.jetbrains.annotations.NotNull()
        java.lang.String item) {
        }
        
        public SelectionAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> data) {
            super(0, null);
        }
    }
}