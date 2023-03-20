package cn.lvdou.vod.ui.pay;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\u0004H\u0014J\u0014\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcn/lvdou/vod/ui/pay/PayActivity;", "Lcn/lvdou/vod/base/BaseActivity;", "()V", "changeUserInfo", "", "getLayoutResID", "", "initListener", "initView", "isUseEventBus", "", "onResume", "onUserInfoChanged", "userinfo", "Lcn/lvdou/vod/bean/UserInfoBean;", "PayFragmentPagerAdapter", "app_debug"})
public final class PayActivity extends cn.lvdou.vod.base.BaseActivity {
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutResID() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void initView() {
    }
    
    @java.lang.Override()
    protected void initListener() {
    }
    
    @java.lang.Override()
    protected boolean isUseEventBus() {
        return false;
    }
    
    @org.greenrobot.eventbus.Subscribe()
    public final void onUserInfoChanged(@org.jetbrains.annotations.Nullable()
    cn.lvdou.vod.bean.UserInfoBean userinfo) {
    }
    
    private final void changeUserInfo() {
    }
    
    public PayActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0016\u00a8\u0006\f"}, d2 = {"Lcn/lvdou/vod/ui/pay/PayActivity$PayFragmentPagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Landroidx/fragment/app/FragmentManager;)V", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "getPageTitle", "", "app_debug"})
    static final class PayFragmentPagerAdapter extends androidx.fragment.app.FragmentStatePagerAdapter {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.fragment.app.Fragment getItem(int position) {
            return null;
        }
        
        @java.lang.Override()
        public int getCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.CharSequence getPageTitle(int position) {
            return null;
        }
        
        public PayFragmentPagerAdapter(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fm) {
            super(null);
        }
    }
}