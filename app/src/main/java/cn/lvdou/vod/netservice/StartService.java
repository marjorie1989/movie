package cn.lvdou.vod.netservice;

import cn.lvdou.vod.ApiConfig;
import cn.lvdou.vod.bean.StartBean;
import cn.lvdou.vod.bean.BaseResult;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface StartService {
    @GET(ApiConfig.getStart)
    Observable<BaseResult<StartBean>> getStartBean();

//    @GET(ApiConfig.getStart)
//    Observable<BaseResult<Object>> getStartBean();
}
