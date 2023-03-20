package cn.lvdou.vod.ui.withdraw;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0014J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\b\u0010\u0014\u001a\u00020\u0010H\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u0014\u0010\u0018\u001a\u00020\u00102\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001e"}, d2 = {"Lcn/lvdou/vod/ui/withdraw/GoldWithdrawActivity;", "Lcn/lvdou/vod/base/BaseActivity;", "()V", "array", "Ljava/util/ArrayList;", "", "curPayType", "", "curRecordIndex", "recordAdapter", "Lcn/lvdou/vod/ui/withdraw/GoldWithdrawActivity$RecordAdapter;", "getRecordAdapter", "()Lcn/lvdou/vod/ui/withdraw/GoldWithdrawActivity$RecordAdapter;", "recordAdapter$delegate", "Lkotlin/Lazy;", "getGlodTip", "", "getLayoutResID", "getRecordData", "initData", "initListener", "initView", "isUseEventBus", "", "onUserInfoChanged", "userinfo", "Lcn/lvdou/vod/bean/UserInfoBean;", "refreshRecordData", "withdraw", "RecordAdapter", "app_release"})
public final class GoldWithdrawActivity extends cn.lvdou.vod.base.BaseActivity {
    private final java.util.ArrayList<java.lang.String> array = null;
    private int curPayType;
    private int curRecordIndex;
    private final kotlin.Lazy recordAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final cn.lvdou.vod.ui.withdraw.GoldWithdrawActivity.RecordAdapter getRecordAdapter() {
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
    
    @java.lang.Override()
    protected boolean isUseEventBus() {
        return false;
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void onUserInfoChanged(@org.jetbrains.annotations.Nullable()
    cn.lvdou.vod.bean.UserInfoBean userinfo) {
    }
    
    private final void getGlodTip() {
    }
    
    private final void refreshRecordData() {
    }
    
    private final void getRecordData() {
    }
    
    private final void withdraw() {
    }
    
    public GoldWithdrawActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0014\u00a8\u0006\t"}, d2 = {"Lcn/lvdou/vod/ui/withdraw/GoldWithdrawActivity$RecordAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcn/lvdou/vod/bean/GoldWithdrawRecordBean;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "()V", "convert", "", "helper", "item", "app_release"})
    static final class RecordAdapter extends com.chad.library.adapter.base.BaseQuickAdapter<cn.lvdou.vod.bean.GoldWithdrawRecordBean, com.chad.library.adapter.base.BaseViewHolder> {
        
        @java.lang.Override()
        protected void convert(@org.jetbrains.annotations.NotNull()
        com.chad.library.adapter.base.BaseViewHolder helper, @org.jetbrains.annotations.Nullable()
        cn.lvdou.vod.bean.GoldWithdrawRecordBean item) {
        }
        
        public RecordAdapter() {
            super(0, null);
        }
    }
}