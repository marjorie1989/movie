package cn.lvdou.vod.ui.user

import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.content.*
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import cn.lvdou.vod.ApiConfig
import cn.lvdou.vod.App
import cn.lvdou.vod.R
import cn.lvdou.vod.base.BaseFragment
import com.github.StormWyrm.wanandroid.base.net.RequestManager
import cn.lvdou.vod.base.exception.ResponseException
import cn.lvdou.vod.base.observer.BaseObserver
import cn.lvdou.vod.base.observer.LoadingObserver
import cn.lvdou.vod.bean.*
import cn.lvdou.vod.download.SPUtils
import cn.lvdou.vod.netservice.VodService
import cn.lvdou.vod.ui.account.AccountSettingActivity
import cn.lvdou.vod.ui.collection.CollectionActivity
import cn.lvdou.vod.ui.down.AllDownloadActivity
import cn.lvdou.vod.ui.expand.ExpandCenterActivity
import cn.lvdou.vod.ui.expand.MyExpandActivity
import cn.lvdou.vod.ui.login.LoginActivity
import cn.lvdou.vod.ui.notice.MessageCenterActivity
import cn.lvdou.vod.ui.pay.PayActivity
import cn.lvdou.vod.ui.play.PlayActivity
import cn.lvdou.vod.ui.play.X5WebActivity
import cn.lvdou.vod.ui.score.PlayScoreActivity
import cn.lvdou.vod.ui.share.ShareActivity
import cn.lvdou.vod.ui.task.TaskActivity2
import cn.lvdou.vod.ui.withdraw.GoldWithdrawActivity
import cn.lvdou.vod.utils.*
import cn.lvdou.vod.utils.MMkvUtils.Companion.Builds
import com.blankj.utilcode.util.ActivityUtils
import com.blankj.utilcode.util.ToastUtils
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import com.bytedance.sdk.openadsdk.*
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.google.gson.Gson
import com.youxiao.ssp.ad.bean.SSPAd
import com.youxiao.ssp.ad.core.AdClient
import com.youxiao.ssp.ad.listener.AdLoadAdapter
import jp.wasabeef.glide.transformations.RoundedCornersTransformation
import kotlinx.android.synthetic.main.activity_my_expand.*
import kotlinx.android.synthetic.main.fragment_userb.*
import kotlinx.android.synthetic.main.fragment_userb.*
import kotlinx.android.synthetic.main.fragment_userb.tv_vRead2
import kotlinx.android.synthetic.main.fragment_userb.Purchasedlist
import kotlinx.android.synthetic.main.fragment_userb.awvUser
import kotlinx.android.synthetic.main.fragment_userb.llPlane
import kotlinx.android.synthetic.main.fragment_userb.tv_user_share
import kotlinx.android.synthetic.main.fragment_userb.iv_user_plc
import kotlinx.android.synthetic.main.fragment_userb.iv_user_title
import kotlinx.android.synthetic.main.fragment_userb.liCache
import kotlinx.android.synthetic.main.fragment_userb.line_plane
import kotlinx.android.synthetic.main.fragment_userb.tv_plane
import kotlinx.android.synthetic.main.fragment_userb.line_potato
import kotlinx.android.synthetic.main.fragment_userb.rvPlayScore
import kotlinx.android.synthetic.main.fragment_userb.llCollect
import kotlinx.android.synthetic.main.fragment_userb.llNotice
import kotlinx.android.synthetic.main.fragment_userb.tv_user_share2
import kotlinx.android.synthetic.main.fragment_userb.llPlayScore
import kotlinx.android.synthetic.main.fragment_userb.llPotato
import kotlinx.android.synthetic.main.fragment_userb.llClear
import kotlinx.android.synthetic.main.fragment_userb.tvLogin
import kotlinx.android.synthetic.main.fragment_userb.tv_coin_withdraw
import kotlinx.android.synthetic.main.fragment_userb.tv_potato
import kotlinx.android.synthetic.main.fragment_userb.tv_qqun
import kotlinx.android.synthetic.main.fragment_userb.tv_user_jifen
import kotlinx.android.synthetic.main.fragment_userb.tv_user_jinbi
import kotlinx.android.synthetic.main.fragment_userb.tv_user_phone
import kotlinx.android.synthetic.main.fragment_userb.tv_user_servlce
import kotlinx.android.synthetic.main.fragment_userb.tv_user_slgn
import kotlinx.android.synthetic.main.fragment_userb.tv_user_t3
import kotlinx.android.synthetic.main.fragment_userb.tv_user_task
import kotlinx.android.synthetic.main.fragment_userb.tv_user_tuiguang
import kotlinx.android.synthetic.main.fragment_userb.tv_user_video
import kotlinx.android.synthetic.main.fragment_userb.tv_user_vip
import kotlinx.android.synthetic.main.fragment_userb.tv_user_vips
import me.yokeyword.fragmentation.SupportActivity
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.litepal.LitePal
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class UserFragmentB : BaseFragment() {
    private val playScoreAdapter: PlayScoreAdapter by lazy {
        PlayScoreAdapter().apply {
            setOnItemClickListener { adapter, view, position ->
                val item = adapter.getItem(position) as PlayScoreBean
                if (!UserUtils.isLogin()) {
                    LoginActivity.start()
                } else {
                    Builds().savePlayScore(item)
                    PlayActivity.startByPlayScoreResult(this@UserFragmentB, item.vodId);
                }
            }
        }
    }

    var ggtime = ""
    var isInit: Boolean = false
    override var isUseEventBus: Boolean = true

    override fun getLayoutId(): Int {
        return R.layout.fragment_userb
    }

    private fun getExpandList() {
        val vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
        if (AgainstCheatUtil.showWarn(vodService)) {
            return
        }
        RequestManager.execute(mActivity, vodService.myExpand("1", "20"),
                object : LoadingObserver<MyExpand>(mActivity) {
                    @SuppressLint("SetTextI18n")
                    override fun onSuccess(data: MyExpand) {
                        tv_user_tuiguang.text = data.total.toString() + "人"
                    }

                    override fun onError(e: ResponseException) {
                        tv_user_tuiguang.text = e.toString()
                    }

                })
    }

    var playVideoReceiver: PlayVideoReceiver = PlayVideoReceiver()

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun initView() {
        super.initView()
        val filter = IntentFilter()
        //给意图过滤器添加action，就是要监听的广播对应的action
        filter.addAction("android.intent.action.AddPlayScore")
        mActivity.registerReceiver(playVideoReceiver, filter)

        val userTip = Builds().loadStartBean("")?.document?.notice?.content ?: ""
        if (userTip.isNotEmpty()) {
            gonggao.text = userTip
        }

        val ad = Builds().loadStartBean("")?.ads
        if (ad != null) {



            if (ad.service_qqqun == null || ad.service_qqqun.status == 0 || ad.service_qqqun.description.isNullOrEmpty()) {
                tv_qqun.visibility = View.GONE
            } else {
                tv_qqun.visibility = View.VISIBLE
                tv_qqun.setOnClickListener {
                    if (!UserUtils.isLogin()) {
                        LoginActivity.start()
                    } else {
                        joinQQGroup(ad.service_qqqun.description)
                    }
                }
            }

            if (ad.service_qq == null || ad.service_qq.status == 0 || ad.service_qq.description.isNullOrEmpty()) {
                tv_user_servlce.visibility = View.GONE
            } else {
                tv_user_servlce.visibility = View.VISIBLE
                tv_user_servlce.setOnClickListener {
                    Log.d("serviceqq.description", "initView: " + ad.service_qq.description)
                    val link = "mqq://im/chat?chat_type=wpa&uin=${ad.service_qq.description}&version=1&src_type=web"
                    Intent(Intent.ACTION_VIEW, Uri.parse(link)).let {
                        if (it.resolveActivity(mActivity.packageManager) != null) {
                            ActivityUtils.startActivity(it)
                        } else {
                            ToastUtils.showShort("未安装QQ!!")
                        }
                    }
                }
            }
        }

        getGroupChatList()
        val dateStr = d_date()
        if (dateStr != null) {
            Log.d("签到时间", "initView: $dateStr")
            if (dateStr == Builds().loadUser_slgn_time()) {
                tv_user_slgn.text = "已 签 到"
            }
        }

        rvPlayScore.layoutManager = LinearLayoutManager(activity).apply {
            orientation = LinearLayoutManager.HORIZONTAL
        }
        rvPlayScore.adapter = playScoreAdapter

        val drawable1 = resources.getDrawable(R.drawable.usercenter_cinema_download_placeholder)
        drawable1.setBounds(0, 0, 120, 120)
        liCache.setCompoundDrawables(null, drawable1, null, null)
        val drawable2 = resources.getDrawable(R.drawable.usercenter_cinema_history_placeholder)
        drawable2.setBounds(0, 0, 120, 120)
        llPlayScore.setCompoundDrawables(null, drawable2, null, null)
        val drawable3 = resources.getDrawable(R.drawable.usercenter_cinema_reserve_placeholder)
        drawable3.setBounds(0, 0, 120, 120)
        llCollect.setCompoundDrawables(null, drawable3, null, null)
        val drawable4 = resources.getDrawable(R.drawable.usercenter_cinema_exlogin_placeholder)
        drawable4.setBounds(0, 0, 120, 120)
        Purchasedlist.setCompoundDrawables(null, drawable4, null, null)

        val drawable5 = resources.getDrawable(R.drawable.ic_enter)
        drawable5.setBounds(0, 0, 38, 38)
        user_home.setCompoundDrawables(null, null, drawable5, null)
    }

    /**
     * 信天翁
     * */

    private fun getStartData() {
        val adClient = AdClient(activity)
        adClient.requestInteractionAd("10042", object : AdLoadAdapter() {
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
        tv_user_share2.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {
                val intent = Intent(activity, ExpandCenterActivity::class.java)
                ActivityUtils.startActivity(intent)
            }
        }
        tv_user_task.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {
                TaskActivity2.start()
            }
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

        user_home.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {
                val intent = Intent(activity, PayActivity::class.java)
                intent.putExtra("type", 1)
                ActivityUtils.startActivity(intent)
            }
        }

        tv_user_tuiguang2.setOnClickListener {
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

        tv_user_phone.setOnClickListener {
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

        tv_user_share.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {
                Toast.makeText(activity, "扫码即可下载APP哦~~~", Toast.LENGTH_SHORT).show()
                val intn = Intent(this.mActivity, ShareActivity::class.java)
                intn.putExtra("vom_name", "有奖推广活动")
                intn.putExtra("vod_pic", "www") //图片
                var share_description_txt = ""
                val share_description = Builds().loadStartBean("")?.ads?.share_description
                if (share_description == null || share_description.status == 0 || share_description.description.isNullOrEmpty()) {
                    share_description_txt = "1、普通用户分享成功可获得积分奖励\n2、代理用户分销成功可获得金币奖励"
                } else {
                    share_description_txt = share_description.description
                }
                intn.putExtra("vod_blurd", share_description_txt) //注释
                intn.putExtra("vod_class", "分享给未安装过的用户注册并打开应用算分享成功") //标签
                startActivity(intn)
            }
        }

        tv_user_slgn.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {
                getStartData()
            }
        }

        tv_user_sign.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {
                getStartData()
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

        tv_coin_withdraw.setOnClickListener {
            if (!UserUtils.isLogin()) {
                LoginActivity.start()
            } else {
                ActivityUtils.startActivity(GoldWithdrawActivity::class.java)
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
        getAdsClass()
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
        }

    }

    @SuppressLint("SimpleDateFormat")
    private fun getTimeData(): String? {
        val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd") //2021-12-28
        val date = Date() //创建一个date对象保存当前时间
        return simpleDateFormat.format(date) //当前日期
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
                tv_user_slgn.text = "已 签 到"
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
                tv_user_slgn.text = "已 签 到"
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
            tv_user_jinbi.text = "0"
            tv_user_jifen.text = "0"
            tv_user_video.text = "0"
        }

        data?.let {
            val isVIp = it.group.group_name.contains("VIP")
            SPUtils.setBoolean(activity, "isVip", isVIp)
            if (!SPUtils.getBoolean(activity, "isVip")) {
                tv_user_vip.setBackgroundResource(R.drawable.vip_rank_0)
            } else {
                tv_user_vip.setBackgroundResource(R.drawable.vip_rank_1)
            }
            if (it.is_agents == "0") {
                tv_user_vips.setBackgroundResource(R.drawable.ic_daili_no)
            } else {
                tv_user_vips.setBackgroundResource(R.drawable.ic_daili)
            }
            tv_user_phone.text = data.user_nick_name
            tv_user_jinbi.text = it.user_gold
            tv_user_jifen.text = "${it.user_points}"
            tv_user_video.text = it.leave_times
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

    private fun getAdsClass() {
        val ad = Builds().loadStartBean("")?.ads
        val StartBean = Objects.requireNonNull(Builds().loadStartBean(""))
        if (ad == null || ad.user_center == null || ad.user_center.status == 0 || ad.user_center.description.isNullOrEmpty() || UserUtils.isLogin()) {
            awvUser.visibility = View.GONE
            rvPlayScore.visibility = View.VISIBLE
            history2.text = "播放记录"
        } else {
            history2.text = "推广有礼"
            awvUser.visibility = View.VISIBLE
            awvUser.setOnClickListener {
                if (!UserUtils.isLogin()) {
                    LoginActivity.start()
                } else {
                    val intent = Intent(activity, ExpandCenterActivity::class.java)
                    ActivityUtils.startActivity(intent)
                }
            }
            rvPlayScore.visibility = View.GONE
            Glide.with(mContext)
                    .load(ad.user_center.description)
                    .into(awvUser)
        }

        /**
         * 信天翁
         * */


    }

    //为了更好的释放资源，在页面销毁时调用release方法释放资源


    private fun getPlayScore() {
        val playScoreBeans = ArrayList<PlayScoreBean>()
        if (UserUtils.isLogin()) {
            val vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
            if (AgainstCheatUtil.showWarn(vodService)) {
                return;
            }
            RequestManager.execute(this, vodService.getPlayLogList("1", "12"),
                    object : LoadingObserver<Page<PlayLogBean>>(this@UserFragmentB.mActivity) {
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
                                val gson: Gson = Gson()
                                val playScoreBeanStr = gson.toJson(playScoreBean).toString();
                                Log.i("playlog11", "playScoreBean${playScoreBeanStr}")
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
        fun newInstance(): UserFragmentB {
            val args = Bundle()
            val fragment = UserFragmentB()
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
                        when (i) {
                            0 -> {
                                item_tv_playinfo_feedback.text = list[0].title
                                item_tv_playinfo_feedback.setOnClickListener {
                                    val intent = Intent(context, X5WebActivity::class.java)
                                    val bundle = Bundle()
                                    bundle.putString("url", list[0].url)
                                    bundle.putString("title", list[0].title)
                                    intent.putExtras(bundle)
                                    ActivityUtils.startActivity(intent)
                                }
                            }
                            1 -> {
                                llPotato.visibility = View.VISIBLE
                                line_potato.visibility = View.VISIBLE
                                tv_potato.text = list[1].title
                                llPotato.setOnClickListener {
                                    gotoWeb(list[1].url)
                                }
                            }
                            2 -> {
                                llPlane.visibility = View.VISIBLE
                                line_plane.visibility = View.VISIBLE
                                tv_plane.text = list[2].title
                                llPlane.setOnClickListener {
                                    gotoWeb(list[2].url)
                                }
                            }
                            3 -> {
                                if (list[3].title.contains("|")) {
                                    iv_tuiguang.visibility = View.VISIBLE
                                    val list1 = (list[3].title).split('|')
                                    guanggao1.text = list1[0]
                                    guanggao2.text = list1[1]
                                    guanggao.setOnClickListener {
                                        val intent = Intent(context, X5WebActivity::class.java)
                                        val bundle = Bundle()
                                        bundle.putString("url", list[3].url)
                                        bundle.putString("title", list[3].title)
                                        intent.putExtras(bundle)
                                        ActivityUtils.startActivity(intent)
                                    }
                                } else {
                                    iv_tuiguang.visibility = View.GONE
                                }
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