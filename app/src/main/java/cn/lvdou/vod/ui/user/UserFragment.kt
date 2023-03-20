package cn.lvdou.vod.ui.user

import android.annotation.SuppressLint
import android.app.Activity
import android.app.ProgressDialog
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.Bitmap
import android.graphics.Color
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import cn.lvdou.vod.ApiConfig
import cn.lvdou.vod.App
import cn.lvdou.vod.R
import cn.lvdou.vod.base.observer.LoadingObserver
import cn.lvdou.vod.bean.*
import cn.lvdou.vod.download.SPUtils
import cn.lvdou.vod.netservice.VodService
import cn.lvdou.vod.ui.account.AccountSettingActivity
import cn.lvdou.vod.ui.collection.CollectionActivity
import cn.lvdou.vod.ui.down.AllDownloadActivity
import cn.lvdou.vod.ui.expand.ExpandCenterActivity
import cn.lvdou.vod.ui.login.LoginActivity
import cn.lvdou.vod.ui.pay.PayActivity
import cn.lvdou.vod.ui.play.PlayActivity
import cn.lvdou.vod.ui.score.PlayScoreActivity
import cn.lvdou.vod.ui.share.ShareActivity
import cn.lvdou.vod.ui.task.TaskActivity2
import cn.lvdou.vod.utils.*
import cn.lvdou.vod.utils.MMkvUtils.Companion.Builds
import com.blankj.utilcode.util.ActivityUtils
import com.blankj.utilcode.util.ToastUtils
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestOptions
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import cn.lvdou.vod.base.exception.ResponseException
import cn.lvdou.vod.base.BaseFragment
import com.github.StormWyrm.wanandroid.base.net.RequestManager
import cn.lvdou.vod.base.observer.BaseObserver
import cn.lvdou.vod.netservice.StartService
import cn.lvdou.vod.network.RetryWhen
import cn.lvdou.vod.ui.expand.MyExpandActivity
import cn.lvdou.vod.ui.feedback.FeedbackActivity
import cn.lvdou.vod.ui.notice.MessageCenterActivity
import com.blankj.utilcode.util.BarUtils
import com.bytedance.sdk.openadsdk.*
import com.google.gson.Gson
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import jp.wasabeef.glide.transformations.RoundedCornersTransformation
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_my_expand.*
import kotlinx.android.synthetic.main.fragment_user.*
import kotlinx.android.synthetic.main.fragment_user.iv_user_plc
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.litepal.LitePal
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
import com.youxiao.ssp.ad.core.AdClient
import com.youxiao.ssp.ad.bean.SSPAd
import kotlinx.android.synthetic.main.fragment_user.tv_user_time
import com.youxiao.ssp.ad.listener.AdLoadAdapter
import kotlinx.android.synthetic.main.fragment_user.rlPublic
import kotlinx.android.synthetic.main.fragment_vip.*


class UserFragment : BaseFragment() {
    private val playScoreAdapter: PlayScoreAdapter by lazy {
        PlayScoreAdapter().apply {
            setOnItemClickListener { adapter, view, position ->
                val item = adapter.getItem(position) as PlayScoreBean
                if (!UserUtils.isLogin()) {
                    LoginActivity.start()
                } else {
                    Builds().savePlayScore(item)
                    PlayActivity.startByPlayScoreResult(this@UserFragment, item.vodId);
                }
            }
        }
    }
    override var isUseEventBus: Boolean = true
    var isInit: Boolean = false

    override fun getLayoutId(): Int {
        return R.layout.fragment_user
    }

    private var mPage = 1
    private fun getExpandList() {
        var vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
        if (AgainstCheatUtil.showWarn(vodService)) {
            return
        }
        RequestManager.execute(mActivity, vodService.myExpand(mPage.toString(), "20"),
                object : LoadingObserver<MyExpand>(mActivity) {
                    override fun onSuccess(data: MyExpand) {
                        tv_user_tuiguang.text = "我的推广"
                    }

                    override fun onError(e: ResponseException) {
//                        tv_user_tuiguang.text = "获取数据错误"
                    }

                })
    }

    var playVideoReceiver: PlayVideoReceiver = PlayVideoReceiver()

