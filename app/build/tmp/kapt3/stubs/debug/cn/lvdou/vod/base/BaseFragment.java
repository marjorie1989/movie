package cn.lvdou.vod.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020 J\b\u0010$\u001a\u00020 H\u0002J\b\u0010%\u001a\u00020 H\u0002J\b\u0010&\u001a\u00020\'H\'J\b\u0010(\u001a\u00020 H\u0014J\b\u0010)\u001a\u00020 H\u0014J\b\u0010*\u001a\u00020 H\u0014J\b\u0010+\u001a\u00020\u0004H\u0002J\b\u0010,\u001a\u00020\u0004H\u0002J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/H\u0016J\u0012\u00100\u001a\u00020 2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0010\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020\u0014H\u0016J\u0012\u00105\u001a\u00020 2\b\u00101\u001a\u0004\u0018\u000102H\u0016J&\u00106\u001a\u0004\u0018\u0001072\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u0010<\u001a\u00020 H\u0016J\u0010\u0010=\u001a\u00020 2\u0006\u0010>\u001a\u00020\u0004H\u0016J\u001a\u0010?\u001a\u00020 2\u0006\u0010@\u001a\u0002072\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u000e\u0010A\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0010\u0010B\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010C\u001a\u00020 H\u0004J\b\u0010D\u001a\u00020 H\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0004X\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006E"}, d2 = {"Lcn/lvdou/vod/base/BaseFragment;", "Lme/yokeyword/fragmentation/SupportFragment;", "()V", "isDataLoaded", "", "isFragmentHidden", "isNeedReload", "()Z", "setNeedReload", "(Z)V", "isUseEventBus", "setUseEventBus", "isViewCreated", "isVisibleToUser", "<set-?>", "Landroidx/appcompat/app/AppCompatActivity;", "mActivity", "getMActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mDisposablePool", "Lio/reactivex/disposables/CompositeDisposable;", "getMDisposablePool", "()Lio/reactivex/disposables/CompositeDisposable;", "mDisposablePool$delegate", "Lkotlin/Lazy;", "addDisposable", "", "disposable", "Lio/reactivex/disposables/Disposable;", "detach", "dispatchParentHiddenState", "dispatchParentVisibleState", "getLayoutId", "", "initListener", "initLoad", "initView", "isParentHidden", "isParentVisible", "joinQQGroup", "key", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onHiddenChanged", "hidden", "onViewCreated", "view", "removeDisposable", "setUserVisibleHint", "tryLoadData", "tryLoadData1", "app_debug"})
public abstract class BaseFragment extends me.yokeyword.fragmentation.SupportFragment {
    @org.jetbrains.annotations.NotNull()
    public android.content.Context mContext;
    @org.jetbrains.annotations.NotNull()
    private androidx.appcompat.app.AppCompatActivity mActivity;
    private boolean isUseEventBus;
    private final kotlin.Lazy mDisposablePool$delegate = null;
    private boolean isViewCreated;
    private boolean isVisibleToUser;
    private boolean isDataLoaded;
    private boolean isFragmentHidden;
    private boolean isNeedReload;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.app.AppCompatActivity getMActivity() {
        return null;
    }
    
    public boolean isUseEventBus() {
        return false;
    }
    
    public void setUseEventBus(boolean p0) {
    }
    
    private final io.reactivex.disposables.CompositeDisposable getMDisposablePool() {
        return null;
    }
    
    protected boolean isNeedReload() {
        return false;
    }
    
    protected void setNeedReload(boolean p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    /**
     * 使用ViewPager嵌套fragment时，切换ViewPager回调该方法
     */
    @java.lang.Override()
    public void setUserVisibleHint(boolean isVisibleToUser) {
    }
    
    /**
     * 当调用fragment的hide(),show()等方法时会回调
     */
    @java.lang.Override()
    public void onHiddenChanged(boolean hidden) {
    }
    
    /**
     * show()、hide()场景下，尝试请求数据
     */
    protected final void tryLoadData1() {
    }
    
    /**
     * show()、hide()场景下，当前fragment没隐藏，如果其子fragment也没隐藏，则尝试让子fragment请求数据
     */
    private final void dispatchParentHiddenState() {
    }
    
    /**
     * show()、hide()场景下，父fragment是否隐藏
     */
    private final boolean isParentHidden() {
        return false;
    }
    
    /**
     * ViewPager场景下，尝试请求数据
     */
    protected final void tryLoadData() {
    }
    
    /**
     * ViewPager场景下，判断父fragment是否可见
     */
    private final boolean isParentVisible() {
        return false;
    }
    
    /**
     * ViewPager场景下，当前fragment可见，如果其子fragment也可见，则尝试让子fragment加载请求
     */
    private final void dispatchParentVisibleState() {
    }
    
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutId();
    
    protected void initLoad() {
    }
    
    protected void initView() {
    }
    
    protected void initListener() {
    }
    
    public final void addDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable disposable) {
    }
    
    public final void removeDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable disposable) {
    }
    
    public final void detach() {
    }
    
    /**
     * **************
     * @param key 由官网生成的key
     * @return 返回true表示呼起手Q成功，返回false表示呼起失败
     */
    public boolean joinQQGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    public BaseFragment() {
        super();
    }
}