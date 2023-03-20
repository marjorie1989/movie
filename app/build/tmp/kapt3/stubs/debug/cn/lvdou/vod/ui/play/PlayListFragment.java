package cn.lvdou.vod.ui.play;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0010H\u0015J\u001c\u0010\u0012\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0005\u001a\u00060\u0006R\u00020\u00008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcn/lvdou/vod/ui/play/PlayListFragment;", "Lcn/lvdou/vod/base/BaseFragment;", "()V", "playActivity", "Lcn/lvdou/vod/ui/play/NewPlayActivity;", "selectionAdapter", "Lcn/lvdou/vod/ui/play/PlayListFragment$SelectionAdapter;", "getSelectionAdapter", "()Lcn/lvdou/vod/ui/play/PlayListFragment$SelectionAdapter;", "selectionAdapter$delegate", "Lkotlin/Lazy;", "spanCount", "", "urlIndex", "getLayoutId", "initListener", "", "initView", "showPlayList", "playList", "", "Lcn/lvdou/vod/bean/UrlBean;", "Companion", "SelectionAdapter", "app_debug"})
public final class PlayListFragment extends cn.lvdou.vod.base.BaseFragment {
    private int spanCount;
    private int urlIndex;
    private cn.lvdou.vod.ui.play.NewPlayActivity playActivity;
    private final kotlin.Lazy selectionAdapter$delegate = null;
    public static final cn.lvdou.vod.ui.play.PlayListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final cn.lvdou.vod.ui.play.PlayListFragment.SelectionAdapter getSelectionAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    protected void initView() {
    }
    
    @java.lang.Override()
    protected void initListener() {
    }
    
    public final void showPlayList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends cn.lvdou.vod.bean.UrlBean> playList, int urlIndex) {
    }
    
    public PlayListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final cn.lvdou.vod.ui.play.PlayListFragment newInstance(int spanCount) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014\u00a8\u0006\t"}, d2 = {"Lcn/lvdou/vod/ui/play/PlayListFragment$SelectionAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcn/lvdou/vod/bean/UrlBean;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "(Lcn/lvdou/vod/ui/play/PlayListFragment;)V", "convert", "", "helper", "item", "app_debug"})
    public final class SelectionAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<cn.lvdou.vod.bean.UrlBean, com.chad.library.adapter.base.BaseViewHolder> {
        
        @java.lang.Override()
        protected void convert(@org.jetbrains.annotations.NotNull()
        com.chad.library.adapter.base.BaseViewHolder helper, @org.jetbrains.annotations.NotNull()
        cn.lvdou.vod.bean.UrlBean item) {
        }
        
        public SelectionAdapter() {
            super(0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcn/lvdou/vod/ui/play/PlayListFragment$Companion;", "", "()V", "newInstance", "Lcn/lvdou/vod/ui/play/PlayListFragment;", "spanCount", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final cn.lvdou.vod.ui.play.PlayListFragment newInstance(int spanCount) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}