    override fun initView() {
        super.initView()
        val filter = IntentFilter()
        //给意图过滤器添加action，就是要监听的广播对应的action
        filter.addAction("android.intent.action.AddPlayScore")
        mActivity.registerReceiver(playVideoReceiver, filter)

        val userTip = MMkvUtils.Companion.Builds().loadStartBean("")?.document?.notice?.content
                ?: ""
        if (userTip.isNotEmpty()) {
            tv_user_task.text = userTip
        }
        rvPlayScore.layoutManager = LinearLayoutManager(activity).apply {
            orientation = LinearLayoutManager.HORIZONTAL
        }
        rvPlayScore.adapter = playScoreAdapter
        val ad = Builds().loadStartBean("")?.ads?.user_center
        if (ad == null || ad.status == 0 || ad.description.isNullOrEmpty()) {
            awvUser.visibility = View.GONE
        } else {
            awvUser.visibility = View.VISIBLE
            awvUser.setOnClickListener {
                if (!UserUtils.isLogin()) {
                    LoginActivity.start()
                } else {
                    val intent = Intent(activity, ExpandCenterActivity::class.java)
                    ActivityUtils.startActivity(intent)
                }
            }
            Glide.with(mContext).load(ad.description).into(awvUser)
        }
        getGroupChatList()
        val dateStr = d_date()
        if (dateStr != null) {
            Log.d("签到时间", "initView: $dateStr")
            if (dateStr == Builds().loadUser_slgn_time()) {
            }
        }
    }
    private fun getStartData() {
        val adClient = AdClient(activity)
        adClient.requestInteractionAd("10803", object : AdLoadAdapter() {
            override fun onAdShow(sspAd: SSPAd) {
                super.onAdShow(sspAd)
                //插屏广告显示
                sign()
            }
        })
    }

    override fun initListener() {
        super.initListener()
        tvLogin.setOnClickListener {
            LoginActivity.start()
        }

        tv_user_tuiguang.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {
                ActivityUtils.startActivity(MyExpandActivity::class.java)
            }
        }

