package cn.lvdou.vod.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004H\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0016\u0010\u0018\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004H\u0007R\'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0087\u0084\u0002\u00a2\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR&\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001a"}, d2 = {"Lcn/lvdou/vod/utils/UserUtils;", "", "()V", "needLogin", "", "", "needLogin$annotations", "getNeedLogin", "()Ljava/util/List;", "needLogin$delegate", "Lkotlin/Lazy;", "userInfo", "Lcn/lvdou/vod/bean/UserInfoBean;", "userInfo$annotations", "getUserInfo", "()Lcn/lvdou/vod/bean/UserInfoBean;", "setUserInfo", "(Lcn/lvdou/vod/bean/UserInfoBean;)V", "getLocalCookie", "Lokhttp3/Cookie;", "isLogin", "", "logout", "", "saveCookies", "cookies", "app_debug"})
public final class UserUtils {
    @org.jetbrains.annotations.Nullable()
    private static cn.lvdou.vod.bean.UserInfoBean userInfo;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy needLogin$delegate = null;
    public static final cn.lvdou.vod.utils.UserUtils INSTANCE = null;
    
    public static void userInfo$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final cn.lvdou.vod.bean.UserInfoBean getUserInfo() {
        return null;
    }
    
    public static final void setUserInfo(@org.jetbrains.annotations.Nullable()
    cn.lvdou.vod.bean.UserInfoBean p0) {
    }
    
    public static void needLogin$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<java.lang.String> getNeedLogin() {
        return null;
    }
    
    public static final boolean isLogin() {
        return false;
    }
    
    public static final void logout() {
    }
    
    public static final void saveCookies(@org.jetbrains.annotations.NotNull()
    java.util.List<okhttp3.Cookie> cookies) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<okhttp3.Cookie> getLocalCookie() {
        return null;
    }
    
    private UserUtils() {
        super();
    }
}