package cn.lvdou.vod.entity;

import java.lang.System;

/**
 * 广告
 *  {
 * "ad_select":"html",
 *
 * "html":{
 * "code":"<a href=\"http://www.shouzhuanmao.com/\" target=\"_blank\"><img src=\"https://storage.taifutj.com/admin/202001300958775new.jpg\" width=\"240px\" height=\"200px\" border=\"0\" /></a>",
 * "timeout":60
 * },
 * "vod":{
 * "url":""
 * }
 * }
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\tH\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006)"}, d2 = {"Lcn/lvdou/vod/entity/AdvEntity;", "", "ad_select", "", "html", "Lcn/lvdou/vod/entity/Html;", "video", "Lcn/lvdou/vod/entity/Vod;", "home_history", "", "jiexi_key", "(Ljava/lang/String;Lcn/lvdou/vod/entity/Html;Lcn/lvdou/vod/entity/Vod;ZLjava/lang/String;)V", "getAd_select", "()Ljava/lang/String;", "setAd_select", "(Ljava/lang/String;)V", "getHome_history", "()Z", "setHome_history", "(Z)V", "getHtml", "()Lcn/lvdou/vod/entity/Html;", "setHtml", "(Lcn/lvdou/vod/entity/Html;)V", "getJiexi_key", "setJiexi_key", "getVideo", "()Lcn/lvdou/vod/entity/Vod;", "setVideo", "(Lcn/lvdou/vod/entity/Vod;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_release"})
public final class AdvEntity {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String ad_select;
    @org.jetbrains.annotations.NotNull()
    private cn.lvdou.vod.entity.Html html;
    @org.jetbrains.annotations.NotNull()
    private cn.lvdou.vod.entity.Vod video;
    private boolean home_history;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String jiexi_key;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAd_select() {
        return null;
    }
    
    public final void setAd_select(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.lvdou.vod.entity.Html getHtml() {
        return null;
    }
    
    public final void setHtml(@org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.entity.Html p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.lvdou.vod.entity.Vod getVideo() {
        return null;
    }
    
    public final void setVideo(@org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.entity.Vod p0) {
    }
    
    public final boolean getHome_history() {
        return false;
    }
    
    public final void setHome_history(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getJiexi_key() {
        return null;
    }
    
    public final void setJiexi_key(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public AdvEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String ad_select, @org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.entity.Html html, @org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.entity.Vod video, boolean home_history, @org.jetbrains.annotations.NotNull()
    java.lang.String jiexi_key) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.lvdou.vod.entity.Html component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.lvdou.vod.entity.Vod component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * 广告
     *  {
     * "ad_select":"html",
     *
     * "html":{
     * "code":"<a href=\"http://www.shouzhuanmao.com/\" target=\"_blank\"><img src=\"https://storage.taifutj.com/admin/202001300958775new.jpg\" width=\"240px\" height=\"200px\" border=\"0\" /></a>",
     * "timeout":60
     * },
     * "vod":{
     * "url":""
     * }
     * }
     */
    @org.jetbrains.annotations.NotNull()
    public final cn.lvdou.vod.entity.AdvEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String ad_select, @org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.entity.Html html, @org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.entity.Vod video, boolean home_history, @org.jetbrains.annotations.NotNull()
    java.lang.String jiexi_key) {
        return null;
    }
    
    /**
     * 广告
     *  {
     * "ad_select":"html",
     *
     * "html":{
     * "code":"<a href=\"http://www.shouzhuanmao.com/\" target=\"_blank\"><img src=\"https://storage.taifutj.com/admin/202001300958775new.jpg\" width=\"240px\" height=\"200px\" border=\"0\" /></a>",
     * "timeout":60
     * },
     * "vod":{
     * "url":""
     * }
     * }
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * 广告
     *  {
     * "ad_select":"html",
     *
     * "html":{
     * "code":"<a href=\"http://www.shouzhuanmao.com/\" target=\"_blank\"><img src=\"https://storage.taifutj.com/admin/202001300958775new.jpg\" width=\"240px\" height=\"200px\" border=\"0\" /></a>",
     * "timeout":60
     * },
     * "vod":{
     * "url":""
     * }
     * }
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * 广告
     *  {
     * "ad_select":"html",
     *
     * "html":{
     * "code":"<a href=\"http://www.shouzhuanmao.com/\" target=\"_blank\"><img src=\"https://storage.taifutj.com/admin/202001300958775new.jpg\" width=\"240px\" height=\"200px\" border=\"0\" /></a>",
     * "timeout":60
     * },
     * "vod":{
     * "url":""
     * }
     * }
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}