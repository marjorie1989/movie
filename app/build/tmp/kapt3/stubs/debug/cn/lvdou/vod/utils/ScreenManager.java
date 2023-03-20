package cn.lvdou.vod.utils;

import java.lang.System;

/**
 * @ClassName: ScreenManager
 * @Desciption: 屏幕管理类
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000eJ\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\u0013"}, d2 = {"Lcn/lvdou/vod/utils/ScreenManager;", "", "()V", "getStatusBarHeight", "", "context", "Landroid/content/Context;", "setDeepStatusBar", "", "isChange", "mActivity", "Landroid/app/Activity;", "setFullScreen", "", "Landroidx/appcompat/app/AppCompatActivity;", "setScreenRoate", "setStatusBar", "colorResId", "Companion", "app_debug"})
public final class ScreenManager {
    private static final java.lang.String TAG = "ScreenManager";
    @org.jetbrains.annotations.Nullable()
    private static cn.lvdou.vod.utils.ScreenManager instance;
    public static final cn.lvdou.vod.utils.ScreenManager.Companion Companion = null;
    
    /**
     * 窗口全屏
     */
    public final void setFullScreen(boolean isChange, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity mActivity) {
    }
    
    /**
     * 沉浸状态栏
     */
    public final void setStatusBar(boolean isChange, @org.jetbrains.annotations.NotNull()
    android.app.Activity mActivity) {
    }
    
    public final boolean setDeepStatusBar(boolean isChange, @org.jetbrains.annotations.NotNull()
    android.app.Activity mActivity) {
        return false;
    }
    
    public final void setStatusBar(boolean isChange, int colorResId, @org.jetbrains.annotations.NotNull()
    android.app.Activity mActivity) {
    }
    
    /**
     * 旋转屏幕
     */
    public final void setScreenRoate(boolean isChange, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity mActivity) {
    }
    
    /**
     * 获取状态栏高度
     */
    public final int getStatusBarHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    public ScreenManager() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final synchronized cn.lvdou.vod.utils.ScreenManager getInstance() {
        return null;
    }
    
    private static final void setInstance(cn.lvdou.vod.utils.ScreenManager p0) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R0\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@BX\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcn/lvdou/vod/utils/ScreenManager$Companion;", "", "()V", "TAG", "", "<set-?>", "Lcn/lvdou/vod/utils/ScreenManager;", "instance", "instance$annotations", "getInstance", "()Lcn/lvdou/vod/utils/ScreenManager;", "setInstance", "(Lcn/lvdou/vod/utils/ScreenManager;)V", "app_debug"})
    public static final class Companion {
        
        public static void instance$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final synchronized cn.lvdou.vod.utils.ScreenManager getInstance() {
            return null;
        }
        
        private final void setInstance(cn.lvdou.vod.utils.ScreenManager p0) {
        }
        
        private Companion() {
            super();
        }
    }
}