        iv_user_plc.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {
                ActivityUtils.startActivity(AccountSettingActivity::class.java)
            }
        }

        iv_user_title.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {
                ActivityUtils.startActivity(AccountSettingActivity::class.java)
            }
        }

        tv_user_task.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {
                TaskActivity2.start()
            }
        }

        tv_user_t5.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {
                TaskActivity2.start()
            }
        }

        tv_user_share.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {
                Toast.makeText(activity, "扫码即可下载APP哦~~~", Toast.LENGTH_SHORT).show()
                var intn = Intent(this.mActivity, ShareActivity::class.java)
                intn.putExtra("vom_name", "有奖推广活动")
                intn.putExtra("vod_pic", "www") //图片
                var share_description_txt = ""
                val share_description = Builds().loadStartBean("")?.ads?.share_description
                if (share_description == null || share_description.status == 0 || share_description.description.isNullOrEmpty()) {
                    share_description_txt = "1、普通用户分享成功可获得积分奖励\n2、代理用户分销成功可获得金币奖励"
                } else {
                    share_description_txt = share_description.description
                }
                intn.putExtra(
                        "vod_blurd",
                        share_description_txt
                ) //注释
                intn.putExtra("vod_class", "分享给未安装过的用户注册并打开应用算分享成功") //标签
                startActivity(intn)
            }
        }

        tv_qqun.setOnClickListener {
            val startBean = Builds().loadStartBean("")
            if (startBean != null && startBean.ads != null && startBean.ads.service_qqqun != null && startBean.ads.service_qqqun.description != null) {
                joinQQGroup(startBean.ads.service_qqqun.description)
            } else {
                ToastUtils.showShort("暂无官方QQ群")
            }
        }

        tv_user_servlce.setOnClickListener {
            var description: String = ""
            val startBean = Builds().loadStartBean("")
            if (startBean != null && startBean.ads != null && startBean.ads.service_qq != null && startBean.ads.service_qq.description != null) {
                description = startBean.ads.service_qq.description
            }
            //获取QQ
            if (description.contains("uin=")) {
                description = description.split("uin=")[1]
            }
            if (description.contains("&site")) {
                description.split("&site")[0]
            }
            val link = "mqq://im/chat?chat_type=wpa&uin=${description}&version=1&src_type=web"

            Intent(Intent.ACTION_VIEW, Uri.parse(link)).let {
                if (it.resolveActivity(mActivity.packageManager) != null) {
                    ActivityUtils.startActivity(it)
                } else {
                    ToastUtils.showShort("未安装QQ!!")
                }
            }
        }

        tv_qq.setOnClickListener {
            var description: String = ""
            val startBean = Builds().loadStartBean("")
            if (startBean != null && startBean.ads != null && startBean.ads.service_qq != null && startBean.ads.service_qq.description != null) {
                description = startBean.ads.service_qq.description
            }
            //获取QQ
            if (description.contains("uin=")) {
                description = description.split("uin=")[1]
            }
            if (description.contains("&site")) {
                description.split("&site")[0]
            }
            val link = "mqq://im/chat?chat_type=wpa&uin=${description}&version=1&src_type=web"

            Intent(Intent.ACTION_VIEW, Uri.parse(link)).let {
                if (it.resolveActivity(mActivity.packageManager) != null) {
                    ActivityUtils.startActivity(it)
                } else {
                    ToastUtils.showShort("未安装QQ!!")
                }
            }
        }

        tv_user_slgn.setOnClickListener {
            getStartData()
            sign()
        }
 //       tv_user_slgn.setOnClickListener {
 //           if (!UserUtils.isLogin()) {
 //               LoginActivity.start()
 //           } else {
 //               sign()
 //           }
 //
 //       }
        rlPublic.setOnClickListener {
            val intent = Intent(context, ExpandCenterActivity::class.java)
            ActivityUtils.startActivity(intent)
        }
        tv_user_t3.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {
                val intent = Intent(activity, PayActivity::class.java)
                intent.putExtra("type", 1)
                ActivityUtils.startActivity(intent)
            }
        }

        llCollect.setOnClickListener {
            CollectionActivity.start()
        }

        llPlayScore.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {

                val intent = Intent(activity, PlayScoreActivity::class.java)
                startActivityForResult(intent, 2)
            }
        }

        llClear.setOnClickListener {
            LitePal.deleteAll(PlayScoreBean::class.java)
            ToastUtils.showShort("已清除缓存")
            getPlayScore()
        }

        liCache.setOnClickListener {

            if (LoginUtils.checkLogin(activity)) {
                activity?.let { it1 -> AllDownloadActivity.start(it1) }
            }

        }
        llNotice.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {
                val intent = Intent(activity, MessageCenterActivity::class.java)
                startActivity(intent)
                tv_vRead2.visibility = View.GONE
            }
        }
        tv_user_vips.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {
                val intent = Intent(activity, PayActivity::class.java)
                intent.putExtra("type", 1)
                ActivityUtils.startActivity(intent)
            }
        }

        tv_user_vip.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {
                val intent = Intent(activity, PayActivity::class.java)
                intent.putExtra("type", 1)
                ActivityUtils.startActivity(intent)
            }
        }
        tv_intn.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {
                val intent = Intent(activity, PayActivity::class.java)
                intent.putExtra("type", 1)
                ActivityUtils.startActivity(intent)
            }
        }
        tv_user_gd.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {
                val intent = Intent(activity, PayActivity::class.java)
                intent.putExtra("type", 1)
                ActivityUtils.startActivity(intent)
            }
        }
        tv_user_ccdhy.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {
                val intent = Intent(activity, PayActivity::class.java)
                intent.putExtra("type", 1)
                ActivityUtils.startActivity(intent)
            }
        }
    }

    @Subscribe
    fun onLoginSucces(data: LoginBean? = null) {
        val vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
        if (AgainstCheatUtil.showWarn(vodService)) {
            return;
        }
        RequestManager.execute(this, vodService.userInfo(), object : BaseObserver<UserInfoBean>() {
            override fun onSuccess(data: UserInfoBean) {
                updateUserInfo(data)
                UserUtils.userInfo = data
                getPlayScore()
                EventBus.getDefault().post(data)//通知改变信息
            }

            override fun onError(e: ResponseException) {
            }
        })
    }

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        if (isVisibleToUser) {
            UserUtils.userInfo = null
            updateUserInfo()
            getPlayScore()

            if (UserUtils.isLogin()) {
                onLoginSucces()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        updateUserInfo()
        getPlayScore()

        if (UserUtils.isLogin()) {
            onLoginSucces()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        //从我的页面点击视频播放界面和视频播放记录页面
        if (requestCode == 1 || requestCode == 2) {
            getPlayScore()
        }

    }

    class PlayVideoReceiver : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            Log.i(javaClass.name.toString(), "onReceive playscore")
            //   UserFragment.newInstance().getPlayScore();
            // UserFragment.newInstance().mHandler.sendEmptyMessage(1)
        }

    }

    @SuppressLint("SimpleDateFormat")
    private fun d_date(): String? {
        val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd") //2021-12-28
        val date = Date() //创建一个date对象保存当前时间
        val dateStr = simpleDateFormat.format(date) //当前日期
        return dateStr
    }

    private fun sign() {
        val vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
        if (AgainstCheatUtil.showWarn(vodService)) {
            return
        }
        RequestManager.execute(this, vodService.sign(), object : BaseObserver<GetScoreBean>() {
            @SuppressLint("SimpleDateFormat")
            override fun onSuccess(data: GetScoreBean) {
                if (data.score == "0") {
                    ToastUtils.showShort(R.string.sign_success)
                } else {
                    ToastUtils.showShort("签到成功，获得${data.score}积分")
                }
                val dateStr = d_date()
                if (dateStr != null) {
                    Builds().saveUser_slgn_time(dateStr)
                }
                onLoginSucces()
            }

            override fun onError(e: ResponseException) {
                val dateStr = d_date()
                if (dateStr != null) {
                    Builds().saveUser_slgn_time(dateStr)
                }
                ToastUtils.showShort(e.getErrorMessage())
            }

        })
    }

    private fun updateUserInfo(data: UserInfoBean? = null) {
        if (UserUtils.isLogin()) {
            getExpandList()
            tvLogin.visibility = View.GONE
            tv_user_vip.visibility = View.VISIBLE
            tv_user_vips.visibility = View.VISIBLE
            tv_user_phone.visibility = View.VISIBLE
        } else {
            tvLogin.visibility = View.VISIBLE
            tv_user_vip.visibility = View.GONE
            tv_user_vips.visibility = View.GONE
            tv_user_phone.visibility = View.INVISIBLE
            //tv_user_jinbi.text = "0"
            tv_user_jifen.text = "0"
           // tv_user_video.text = "0"
        }

        data?.let {
            val isVIp = it.group.group_name.contains("VIP")
            SPUtils.setBoolean(activity, "isVip", isVIp)
            if (!SPUtils.getBoolean(activity, "isVip")) {
                tv_user_ccdhy.setBackgroundResource(R.drawable.ic_cwhya)
                tv_user_vip.setBackgroundResource(R.drawable.ic_pthy)
                tv_user_time.text = "到期时间:  非会员或已过期"
            } else {
                tv_user_ccdhy.setBackgroundResource(R.drawable.ic_hyzxa)
                tv_user_vip.setBackgroundResource(R.drawable.ic_zshy)
                tv_user_time.text = "到期时间:  ${DateUtil.getyyyyMMddHHmm(it.user_end_time * 1000)}"
            }
            if (it.user_level == "1") {
                tv_user_vips.setBackgroundResource(R.drawable.ic_lv1)
            } else if (it.user_level == "2") {
                tv_user_vips.setBackgroundResource(R.drawable.ic_lv2)
            } else if (it.user_level == "3") {
                tv_user_vips.setBackgroundResource(R.drawable.ic_lv3)
            } else if (it.user_level == "4") {
                tv_user_vips.setBackgroundResource(R.drawable.ic_lv4)
            } else if (it.user_level == "5") {
                tv_user_vips.setBackgroundResource(R.drawable.ic_lv5)
            }
            tv_user_phone.text = data.user_nick_name
            //tv_user_jinbi.text = it.user_gold
            tv_user_jifen.text = "${it.user_points}"
           // tv_user_video.text = it.leave_times
            if (it.user_portrait.isNotEmpty()) {
                Glide.with(mActivity)
                        .load(ApiConfig.MOGAI_BASE_URL + "/" + it.user_portrait)
                        .apply(RequestOptions.bitmapTransform(CircleCrop()))
                        .into(iv_user_plc)
            } else {
                Glide.with(mActivity)
                        .load(R.drawable.user_tx)
                        .apply(RequestOptions.bitmapTransform(CircleCrop()))
                        .into(iv_user_plc)
            }
        }
    }


    private fun getPlayScore() {
        var playScoreBeans = ArrayList<PlayScoreBean>()
        if (UserUtils.isLogin()) {
            val vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
            if (AgainstCheatUtil.showWarn(vodService)) {
                return;
            }
            RequestManager.execute(this, vodService.getPlayLogList("1", "12"),
                    object : LoadingObserver<Page<PlayLogBean>>(this@UserFragment.mActivity) {
                        override fun onSuccess(data: Page<PlayLogBean>) {
                            val playLogBeans = data.list
                            playLogBeans.forEach {
                                val playScoreBean: PlayScoreBean = PlayScoreBean()
                                playScoreBean.vodName = it.vod_name
                                playScoreBean.vodImgUrl = it.vod_pic
                                if (it.percent.equals("NaN")) {
                                    playScoreBean.percentage = 0.0f
                                } else {
                                    try {
                                        playScoreBean.percentage = it.percent.toFloat()
                                    } catch (ex: Exception) {
                                    }
                                }
                                playScoreBean.typeId = it.type_id;
                                playScoreBean.vodId = it.vod_id.toInt();
                                playScoreBean.isSelect = false
                                playScoreBean.vodSelectedWorks = it.nid.toString()

                                playScoreBean.urlIndex = it.urlIndex
                                playScoreBean.curProgress = it.curProgress
                                playScoreBean.playSourceIndex = it.playSourceIndex


                                var gson: Gson = Gson()
                                var playScoreBeanStr = gson.toJson(playScoreBean).toString();
                                Log.i("playlog", "playScoreBean${playScoreBeanStr}")
                                playScoreBeans.add(playScoreBean)

                                if (playScoreBeans.size > 10) {
                                    playScoreAdapter.setNewData(playScoreBeans.subList(0, 10))
                                } else {
                                    playScoreAdapter.setNewData(playScoreBeans)
                                }

                            }

                            if (data.list.size == 0) {
                                playScoreAdapter.setNewData(playScoreBeans)
                            }

                            Log.i("playlog", "getPlayLogList11${data}");
                        }

                        override fun onError(e: ResponseException) {
                            Log.i("playlog", "getPlayLogList222")

                        }
                    }
            )
        }
    }

    private class PlayScoreAdapter :
            BaseQuickAdapter<PlayScoreBean, BaseViewHolder>(R.layout.item_play_score_horizontal) {
        override fun convert(helper: BaseViewHolder, item: PlayScoreBean?) {
            item?.run {
                val name = if (item.typeId == 3) {
                    "$vodName $vodSelectedWorks"
                } else if (item.typeId == 1) {
                    "$vodName"
                } else {
                    "$vodName ${vodSelectedWorks}"
                }
                helper.setText(R.id.tvName, name)
                helper.setText(R.id.tvPlayProgress, "${(percentage * 100).toInt()}%")
                val mation: MultiTransformation<Bitmap> = MultiTransformation(
                        CenterCrop(),
                        RoundedCornersTransformation(20, 0, RoundedCornersTransformation.CornerType.ALL)
                )
                Glide.with(helper.itemView.context)
                        .load(vodImgUrl)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .apply(RequestOptions.bitmapTransform(mation))
                        .into(helper.getView<View>(R.id.ivImg) as ImageView)
            }
        }

    }


    companion object {
        @JvmStatic
        fun newInstance(): UserFragment {
            val args = Bundle()
            val fragment = UserFragment()
            fragment.arguments = args
            return fragment
        }
    }

    fun gotoWeb(url: String) {
        val intent = Intent()
        intent.action = "android.intent.action.VIEW"
        val uri = Uri.parse(url)
        intent.data = uri
        if (intent.resolveActivity(App.getApplication().packageManager) != null) {
            startActivity(intent)
        } else {
            //要调起的应用不存在时的处理
        }
    }

    //获取群聊列表
    private fun getGroupChatList() {
        val vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
        if (AgainstCheatUtil.showWarn(vodService)) {
            return
        }
        RequestManager.execute(
                this,
                vodService.groupChat(),
                object : BaseObserver<GroupChatBean>() {
                    override fun onSuccess(data: GroupChatBean) {
                        val list = data.list
                        for (i in list.indices) {
                            if (i == 0) {
                                llPotato.visibility = View.VISIBLE
                                line_potato.visibility = View.VISIBLE
                                tv_potato.text = list[0].title
                                llPotato.setOnClickListener {
                                    gotoWeb(list[0].url)
                                }
                            } else if (i == 1) {
                                llPlane.visibility = View.VISIBLE
                                line_plane.visibility = View.VISIBLE
                                tv_plane.text = list[1].title
                                llPlane.setOnClickListener {
                                    gotoWeb(list[1].url)
                                }
                            } else if (i == 2) {
                                ollPlane.visibility = View.VISIBLE
                                oline_plane.visibility = View.VISIBLE
                                otv_plane.text = list[2].title
                                ollPlane.setOnClickListener {
                                    gotoWeb(list[2].url)
                                }
                            } else if (i == 3) {
                                nllPlane.visibility = View.VISIBLE
                                nline_plane.visibility = View.VISIBLE
                                ntv_plane.text = list[3].title
                                nllPlane.setOnClickListener {
                                    gotoWeb(list[3].url)
                                }
                            }
                        }
                    }

                    override fun onError(e: ResponseException) {
                    }
                }
        )
    }
}
