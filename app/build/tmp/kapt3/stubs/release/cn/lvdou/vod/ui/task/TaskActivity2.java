package cn.lvdou.vod.ui.task;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0002\u0014\u0015B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0014J\b\u0010\u000f\u001a\u00020\rH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0014J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0016"}, d2 = {"Lcn/lvdou/vod/ui/task/TaskActivity2;", "Lcn/lvdou/vod/base/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "taskAdapter", "Lcn/lvdou/vod/ui/task/TaskActivity2$TaskAdapter;", "getTaskAdapter", "()Lcn/lvdou/vod/ui/task/TaskActivity2$TaskAdapter;", "taskAdapter$delegate", "Lkotlin/Lazy;", "getLayoutResID", "", "getTaskList", "", "initData", "initListener", "initView", "onClick", "v", "Landroid/view/View;", "Companion", "TaskAdapter", "app_release"})
public final class TaskActivity2 extends cn.lvdou.vod.base.BaseActivity implements android.view.View.OnClickListener {
    private final kotlin.Lazy taskAdapter$delegate = null;
    public static final cn.lvdou.vod.ui.task.TaskActivity2.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final cn.lvdou.vod.ui.task.TaskActivity2.TaskAdapter getTaskAdapter() {
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
    
    private final void getTaskList() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public TaskActivity2() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcn/lvdou/vod/ui/task/TaskActivity2$TaskAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcn/lvdou/vod/bean/TaskItemBean;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "setActivity", "convert", "", "helper", "item", "app_release"})
    public static final class TaskAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<cn.lvdou.vod.bean.TaskItemBean, com.chad.library.adapter.base.BaseViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private android.app.Activity activity;
        
        @java.lang.Override()
        protected void convert(@org.jetbrains.annotations.NotNull()
        com.chad.library.adapter.base.BaseViewHolder helper, @org.jetbrains.annotations.Nullable()
        cn.lvdou.vod.bean.TaskItemBean item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.Activity getActivity() {
            return null;
        }
        
        public final void setActivity(@org.jetbrains.annotations.NotNull()
        android.app.Activity p0) {
        }
        
        public TaskAdapter(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
            super(0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcn/lvdou/vod/ui/task/TaskActivity2$Companion;", "", "()V", "start", "", "app_release"})
    public static final class Companion {
        
        public final void start() {
        }
        
        private Companion() {
            super();
        }
    }
}