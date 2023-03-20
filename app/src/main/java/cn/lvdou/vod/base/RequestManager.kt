package com.github.StormWyrm.wanandroid.base.net

import androidx.appcompat.app.AppCompatActivity
import cn.lvdou.vod.base.BaseActivity
import cn.lvdou.vod.bean.BaseResult
import cn.lvdou.vod.base.BaseFragment
import com.github.StormWyrm.wanandroid.base.net.convert.ExceptionConvert
import com.github.StormWyrm.wanandroid.base.net.convert.ResponseConvert
import cn.lvdou.vod.base.observer.BaseObserver
import cn.lvdou.vod.bean.GetScoreBean
import com.github.StormWyrm.wanandroid.base.sheduler.IoMainScheduler
import io.reactivex.Observable

object RequestManager {
    @JvmStatic
    fun <T> execute(activity: BaseActivity, observable: Observable<BaseResult<T>>?, observer: BaseObserver<T>) {
        if (observable == null)
            throw RuntimeException("the observable is null")

        observable
            .map(ResponseConvert())
            .onErrorResumeNext(ExceptionConvert<T>())
            .compose(IoMainScheduler())
            .subscribe(observer)

        activity.addDisposable(observer.getDisposable())
    }
    @JvmStatic
    fun <T> execute( observable: Observable<BaseResult<T>>?, observer: BaseObserver<T>) {
        if (observable == null)
            throw RuntimeException("the observable is null")

        observable
                .map(ResponseConvert())
                .onErrorResumeNext(ExceptionConvert<T>())
                .compose(IoMainScheduler())
                .subscribe(observer)


    }
    @JvmStatic
    fun <T> execute(fragment: BaseFragment, observable: Observable<BaseResult<T>>?, observer: BaseObserver<T>) {
        if (observable == null)
            throw RuntimeException("the observable is null")
        observable
                .map(ResponseConvert())
                .onErrorResumeNext(ExceptionConvert<T>())
                .compose(IoMainScheduler())
                .subscribe(observer)
        fragment
    }

    @JvmStatic
    fun <T>  execute(mActivity: AppCompatActivity, sendDanmu: Observable<BaseResult<T>>?, baseObserver: BaseObserver<T>) {
        if (sendDanmu == null)
            throw RuntimeException("the observable is null")

        sendDanmu
                .map(ResponseConvert())
                .onErrorResumeNext(ExceptionConvert<T>())
                .compose(IoMainScheduler())
                .subscribe(baseObserver)

        mActivity
    }
}