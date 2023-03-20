package cn.lvdou.vod.wqddg;

import cn.lvdou.vod.ApiConfig;
import cn.lvdou.vod.bean.Wqddg_items;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface Wqddg_Code {

    @GET(ApiConfig.getStart)
    Observable<Wqddg_items> getStartBean();
}
