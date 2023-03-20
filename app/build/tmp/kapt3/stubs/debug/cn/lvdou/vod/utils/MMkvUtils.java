package cn.lvdou.vod.utils;

import java.lang.System;

/**
 * Times: 2020/11/17 16:33
 * Author: sj
 * Description:腾讯MMKV框架，用来替代SP的，详情见https://github.com/Tencent/MMKV
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u0000 02\u00020\u0001:\u00010B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\u0006J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00182\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\n\u001a\u00020\u0006J\u001e\u0010\u001b\u001a\n \u001c*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\u0006J\u0006\u0010\u001e\u001a\u00020\u0006J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006J\u0010\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010\tJ\u0010\u0010%\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010\fJ\u0010\u0010&\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010\fJ\u0016\u0010\'\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006J\u0010\u0010(\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010\u0012J\u0016\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010+\u001a\u00020 2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010,\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018J\u0010\u0010-\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010\u001aJ\u0016\u0010.\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006J\u000e\u0010/\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcn/lvdou/vod/utils/MMkvUtils;", "", "()V", "mmkv", "Lcom/tencent/mmkv/MMKV;", "loadAccount", "", "loadAccount2", "loadAdvEntity", "Lcn/lvdou/vod/entity/AdvEntity;", "defaultValue", "loadAppConfig", "Lcn/lvdou/vod/bean/AppConfigBean;", "loadAppConfigAd", "loadBoolean", "", "key", "loadPlayScore", "Lcn/lvdou/vod/bean/PlayScoreBean;", "loadPlayTiaoZhuan", "vod_id", "", "loadPlayTiaoZhuan2", "loadSearchHot", "", "loadStartBean", "Lcn/lvdou/vod/bean/StartBean;", "loadString", "kotlin.jvm.PlatformType", "loadUserNickname", "loadUser_slgn_time", "saveAccount", "", "text", "saveAccount2", "saveAdvEntity", "value", "saveAppConfig", "saveAppConfigAd", "saveBoolean", "savePlayScore", "savePlayTiaoZhuan", "formatTime", "savePlayTiaoZhuan2", "saveSearchHot", "saveStartBean", "saveString", "saveUser_slgn_time", "Companion", "app_debug"})
public final class MMkvUtils {
    private com.tencent.mmkv.MMKV mmkv;
    private static final java.lang.String SEARC_HOT = "searchHotMsg";
    private static final java.lang.String START_BEAN = "startBeanMsg";
    private static final java.lang.String ADV_ENTITY = "advEntityMsg";
    private static final java.lang.String APP_CONFIG = "appConfigBeanMsg";
    private static final java.lang.String APP_CONFIG_AD = "appConfigBeanAdMsg";
    private static final java.lang.String PLAY_SCORE = "playScoreBeanMsg";
    private static final java.lang.String PLAY_TZ = "playTiaoZhuan";
    private static final java.lang.String PLAY_TZ2 = "playTiaoZhuan2";
    private static final java.lang.String USER_NICK_NAME = "USER_NICK_NAME";
    private static final java.lang.String USER = "account";
    private static final java.lang.String PASS = "account2";
    private static final java.lang.String USER_SLGN_TIME = "USER_SLGN_TIME";
    private static cn.lvdou.vod.utils.MMkvUtils mmkvUtils;
    public static final cn.lvdou.vod.utils.MMkvUtils.Companion Companion = null;
    
    /**
     * 存储SearchHot数据
     */
    public final void saveSearchHot(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> loadSearchHot(@org.jetbrains.annotations.NotNull()
    java.lang.String defaultValue) {
        return null;
    }
    
    /**
     * 存储StartBean数据
     */
    public final void saveStartBean(@org.jetbrains.annotations.Nullable()
    cn.lvdou.vod.bean.StartBean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final cn.lvdou.vod.bean.StartBean loadStartBean(@org.jetbrains.annotations.NotNull()
    java.lang.String defaultValue) {
        return null;
    }
    
    /**
     * 储存advEntity数据
     */
    public final void saveAdvEntity(@org.jetbrains.annotations.Nullable()
    cn.lvdou.vod.entity.AdvEntity value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final cn.lvdou.vod.entity.AdvEntity loadAdvEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String defaultValue) {
        return null;
    }
    
    /**
     * 储存AppConfig数据
     */
    public final void saveAppConfig(@org.jetbrains.annotations.Nullable()
    cn.lvdou.vod.bean.AppConfigBean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final cn.lvdou.vod.bean.AppConfigBean loadAppConfig(@org.jetbrains.annotations.NotNull()
    java.lang.String defaultValue) {
        return null;
    }
    
    /**
     * 储存AppConfig数据
     */
    public final void saveAppConfigAd(@org.jetbrains.annotations.Nullable()
    cn.lvdou.vod.bean.AppConfigBean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final cn.lvdou.vod.bean.AppConfigBean loadAppConfigAd(@org.jetbrains.annotations.NotNull()
    java.lang.String defaultValue) {
        return null;
    }
    
    public final void savePlayTiaoZhuan(@org.jetbrains.annotations.NotNull()
    java.lang.String formatTime, int vod_id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String loadPlayTiaoZhuan(int vod_id) {
        return null;
    }
    
    public final void savePlayTiaoZhuan2(@org.jetbrains.annotations.NotNull()
    java.lang.String formatTime, int vod_id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String loadPlayTiaoZhuan2(int vod_id) {
        return null;
    }
    
    public final void saveAccount(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String loadAccount() {
        return null;
    }
    
    public final void saveAccount2(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String loadAccount2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String loadUserNickname() {
        return null;
    }
    
    public final void saveUser_slgn_time(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String loadUser_slgn_time() {
        return null;
    }
    
    /**
     * 存储playScore数据
     */
    public final void savePlayScore(@org.jetbrains.annotations.Nullable()
    cn.lvdou.vod.bean.PlayScoreBean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final cn.lvdou.vod.bean.PlayScoreBean loadPlayScore(@org.jetbrains.annotations.NotNull()
    java.lang.String defaultValue) {
        return null;
    }
    
    public final boolean saveString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return false;
    }
    
    public final java.lang.String loadString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultValue) {
        return null;
    }
    
    public final boolean saveBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return false;
    }
    
    public final boolean loadBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean defaultValue) {
        return false;
    }
    
    public MMkvUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final cn.lvdou.vod.utils.MMkvUtils Buildsx() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0013\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcn/lvdou/vod/utils/MMkvUtils$Companion;", "", "()V", "ADV_ENTITY", "", "APP_CONFIG", "APP_CONFIG_AD", "PASS", "PLAY_SCORE", "PLAY_TZ", "PLAY_TZ2", "SEARC_HOT", "START_BEAN", "USER", "USER_NICK_NAME", "USER_SLGN_TIME", "mmkvUtils", "Lcn/lvdou/vod/utils/MMkvUtils;", "Builds", "Buildsx", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final cn.lvdou.vod.utils.MMkvUtils Builds() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final cn.lvdou.vod.utils.MMkvUtils Buildsx() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}