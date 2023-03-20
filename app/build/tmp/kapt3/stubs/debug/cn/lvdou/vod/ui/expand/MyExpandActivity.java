package cn.lvdou.vod.ui.expand;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\fH\u0014J\b\u0010\u0016\u001a\u00020\u0014H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0014J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006 "}, d2 = {"Lcn/lvdou/vod/ui/expand/MyExpandActivity;", "Lcn/lvdou/vod/base/BaseActivity;", "Landroid/view/View$OnClickListener;", "Lcom/scwang/smartrefresh/layout/listener/OnLoadMoreListener;", "Lcom/scwang/smartrefresh/layout/listener/OnRefreshListener;", "()V", "isRefresh", "", "mDataList", "Ljava/util/ArrayList;", "Lcn/lvdou/vod/bean/MyExpand$ListBean;", "mPage", "", "msgAdapter", "Lcn/lvdou/vod/ui/expand/MyExpandActivity$ExpandAdapter;", "getMsgAdapter", "()Lcn/lvdou/vod/ui/expand/MyExpandActivity$ExpandAdapter;", "msgAdapter$delegate", "Lkotlin/Lazy;", "getExpandList", "", "getLayoutResID", "initData", "initView", "onClick", "v", "Landroid/view/View;", "onLoadMore", "refreshLayout", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "onRefresh", "ExpandAdapter", "app_debug"})
public final class MyExpandActivity extends cn.lvdou.vod.base.BaseActivity implements android.view.View.OnClickListener, com.scwang.smartrefresh.layout.listener.OnLoadMoreListener, com.scwang.smartrefresh.layout.listener.OnRefreshListener {
    private int mPage;
    private boolean isRefresh;
    private java.util.ArrayList<cn.lvdou.vod.bean.MyExpand.ListBean> mDataList;
    private final kotlin.Lazy msgAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final cn.lvdou.vod.ui.expand.MyExpandActivity.ExpandAdapter getMsgAdapter() {
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
    protected void initData() {
    }
    
    private final void getExpandList() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void onLoadMore(@org.jetbrains.annotations.NotNull()
    com.scwang.smartrefresh.layout.api.RefreshLayout refreshLayout) {
    }
    
    @java.lang.Override()
    public void onRefresh(@org.jetbrains.annotations.NotNull()
    com.scwang.smartrefresh.layout.api.RefreshLayout refreshLayout) {
    }
    
    public MyExpandActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcn/lvdou/vod/ui/expand/MyExpandActivity$ExpandAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcn/lvdou/vod/bean/MyExpand$ListBean;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "setActivity", "convert", "", "helper", "item", "app_debug"})
    public static final class ExpandAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<cn.lvdou.vod.bean.MyExpand.ListBean, com.chad.library.adapter.base.BaseViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private android.app.Activity activity;
        
        @java.lang.Override()
        protected void convert(@org.jetbrains.annotations.NotNull()
        com.chad.library.adapter.base.BaseViewHolder helper, @org.jetbrains.annotations.Nullable()
        cn.lvdou.vod.bean.MyExpand.ListBean item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.Activity getActivity() {
            return null;
        }
        
        public final void setActivity(@org.jetbrains.annotations.NotNull()
        android.app.Activity p0) {
        }
        
        public ExpandAdapter(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
            super(0, null);
        }
    }
}