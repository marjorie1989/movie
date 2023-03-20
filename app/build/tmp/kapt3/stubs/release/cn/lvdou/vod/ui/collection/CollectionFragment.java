package cn.lvdou.vod.ui.collection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0012\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0014J\b\u0010\u0010\u001a\u00020\fH\u0014J\b\u0010\u0011\u001a\u00020\fH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcn/lvdou/vod/ui/collection/CollectionFragment;", "Lcn/lvdou/vod/base/BaseFragment;", "()V", "collectionAdapter", "Lcn/lvdou/vod/ui/collection/CollectionFragment$CollectionAdapter;", "getCollectionAdapter", "()Lcn/lvdou/vod/ui/collection/CollectionFragment$CollectionAdapter;", "collectionAdapter$delegate", "Lkotlin/Lazy;", "curCollectionPage", "", "getCollectionList", "", "getLayoutId", "getSelectCount", "initListener", "initView", "onResume", "CollectionAdapter", "Companion", "app_release"})
public final class CollectionFragment extends cn.lvdou.vod.base.BaseFragment {
    private int curCollectionPage;
    private final kotlin.Lazy collectionAdapter$delegate = null;
    public static final cn.lvdou.vod.ui.collection.CollectionFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final cn.lvdou.vod.ui.collection.CollectionFragment.CollectionAdapter getCollectionAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    protected void initView() {
    }
    
    @java.lang.Override()
    protected void initListener() {
    }
    
    private final void getCollectionList() {
    }
    
    private final int getSelectCount() {
        return 0;
    }
    
    public CollectionFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final cn.lvdou.vod.ui.collection.CollectionFragment newInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0014\u00a8\u0006\t"}, d2 = {"Lcn/lvdou/vod/ui/collection/CollectionFragment$CollectionAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcn/lvdou/vod/bean/CollectionBean;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "()V", "convert", "", "helper", "item", "app_release"})
    public static final class CollectionAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<cn.lvdou.vod.bean.CollectionBean, com.chad.library.adapter.base.BaseViewHolder> {
        
        @java.lang.Override()
        protected void convert(@org.jetbrains.annotations.NotNull()
        com.chad.library.adapter.base.BaseViewHolder helper, @org.jetbrains.annotations.Nullable()
        cn.lvdou.vod.bean.CollectionBean item) {
        }
        
        public CollectionAdapter() {
            super(0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcn/lvdou/vod/ui/collection/CollectionFragment$Companion;", "", "()V", "newInstance", "Lcn/lvdou/vod/ui/collection/CollectionFragment;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final cn.lvdou.vod.ui.collection.CollectionFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}