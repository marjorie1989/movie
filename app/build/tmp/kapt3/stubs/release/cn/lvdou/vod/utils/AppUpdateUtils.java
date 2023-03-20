package cn.lvdou.vod.utils;

import java.lang.System;

/**
 * Times: 2020/6/9 08:48
 * Author: songjian
 * Description:APP版本更新
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcn/lvdou/vod/utils/AppUpdateUtils;", "", "()V", "fos", "Ljava/io/FileOutputStream;", "isTream", "Ljava/io/InputStream;", "lisenter", "Lcn/lvdou/vod/utils/AppUpdateUtils$DowloadingLisenter;", "mHttpClient", "Lokhttp3/OkHttpClient;", "getMHttpClient", "()Lokhttp3/OkHttpClient;", "setOnDownloadingLisenter", "", "startDownload2", "context", "Landroid/content/Context;", "downloadPath", "", "writeResponseBodyToDisk", "response", "Lokhttp3/ResponseBody;", "DowloadingLisenter", "app_release"})
public final class AppUpdateUtils {
    @org.jetbrains.annotations.NotNull()
    private static final okhttp3.OkHttpClient mHttpClient = null;
    private static java.io.InputStream isTream;
    private static java.io.FileOutputStream fos;
    private static cn.lvdou.vod.utils.AppUpdateUtils.DowloadingLisenter lisenter;
    public static final cn.lvdou.vod.utils.AppUpdateUtils INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient getMHttpClient() {
        return null;
    }
    
    public final void startDownload2(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String downloadPath) {
    }
    
    private final void writeResponseBodyToDisk(okhttp3.ResponseBody response, android.content.Context context) {
    }
    
    public final void setOnDownloadingLisenter(@org.jetbrains.annotations.NotNull()
    cn.lvdou.vod.utils.AppUpdateUtils.DowloadingLisenter lisenter) {
    }
    
    private AppUpdateUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcn/lvdou/vod/utils/AppUpdateUtils$DowloadingLisenter;", "", "downloadFail", "", "downloadSuc", "path", "Ljava/io/File;", "downloading", "progress", "", "app_release"})
    public static abstract interface DowloadingLisenter {
        
        public abstract void downloading(@org.jetbrains.annotations.NotNull()
        java.lang.String progress);
        
        public abstract void downloadSuc(@org.jetbrains.annotations.NotNull()
        java.io.File path);
        
        public abstract void downloadFail();
    }
}