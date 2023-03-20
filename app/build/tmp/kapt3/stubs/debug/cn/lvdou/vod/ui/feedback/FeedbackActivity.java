package cn.lvdou.vod.ui.feedback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u0012\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u000eH\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0014J\b\u0010\u0016\u001a\u00020\u0010H\u0014J\b\u0010\u0017\u001a\u00020\u0010H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcn/lvdou/vod/ui/feedback/FeedbackActivity;", "Lcn/lvdou/vod/base/BaseActivity;", "()V", "commitMsg", "", "curFeedbackPage", "", "feedbackAdapter", "Lcn/lvdou/vod/ui/feedback/FeedbackActivity$FeedbackAdapter;", "getFeedbackAdapter", "()Lcn/lvdou/vod/ui/feedback/FeedbackActivity$FeedbackAdapter;", "feedbackAdapter$delegate", "Lkotlin/Lazy;", "isHave", "", "feedback", "", "commentContent", "getFeedbackList", "isFresh", "getLayoutResID", "initData", "initListener", "initView", "Companion", "FeedbackAdapter", "app_debug"})
public final class FeedbackActivity extends cn.lvdou.vod.base.BaseActivity {
    private int curFeedbackPage;
    private java.lang.String commitMsg;
    private boolean isHave;
    private final kotlin.Lazy feedbackAdapter$delegate = null;
    public static final cn.lvdou.vod.ui.feedback.FeedbackActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final cn.lvdou.vod.ui.feedback.FeedbackActivity.FeedbackAdapter getFeedbackAdapter() {
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
    
    @java.lang.Override()
    protected void initListener() {
    }
    
    private final void feedback(java.lang.String commentContent) {
    }
    
    private final void getFeedbackList(boolean isFresh) {
    }
    
    public FeedbackActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0014\u00a8\u0006\t"}, d2 = {"Lcn/lvdou/vod/ui/feedback/FeedbackActivity$FeedbackAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcn/lvdou/vod/bean/FeedbackBean;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "()V", "convert", "", "helper", "item", "app_debug"})
    static final class FeedbackAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<cn.lvdou.vod.bean.FeedbackBean, com.chad.library.adapter.base.BaseViewHolder> {
        
        @java.lang.Override()
        protected void convert(@org.jetbrains.annotations.NotNull()
        com.chad.library.adapter.base.BaseViewHolder helper, @org.jetbrains.annotations.Nullable()
        cn.lvdou.vod.bean.FeedbackBean item) {
        }
        
        public FeedbackAdapter() {
            super(0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcn/lvdou/vod/ui/feedback/FeedbackActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", "message", "", "app_debug"})
    public static final class Companion {
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
        
        private Companion() {
            super();
        }
    }
}