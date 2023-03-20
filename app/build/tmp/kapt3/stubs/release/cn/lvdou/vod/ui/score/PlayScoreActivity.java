package cn.lvdou.vod.ui.score;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0016\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0014J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0006H\u0002J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0002J\b\u0010\u001d\u001a\u00020\u000fH\u0014J\b\u0010\u001e\u001a\u00020\u000fH\u0014J\b\u0010\u001f\u001a\u00020\u000fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006!"}, d2 = {"Lcn/lvdou/vod/ui/score/PlayScoreActivity;", "Lcn/lvdou/vod/base/BaseActivity;", "()V", "curPage", "", "isAllSelect", "", "isEditMode", "playScoreAdapter", "Lcn/lvdou/vod/ui/score/PlayScoreActivity$PlayScoreAdapter;", "getPlayScoreAdapter", "()Lcn/lvdou/vod/ui/score/PlayScoreActivity$PlayScoreAdapter;", "playScoreAdapter$delegate", "Lkotlin/Lazy;", "changeDeleteNum", "", "changeEditMode", "deleteCollection", "ids", "", "", "deletePlayScore", "id", "getLayoutResID", "getPlayScore", "page", "isLoadMore", "getSelectCollection", "getSelectCount", "initListener", "initView", "onResume", "PlayScoreAdapter", "app_release"})
public final class PlayScoreActivity extends cn.lvdou.vod.base.BaseActivity {
    private boolean isEditMode;
    private boolean isAllSelect;
    private int curPage;
    private final kotlin.Lazy playScoreAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final cn.lvdou.vod.ui.score.PlayScoreActivity.PlayScoreAdapter getPlayScoreAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected int getLayoutResID() {
        return 0;
    }
    
    @java.lang.Override()
    protected void initView() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void initListener() {
    }
    
    private final java.util.List<java.lang.String> getSelectCollection() {
        return null;
    }
    
    private final void changeEditMode() {
    }
    
    private final int getSelectCount() {
        return 0;
    }
    
    private final void changeDeleteNum() {
    }
    
    private final void deleteCollection(java.util.List<java.lang.String> ids) {
    }
    
    private final void deletePlayScore(java.lang.String id) {
    }
    
    private final void getPlayScore(int page, boolean isLoadMore) {
    }
    
    public PlayScoreActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\b\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcn/lvdou/vod/ui/score/PlayScoreActivity$PlayScoreAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcn/lvdou/vod/bean/PlayScoreBean;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "isEditMode", "", "(Z)V", "()Z", "setEditMode", "changeEditMode", "", "convert", "helper", "item", "app_release"})
    static final class PlayScoreAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<cn.lvdou.vod.bean.PlayScoreBean, com.chad.library.adapter.base.BaseViewHolder> {
        private boolean isEditMode;
        
        @java.lang.Override()
        protected void convert(@org.jetbrains.annotations.NotNull()
        com.chad.library.adapter.base.BaseViewHolder helper, @org.jetbrains.annotations.Nullable()
        cn.lvdou.vod.bean.PlayScoreBean item) {
        }
        
        public final void changeEditMode(boolean isEditMode) {
        }
        
        public final boolean isEditMode() {
            return false;
        }
        
        public final void setEditMode(boolean p0) {
        }
        
        public PlayScoreAdapter(boolean isEditMode) {
            super(0, null);
        }
        
        public PlayScoreAdapter() {
            super(0, null);
        }
    }
}