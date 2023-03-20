package cn.lvdou.vod.ui.collection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0002J\b\u0010\u0016\u001a\u00020\nH\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\nH\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0014J\b\u0010\u001a\u001a\u00020\u000fH\u0014J\b\u0010\u001b\u001a\u00020\u000fH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcn/lvdou/vod/ui/collection/CollectionActivity;", "Lcn/lvdou/vod/base/BaseActivity;", "()V", "collectionAdapter", "Lcn/lvdou/vod/ui/collection/CollectionActivity$CollectionAdapter;", "getCollectionAdapter", "()Lcn/lvdou/vod/ui/collection/CollectionActivity$CollectionAdapter;", "collectionAdapter$delegate", "Lkotlin/Lazy;", "curCollectionPage", "", "isAllSelect", "", "isEditMode", "changeDeleteNum", "", "changeEditMode", "deleteCollection", "ids", "", "getCollectionList", "isFresh", "getLayoutResID", "getSelectCollection", "getSelectCount", "initData", "initListener", "initView", "CollectionAdapter", "Companion", "app_debug"})
public final class CollectionActivity extends cn.lvdou.vod.base.BaseActivity {
    private int curCollectionPage;
    private boolean isEditMode;
    private boolean isAllSelect;
    private final kotlin.Lazy collectionAdapter$delegate = null;
    public static final cn.lvdou.vod.ui.collection.CollectionActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final cn.lvdou.vod.ui.collection.CollectionActivity.CollectionAdapter getCollectionAdapter() {
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
    protected void initListener() {
    }
    
    @java.lang.Override()
    protected void initData() {
    }
    
    private final void getCollectionList(boolean isFresh) {
    }
    
    private final void deleteCollection(java.lang.String ids) {
    }
    
    private final void changeEditMode() {
    }
    
    private final int getSelectCount() {
        return 0;
    }
    
    private final void changeDeleteNum() {
    }
    
    private final java.lang.String getSelectCollection() {
        return null;
    }
    
    public CollectionActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\b\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcn/lvdou/vod/ui/collection/CollectionActivity$CollectionAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcn/lvdou/vod/bean/CollectionBean;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "isEditMode", "", "(Z)V", "()Z", "setEditMode", "changeEditMode", "", "convert", "helper", "item", "app_debug"})
    public static final class CollectionAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<cn.lvdou.vod.bean.CollectionBean, com.chad.library.adapter.base.BaseViewHolder> {
        private boolean isEditMode;
        
        @java.lang.Override()
        protected void convert(@org.jetbrains.annotations.NotNull()
        com.chad.library.adapter.base.BaseViewHolder helper, @org.jetbrains.annotations.Nullable()
        cn.lvdou.vod.bean.CollectionBean item) {
        }
        
        public final void changeEditMode(boolean isEditMode) {
        }
        
        public final boolean isEditMode() {
            return false;
        }
        
        public final void setEditMode(boolean p0) {
        }
        
        public CollectionAdapter(boolean isEditMode) {
            super(0, null);
        }
        
        public CollectionAdapter() {
            super(0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcn/lvdou/vod/ui/collection/CollectionActivity$Companion;", "", "()V", "start", "", "app_debug"})
    public static final class Companion {
        
        public final void start() {
        }
        
        private Companion() {
            super();
        }
    }
}