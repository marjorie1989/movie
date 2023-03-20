package cn.lvdou.vod.ui.pay;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\b\u0010\r\u001a\u00020\u0007H\u0015J\b\u0010\u000e\u001a\u00020\u0007H\u0014J\"\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcn/lvdou/vod/ui/pay/PayFragment;", "Lcn/lvdou/vod/base/BaseFragment;", "()V", "orderCode", "", "packaged", "cardBuy", "", "checkOrder", "getLayoutId", "", "getPayTip", "getScoreList", "initListener", "initLoad", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "pointPurchase", "money", "upgrade", "price", "hitMsg", "Companion", "app_debug"})
public final class PayFragment extends cn.lvdou.vod.base.BaseFragment {
    private java.lang.String orderCode;
    private java.lang.String packaged;
    public static final int REQUEST_PAY = 0;
    public static final cn.lvdou.vod.ui.pay.PayFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    @java.lang.Override()
    protected void initListener() {
    }
    
    private final void pointPurchase() {
    }
    
    @java.lang.Override()
    protected void initLoad() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void getPayTip() {
    }
    
    private final void pointPurchase(java.lang.String money) {
    }
    
    private final void getScoreList() {
    }
    
    private final void checkOrder() {
    }
    
    private final void cardBuy() {
    }
    
    private final void upgrade(java.lang.String price, java.lang.String hitMsg) {
    }
    
    public PayFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcn/lvdou/vod/ui/pay/PayFragment$Companion;", "", "()V", "REQUEST_PAY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}