package cn.lvdou.vod.ui.expand

import android.content.Intent
import android.view.View
import cn.lvdou.vod.ApiConfig
import cn.lvdou.vod.R
import cn.lvdou.vod.base.BaseActivity
import cn.lvdou.vod.bean.ExpandCenter
import cn.lvdou.vod.bean.UserInfoBean
import cn.lvdou.vod.netservice.VodService
import cn.lvdou.vod.ui.share.ShareActivity
import cn.lvdou.vod.utils.AgainstCheatUtil
import cn.lvdou.vod.utils.Retrofit2Utils
import com.blankj.utilcode.util.ToastUtils
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestOptions
import cn.lvdou.vod.base.exception.ResponseException
import com.github.StormWyrm.wanandroid.base.net.RequestManager
import cn.lvdou.vod.base.observer.BaseObserver
import cn.lvdou.vod.base.observer.LoadingObserver
import kotlinx.android.synthetic.main.activity_expand_center.*

class ExpandCenterActivity : BaseActivity(), View.OnClickListener {

    override fun getLayoutResID(): Int {
        return R.layout.activity_expand_center
    }

    override fun initView() {
        super.initView()
        rlBack.setOnClickListener(this)
        tv_my_expand.setOnClickListener(this)
        rl_share.setOnClickListener(this)
    }

    override fun initData() {
        super.initData()
        getUserInfo()
        getExpandCenter()
    }

    private fun getUserInfo() {
        val vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
        if (AgainstCheatUtil.showWarn(vodService)) {
            return;
        }
        RequestManager.execute(this, vodService.userInfo(), object : BaseObserver<UserInfoBean>() {
            override fun onSuccess(data: UserInfoBean) {
                tv_nick.text = data.user_nick_name
                if (data.user_portrait.isNotEmpty()) {
                    Glide.with(mActivity)
                            .load(ApiConfig.MOGAI_BASE_URL + "/" + data.user_portrait)
                            .apply(RequestOptions.bitmapTransform(CircleCrop()))
                            .into(iv_avatar)
                } else {
                    Glide.with(mActivity)
                            .load(R.drawable.user_tx)
                            .apply(RequestOptions.bitmapTransform(CircleCrop()))
                            .into(iv_avatar)
                }
                when (data.user_level) {
                    "1" -> {
                        iv_start_level.setBackgroundResource(R.drawable.ic_lv1)
                        iv_end_level.setBackgroundResource(R.drawable.ic_lv2)
                        tv_next.text = "距离下一等级还差${data.leave_peoples}人"
                    }
                    "2" -> {
                        iv_start_level.setBackgroundResource(R.drawable.ic_lv2)
                        iv_end_level.setBackgroundResource(R.drawable.ic_lv3)
                        tv_next.text = "距离下一等级还差${data.leave_peoples}人"
                    }
                    "3" -> {
                        iv_start_level.setBackgroundResource(R.drawable.ic_lv3)
                        iv_end_level.setBackgroundResource(R.drawable.ic_lv4)
                        tv_next.text = "距离下一等级还差${data.leave_peoples}人"
                    }
                    "4" -> {
                        iv_start_level.setBackgroundResource(R.drawable.ic_lv4)
                        iv_end_level.setBackgroundResource(R.drawable.ic_lv5)
                        tv_next.text = "距离下一等级还差${data.leave_peoples}人"
                    }
                    "5" -> {
                        iv_start_level.setBackgroundResource(R.drawable.ic_lv5)
                        iv_end_level.setBackgroundResource(R.drawable.ic_lv5)
                        tv_next.text = "已达到最高VIP级别"
                    }
                }
            }

            override fun onError(e: ResponseException) {
                ToastUtils.showShort(e.getErrorMessage())
            }
        })
    }

    private fun getExpandCenter() {
        val vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
        if (AgainstCheatUtil.showWarn(vodService)) {
            return
        }
        RequestManager.execute(mActivity, vodService.expandCenter(),
                object : LoadingObserver<ExpandCenter>(mActivity) {
                    override fun onSuccess(data: ExpandCenter) {
                        tv_count1.text = "享受每日影片观影${data.v1.view_count}次"

                        tv_person2.text = "推广${data.v2.people_count}人"
                        tv_count2.text = "享受每日影片观影${data.v2.view_count}次"

                        tv_person3.text = "推广${data.v3.people_count}人"
                        tv_count3.text = "享受每日影片观影${data.v3.view_count}次"

                        tv_person4.text = "推广${data.v4.people_count}人"
                        tv_count4.text = "享受每日影片观影${data.v4.view_count}次"

                        tv_person5.text = "推广${data.v5.people_count}人"
                        tv_count5.text = "享受每日影片观影${data.v5.view_count}次"
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
            tv_my_expand -> {
                val intent = Intent(this@ExpandCenterActivity, MyExpandActivity::class.java)
                startActivity(intent)
            }
            rl_share -> {
                var intn=Intent(this@ExpandCenterActivity,ShareActivity::class.java)
                intn.putExtra("vom_name","有奖推广活动")
                intn.putExtra("vod_pic","www") //图片
                intn.putExtra("vod_class","分享给未安装过的用户、对方注册并打开应用算分享成功") //标签
                intn.putExtra("vod_blurd","推广1人可获得10积分\n推广3人可获得30积分\n积分可兑换会员免费观看全网影视") //注释
                startActivity(intn)
//                val intent = Intent(this@ExpandCenterActivity, ShareActivity::class.java)
//                startActivity(intent)
            }
        }
    }
}