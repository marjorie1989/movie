package cn.lvdou.vod.ui.notice

import android.app.Activity
import android.content.Intent
import android.view.View
import cn.lvdou.vod.R
import cn.lvdou.vod.base.BaseActivity
import cn.lvdou.vod.bean.MessageDetail
import cn.lvdou.vod.netservice.VodService
import cn.lvdou.vod.utils.AgainstCheatUtil
import cn.lvdou.vod.utils.Retrofit2Utils
import cn.lvdou.vod.base.exception.ResponseException
import com.github.StormWyrm.wanandroid.base.net.RequestManager
import cn.lvdou.vod.base.observer.LoadingObserver
import kotlinx.android.synthetic.main.activity_message_detail.*

class MessageDetailActivity : BaseActivity(), View.OnClickListener {

    override fun getLayoutResID(): Int {
        return R.layout.activity_message_detail
    }

    companion object {
        var mId: String=""

        @JvmStatic
        fun start(activity: Activity, id: String) {
            mId = id
            val intent = Intent(activity, MessageDetailActivity::class.java)
            activity.startActivity(intent)
        }

    }


    override fun initView() {
        super.initView()
        rlBack.setOnClickListener(this)

    }

    override fun initData() {
        super.initData()
        getMsgDetail()
    }

    private fun getMsgDetail() {
        var vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
        if (AgainstCheatUtil.showWarn(vodService)) {
            return
        }
        RequestManager.execute(mActivity, vodService.getMsgDetail(mId),
                object : LoadingObserver<MessageDetail>(mActivity) {
                    override fun onSuccess(data: MessageDetail) {
                        tv_title.text = data.title
                        tv_time.text = data.create_date
                        tv_desc.text = data.content
                    }

                    override fun onError(e: ResponseException) {
                    }

                })
    }


    override fun onClick(v: View?) {
        when (v) {
            rlBack -> {
                finish()
            }
        }
    }
}