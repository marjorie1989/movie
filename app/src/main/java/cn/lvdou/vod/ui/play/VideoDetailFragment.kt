package cn.lvdou.vod.ui.play


import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cn.lvdou.av.play.AvVideoView
import cn.lvdou.av.play.VideoViewImpt
import cn.lvdou.vod.ApiConfig
import cn.lvdou.vod.R
import cn.lvdou.vod.ad.AdWebView
import cn.lvdou.vod.bean.*
import cn.lvdou.vod.jiexi.BackListener
import cn.lvdou.vod.jiexi.JieXiUtils2
import cn.lvdou.vod.netservice.VodService
import cn.lvdou.vod.ui.down.AllDownloadActivity
import cn.lvdou.vod.ui.down.cache.Square
import cn.lvdou.vod.ui.down.cache.SquareViewBinder
import cn.lvdou.vod.ui.feedback.FeedbackActivity
import cn.lvdou.vod.ui.home.MyDividerItemDecoration
import cn.lvdou.vod.ui.login.LoginActivity
import cn.lvdou.vod.ui.share.ShareActivity
import cn.lvdou.vod.ui.widget.HitDialog
import cn.lvdou.vod.ui.widget.HitDialog.OnHitDialogClickListener
import cn.lvdou.vod.utils.*
import cn.lvdou.vod.utils.DensityUtils.dp2px
import cn.lvdou.vod.utils.DensityUtils.getScreenWidth
import cn.lvdou.vod.utils.decoration.GridItemDecoration
import com.blankj.utilcode.util.*
import com.blankj.utilcode.util.StringUtils
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CenterInside
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
import cn.lvdou.vod.utils.AgainstCheatUtil.showWarn
import com.bytedance.sdk.openadsdk.*
import com.bytedance.sdk.openadsdk.TTAdNative.FullScreenVideoAdListener
import com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd.FullScreenVideoAdInteractionListener
import com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
import com.dueeeke.videoplayer.player.VideoViewManager
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.tabs.TabLayout
import com.scwang.smartrefresh.layout.footer.ClassicsFooter
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import jaygoo.library.m3u8downloader.control.DownloadPresenter
import jaygoo.library.m3u8downloader.db.table.M3u8DoneInfo
import jaygoo.library.m3u8downloader.db.table.M3u8DownloadingInfo
import jp.wasabeef.glide.transformations.RoundedCornersTransformation
import kotlinx.android.synthetic.main.fragment_play_detail.*
import kotlinx.android.synthetic.main.layout_comment.*
import kotlinx.android.synthetic.main.tool_bar_layout.*
import me.drakeet.multitype.MultiTypeAdapter
import org.litepal.LitePalApplication
import java.util.*
import com.ss.android.socialbase.downloader.depend.ad

import com.bytedance.sdk.openadsdk.PersonalizationPrompt

import com.bytedance.sdk.openadsdk.FilterWord

import com.bytedance.sdk.openadsdk.DislikeInfo
import com.bytedance.sdk.openadsdk.TTAdDislike
import com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
import jaygoo.library.m3u8downloader.M3U8Library
import kotlinx.android.synthetic.main.activity_share2.*
import jaygoo.library.m3u8downloader.M3U8Library.context
import com.youxiao.ssp.ad.bean.SSPAd

import com.youxiao.ssp.ad.listener.AdLoadAdapter

import com.youxiao.ssp.ad.core.AdClient


class VideoDetailFragment : BaseFragment() {

    private lateinit var mVodBean: VodBean
    private var isParse = false
    private var isCollected: Boolean = false
    private var urlIndex: Int = 0 //播放集
    private var playSourceIndex: Int = 0//播放源
    private var curCommentPage = 1
    private lateinit var vod_play_list: List<PlayFromBean>//播放视频列表
    private var curType = 0//推荐 默认是相似推荐
    private var curSameTypePage = 1
    private var curSameActorPage = 1
    private var curParseIndex = 0//记录上一次解析到的位置，如果出现解析到是视频不能播放的话 自动解析下一条
    private var curFailIndex = -1
    private lateinit var adLayout: FrameLayout;
    private val recommendAdapter: RecommendAdapter by lazy {
        RecommendAdapter().apply {
            setOnItemClickListener { adapter, view, position ->
                val vodBean = adapter.getItem(position) as VodBean
                playActivity.showNewVideo(vodBean)
            }
        }
    }
    private val commentAdapter: CommentAdapter by lazy {
        CommentAdapter().apply {
            setHeaderAndEmpty(true)
        }
    }
    private val selectionAdapter: SelectionAdapter by lazy {
        SelectionAdapter().apply {
            setOnItemClickListener { adapter, view, position ->
                if (urlIndex != position) {
                    urlIndex = position
                    playActivity.changeSelection(urlIndex, false)
                    notifyDataSetChanged()

                }
            }
        }
    }

    private val headerView: View by lazy {
        View.inflate(mActivity, R.layout.layout_video_detail, null)
    }
    private lateinit var rvLastest: RecyclerView
    private lateinit var tlPlaySource: TabLayout
    private lateinit var playActivity: NewPlayActivity
    private lateinit var item_frame: FrameLayout
    private var wqddg_gs: String = ""
    private var lvdou_status: Int? = null
    private var startService: StartService? = null

    var isOrder = true//播放顺序，默认为顺序播放

    override fun getLayoutId(): Int {
        return R.layout.fragment_play_detail
    }

    //信息流
    private fun getStartData() {
        if (startService == null) {
            startService = Retrofit2Utils.INSTANCE.createByGson(StartService::class.java)
        }
        if (showWarn(startService)) {
            return
        }
        startService!!.startBean
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .onTerminateDetach()
                .retryWhen(RetryWhen(3, 30))
                .subscribe(object : Observer<BaseResult<StartBean>?> {
                    override fun onSubscribe(d: Disposable) {};
                    override fun onError(e: Throwable) {}
                    override fun onComplete() {}
                    override fun onNext(result: BaseResult<StartBean>) {
                        if (result.isSuccessful) {
                            val csj_video8_adv = result.data.ads.csj_video8_adv
                            if (csj_video8_adv != null && csj_video8_adv.description != null && csj_video8_adv.status == 1) {
                                val adClient = AdClient(activity)
                                adClient.requestExpressAd("10804", object : AdLoadAdapter() {
                                    override fun onAdShow(sspAd: SSPAd) {
                                        super.onAdShow(sspAd)
                                    }
                                    override fun onAdLoad(ad: SSPAd) {
                                        super.onAdLoad(ad)
                                        //获取到模板广告，将其添加到显示的容器控件中
                                        item_frame.removeAllViews()
                                        item_frame.addView(ad.view)
                                    }

                                    override fun onError(i: Int, s: String) {
                                        item_frame.visibility = View.GONE
                                    }
                                })
                            }
                            val csj_index3_adv = result.data.ads.csj_index3_adv
                            if (csj_index3_adv != null) {
                                wqddg_gs = csj_index3_adv.description
                                lvdou_status = csj_index3_adv.status
                            }
                        }
                    }

                })
    }


    private var width: Float = 0f //播放集
    private var heigh: Float = 0f //播放集

    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        if (hidden) {
            width = item_frame.getWidth().toFloat();
            heigh = item_frame.getHeight().toFloat()
            Log.e("TAG", "   " + width + "   " + heigh)
        }
    }

    override fun initView() {
        super.initView()

        playActivity = mActivity as NewPlayActivity
        arguments?.run {
            //wqddg
            mVodBean = getParcelable(VOD_BEAN) ?: null as VodBean
            mVodBeans = mVodBean.vodRemarks.toString()
            urlIndex = getInt(URL_INDEX)
            playSourceIndex = getInt(PLAY_SOURCE_INDEX)
        }

        refreshLayout.setEnableRefresh(false)
        refreshLayout.setRefreshFooter(ClassicsFooter(mActivity))

        rvPlayDetail.layoutManager = LinearLayoutManager(mActivity)
        rvPlayDetail.adapter = commentAdapter
        initHeaderMsg()
        commentAdapter.addHeaderView(headerView)

        getCommentList()
        getSameTypeData()
    }

    override fun onResume() {
        super.onResume()

        getCollectionState()
    }

    @SuppressLint("NotifyDataSetChanged")
    fun changeCurIndex(urlIndex: Int) {
        this.urlIndex = urlIndex
        selectionAdapter.notifyDataSetChanged()
        scrollCurIndex(rvLastest)
    }

    var videoViewImpt: VideoViewImpt = VideoViewManager.instance()["pip"] as AvVideoView
    open fun sendDanmaku_wqddg(str: String) {
        if (videoViewImpt == null) return
        if (!StringUtils.isEmpty(str)) {
            videoViewImpt.showDanmaku()
            videoViewImpt.addDanmaku(str, true)
        } else {
            ToastUtils.showShort("请输入弹幕！")
        }
    }


    @SuppressLint("SetTextI18n")
    private fun initHeaderMsg() {
//        val vodPics = headerView.findViewById<ImageView>(R.id.vodPic)
        val title = headerView.findViewById<TextView>(R.id.item_tv_playinfo_title)
        val intro = headerView.findViewById<TextView>(R.id.item_tv_playinfo_intro)
        val hits = headerView.findViewById<TextView>(R.id.item_tv_playinfo_hits)
        val score = headerView.findViewById<TextView>(R.id.item_tv_playinfo_score)
        val tvLastest = headerView.findViewById<TextView>(R.id.tvLastest)
        val ivLastest = headerView.findViewById<ImageView>(R.id.iv_lastest)
        val sortVodView = headerView.findViewById<TextView>(R.id.item_svv_playinfo)
        val checkOrder = headerView.findViewById<CheckBox>(R.id.checkOrder)
        tlPlaySource = headerView.findViewById(R.id.tlPlaySource)
        rvLastest = headerView.findViewById(R.id.rvLastest)
//        val itemTvPlayinfoComment = headerView.findViewById<TextView>(R.id.item_tv_playinfo_comment)
        val awvPlayerDown = headerView.findViewById<AdWebView>(R.id.awvPlayerDown)
        adLayout = headerView.findViewById(R.id.ad_layout)
//        val iv_awvPlayerDown = headerView.findViewById<View>(R.id.iv_awvPlayerDown)
        val ad = MMkvUtils.Builds().loadStartBean("")?.ads?.player_down
        val xtw_moban_ads = MMkvUtils.Companion.Builds().loadStartBean("")?.ads?.xtw_video2_adv
        if (xtw_moban_ads == null || xtw_moban_ads.status == 0 || xtw_moban_ads.description.isNullOrEmpty()) {
            if (ad == null || ad.status == 0 || ad.description.isNullOrEmpty()) {
                awvPlayerDown.visibility = View.GONE
            } else {
                awvPlayerDown.visibility = View.VISIBLE
                awvPlayerDown.loadHtmlBody(ad.description)
            }
        } else {
            if (!LoginUtils.checkLogin2(activity)) {
                val adClient = AdClient(activity)
                adClient.requestExpressAd(xtw_moban_ads.description, object : AdLoadAdapter() {
                    override fun onAdShow(sspAd: SSPAd) {
                        super.onAdShow(sspAd)
                    }
                    override fun onAdLoad(ad: SSPAd) {
                        super.onAdLoad(ad)
                        adLayout.removeAllViews()
                        adLayout.addView(ad.view)
                    }
                    override fun onError(i: Int, s: String) {

                    }
                })
            }
        }
        headerView.findViewById<TextView>(R.id.item_tv_playinfo_grade).setOnClickListener {
            score()
        }
        headerView.findViewById<TextView>(R.id.item_tv_playinfo_collect)
                .setOnClickListener {
                    if (UserUtils.isLogin()) {
                        if (isCollected) {
                            uncollection()
                        } else {
                            collection()
                        }
                    } else {
                        ActivityUtils.startActivity(LoginActivity::class.java)
                    }

                }

        headerView.findViewById<TextView>(R.id.item_tv_playinfo_collects)
                .setOnClickListener {
                    if (UserUtils.isLogin()) {
                        if (isCollected) {
                            uncollection()
                        } else {
                            collection()
                        }
                    } else {
                        ActivityUtils.startActivity(LoginActivity::class.java)
                    }

                }

        headerView.findViewById<TextView>(R.id.item_tv_playinfo_download)
                .setOnClickListener {
                    if (MMkvUtils.Builds().loadStartBean("")?.ads?.download?.status != 0) {
                        if (!LoginUtils.checkLogin2(activity)) {
                            HitDialog(context!!).setTitle("提示").setMessage("需登录后开通VIP才可下载，确定登录。").setOnHitDialogClickListener(object : OnHitDialogClickListener() {
                                override fun onCancelClick(dialog: HitDialog) {
                                    super.onCancelClick(dialog)
                                }

                                override fun onOkClick(dialog: HitDialog) {
                                    super.onOkClick(dialog)
                                    ActivityUtils.startActivity(LoginActivity::class.java)
                                }
                            }).show()
                        } else {
                            if (LoginUtils.checkVIP(activity, "下载需要开通vip是否去开通")) {
                                startCache()
                            }
                        }
                    } else {
                        startCache()
                    }


                }

        headerView.findViewById<TextView>(R.id.tv_av_danmaku2)
                .setOnClickListener {
                    if (UserUtils.isLogin()) {
                        val avVideoView = VideoViewManager.instance().get("pip") as AvVideoView
                        CommentDialog(mActivity, "弹幕") //目前调用的是评论的对话框，对话框提示信息是评论相关的，看能不能判断下从这边拉起的对话框改变下提示文字
                                .setOnCommentSubmitClickListener(object : CommentDialog.OnCommentSubmitClickListener {
                                    override fun onCommentSubmit(comment: String) {
                                        sendDanmaku_wqddg(comment)
                                        sendDanmu(comment, avVideoView.currentPosition.toString()) //发送弹幕
//                                        sendDanmu(comment,System.currentTimeMillis().toString()) //发送弹幕
                                    }
                                })
                                .show()
                    } else {
                        LoginActivity.start()
                    }
//                    val message = "请更新视频：${mVodBean.vod_name}\n视频播放源：${playActivity.playFrom.player_info.show}\n当前剧集数：${playActivity.playList!![urlIndex].name}"
//                    FeedbackActivity.start(mActivity, message)
                }
//        headerView.findViewById<TextView>(R.id.item_tv_playinfo_feedback)
//
//                .setOnClickListener {
//                    val message = "视频数据：${mVodBean.vod_name} 播放失败\n视频来源：${playActivity.playFrom.player_info.show}\n视频序号：${playActivity.playList!![urlIndex].name}\n视频地址：${playActivity.playList!![urlIndex].url}"
//                    FeedbackActivity.start(mActivity, message)
//                }
//        headerView.findViewById<TextView>(R.id.item_tv_playinfo_share)
//                .setOnClickListener {
//                    if (!UserUtils.isLogin()) {
//                        ActivityUtils.startActivity(LoginActivity::class.java)
//                    } else {
//                        var intn = Intent(this.mActivity, ShareActivity::class.java)
//                        intn.putExtra("vom_name", mVodBean.vodName)
//                        intn.putExtra("vod_pic", mVodBean.vodPic) //图片
//                        Log.e("wqddg", mVodBean.toString())
//                        intn.putExtra("vod_class", mVodBean.vod_year + " | " + mVodBean.vod_area + " | " + mVodBean.vod_class) //标签
//                        intn.putExtra("vod_blurd", mVodBean.vodBlurb) //注释
//                        startActivity(intn)
//                    }
//                }
        tvLastest.setOnClickListener {
            playActivity.showPlayList()
        }
        ivLastest.setOnClickListener {
            playActivity.showPlayList()
        }
        Glide.with(this)
                .load(mVodBean.vodPic)
                .placeholder(R.drawable.vod_pic_img)
//                .into(vodPics)
//        itemTvPlayinfoComment.text = "${mVodBean.comment_num} 评论"
        headerView.findViewById<TextView>(R.id.rlComment).text = "${mVodBean.comment_num} 评论"
        headerView.findViewById<TextView>(R.id.item_tv_playinfo_tvyear).text = mVodBean.vod_pubdate + " 上映"
        title.text = mVodBean.vod_name
        hits.text = "" + mVodBean.vod_hits + "次播放"
        score.text = mVodBean.vod_score + "分"
        sortVodView.text = mVodBean.vod_class.replace(",", " ")
        intro.setOnClickListener {
            playActivity.showSummary()

        }

        if (mVodBean.vodRemarks.isNotEmpty()) {
            tvLastest.text = mVodBeans
            ivLastest.visibility = View.VISIBLE
        } else {
            ivLastest.visibility = View.GONE
        }
//        vod_play_list.cl
        vod_play_list = mVodBean.vod_play_list
        rvLastest.layoutManager = LinearLayoutManager(mActivity).apply {
            orientation = LinearLayoutManager.HORIZONTAL
        }
        rvLastest.adapter = selectionAdapter


        if (vod_play_list.isNotEmpty()) {
            for (i in vod_play_list.indices) {
                val playFromBean = vod_play_list[i]
                val playerInfo = playFromBean.player_info
                val urls = playFromBean.urls
                var playSource = playerInfo.show
                if (StringUtils.isEmpty(playSource)) {
                    playSource = "默认"
                }
                if (i == playSourceIndex) {
                    selectionAdapter.addData(urls)
                }

                val tab = tlPlaySource.newTab().setText(playSource)
                tlPlaySource.addTab(tab)
            }
        }

        tlPlaySource.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(p0: TabLayout.Tab?) {
                Log.d("", "")
            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {
                Log.d("", "")
            }

            override fun onTabSelected(p0: TabLayout.Tab?) {

                val playFromBean = vod_play_list[tlPlaySource.selectedTabPosition]

                selectionAdapter.setNewData(playFromBean.urls)

                playActivity.changePlaySource(playFromBean, tlPlaySource.selectedTabPosition)
            }

        })

        tlPlaySource.getTabAt(playSourceIndex)?.select()
        scrollCurIndex(rvLastest)

        item_frame = headerView.findViewById<FrameLayout>(R.id.item_frame)
        getStartData()
        val rvRecommand = headerView.findViewById<RecyclerView>(R.id.rvRecommand)
        val tvChange = headerView.findViewById<TextView>(R.id.tvChange)
        val tvSameType = headerView.findViewById<TextView>(R.id.tvSameType)
        val tvSameActor = headerView.findViewById<TextView>(R.id.tvSameActor)
        val dividerItemDecoration = MyDividerItemDecoration(mActivity, RecyclerView.HORIZONTAL, false)
        dividerItemDecoration.setDrawable(mActivity.resources.getDrawable(R.drawable.divider_image))
        rvRecommand.addItemDecoration(dividerItemDecoration)
//        rvRecommand.layoutManager = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)
        rvRecommand.layoutManager = GridLayoutManager(mActivity, 3, RecyclerView.VERTICAL, false).apply {
            spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
                override fun getSpanSize(position: Int): Int {
                    return 3
                }
            }
        }
        rvRecommand.adapter = recommendAdapter
        tvChange.setOnClickListener {
            when (curType) {
                0 -> getSameTypeData()
                1 -> getSameActorData()
            }
        }
        tvSameType.setOnClickListener {
            if (curType != 0) {
                curType = 0
                tvSameType.setTextColor(ColorUtils.getColor(R.color.colorPrimary))
                tvSameActor.setTextColor(ColorUtils.getColor(R.color.gray_999))
                getSameTypeData()
            }
        }

        checkOrder.setOnCheckedChangeListener { buttonView, isChecked ->

            val data = selectionAdapter.data
            mVodBean.vod_play_list.forEachIndexed { index, playFromBean ->
                playFromBean.urls.reverse()
            }
            //vod_play_list = vod_play_list.reversed()

//            if (data.size == 1){
//                checkOrder.isChecked =!isChecked
//                return@setOnCheckedChangeListener
//            }

            //data.reverse()

            selectionAdapter.setNewData(mVodBean.vod_play_list[playActivity.playSourceIndex].urls)
            isOrder = !isChecked
            playActivity.changeSelection(urlIndex, true)

        }

        tvSameActor.setOnClickListener {
            if (curType != 1) {
                curType = 1
                tvSameType.setTextColor(ColorUtils.getColor(R.color.gray_999))
                tvSameActor.setTextColor(ColorUtils.getColor(R.color.colorPrimary))
                getSameActorData()
            }
        }
        headerView.findViewById<TextView>(R.id.rlComment)
        .setOnClickListener {
            if (UserUtils.isLogin()) {
                CommentDialog(mActivity, "讨论")
                        .setOnCommentSubmitClickListener(object : CommentDialog.OnCommentSubmitClickListener {
                            override fun onCommentSubmit(comment: String) {
                                commitComment(comment)
                            }
                        })
                        .show()
            } else {
                LoginActivity.start()
            }

        }
//        item_tv_playinfo_collect.setOnClickListener {
//            if (UserUtils.isLogin()) {
//                if (isCollected) {
//                    uncollection()
//                } else {
//                    collection()
//                }
//            } else {
//                ActivityUtils.startActivity(LoginActivity::class.java)
//            }
//
//        }
//        item_tv_playinfo_download.setOnClickListener {
//            if (MMkvUtils.Builds().loadStartBean("")?.ads?.download?.status != 0) {
//                if (!LoginUtils.checkLogin2(activity)) {
//                    HitDialog(context!!).setTitle("提示").setMessage("需登录后开通VIP才可下载，确定登录。").setOnHitDialogClickListener(object : OnHitDialogClickListener() {
//                        override fun onCancelClick(dialog: HitDialog) {
//                            super.onCancelClick(dialog)
//                        }
//
//                        override fun onOkClick(dialog: HitDialog) {
//                            super.onOkClick(dialog)
//                            ActivityUtils.startActivity(LoginActivity::class.java)
//                        }
//                    }).show()
//                } else {
//                    if (LoginUtils.checkVIP(activity, "下载需要开通vip是否去开通")) {
//                        startCache()
//                    }
//                }
//            } else {
//                startCache()
//            }
//        }

        //留言广告
        headerView.findViewById<TextView>(R.id.item_tv_playinfo_feedback).setOnClickListener {
            Log.d("留言广告开关", "initHeaderMsg: " + lvdou_status)
            if (wqddg_gs != null && wqddg_gs != "" && lvdou_status == 1) {
                HitDialog(context!!).setTitle("提示").setMessage("留言求片需要观看一段广告噢~~~").setOnHitDialogClickListener(object : OnHitDialogClickListener() {
                    override fun onOkClick(dialog: HitDialog) {
                        super.onOkClick(dialog)
                        val progressDialog = ProgressDialog.show(mActivity, "请求中", "please waiting...")
                        val adClient = AdClient(activity)
                        adClient.requestFullScreenVideoAd("10806", object : AdLoadAdapter() {
                            override fun onAdLoad(ad: SSPAd) {
                                super.onAdLoad(ad)
                                progressDialog.dismiss()
                                val message = "视频数据：${mVodBean.vod_name} 播放失败\n视频来源：${playActivity.playFrom.player_info.show}\n视频序号：${playActivity.playList!![urlIndex].name}\n视频地址：${playActivity.playList!![urlIndex].url}"
                                FeedbackActivity.start(mActivity, message)
                            }
                            override fun onError(i: Int, s: String) {
                                progressDialog.dismiss()
                                val message = "视频数据：${mVodBean.vod_name} 播放失败\n视频来源：${playActivity.playFrom.player_info.show}\n视频序号：${playActivity.playList!![urlIndex].name}\n视频地址：${playActivity.playList!![urlIndex].url}"
                                FeedbackActivity.start(mActivity, message)
                            }
                        })

                    }
                }).show()
            } else {
                val message = "视频数据：${mVodBean.vod_name} 播放失败\n视频来源：${playActivity.playFrom.player_info.show}\n视频序号：${playActivity.playList!![urlIndex].name}\n视频地址：${playActivity.playList!![urlIndex].url}"
                FeedbackActivity.start(mActivity, message)
            }
        }
        headerView.findViewById<TextView>(R.id.item_tv_playinfo_share).setOnClickListener {
            if (!UserUtils.isLogin()) {
                ActivityUtils.startActivity(LoginActivity::class.java)
            } else {
                var intn = Intent(this.mActivity, ShareActivity::class.java)
                intn.putExtra("vom_name", mVodBean.vodName)
                intn.putExtra("vod_pic", mVodBean.vodPic) //图片
                Log.e("wqddg", mVodBean.toString())
                intn.putExtra("vod_class", mVodBean.vod_year + " | " + mVodBean.vod_area + " | " + mVodBean.vod_class) //标签
                intn.putExtra("vod_blurd", mVodBean.vodBlurb) //注释
                startActivity(intn)
            }
        }
        Log.d("hhhh1", "嘿嘿${selectionAdapter.data.size}")
    }

    private fun sendDanmu(content: String, str: String) { //从cn.lvdou.vod.ui.play.NewPlayActivity复制过来的
        if (content.isEmpty()) { //cn.lvdou.av.play.AvVideoController下有个showDanmaku()方法可以拉起原来的弹幕输入框
            ToastUtils.showShort("请输入弹幕！")
            return
        }
        val vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
        if (AgainstCheatUtil.showWarn(vodService)) {
            return
        }
        //上传弹幕所需参数？
        Log.d("弹幕内容", "onSuccess: $content")
        Log.d("视频ID", "onSuccess: " + mVodBean.vod_id.toString())
        Log.d("这个是啥", "onSuccess: " + System.currentTimeMillis().toString())

        RequestManager.execute(  //这个函数可能有问题
                mActivity,
                vodService.sendDanmu(content, mVodBean.vod_id.toString() + urlIndex, str),
                object : BaseObserver<GetScoreBean>() {
                    override fun onSuccess(data: GetScoreBean) {
                        if (data.score != "0") {
                            Utils.runOnUiThread {
                                ToastUtils.showShort("发送弹幕成功，获得${data.score}积分")
                            }
                        }
                    }

                    override fun onError(e: ResponseException) {
                        Utils.runOnUiThread {
                            ToastUtils.showShort(e.getErrorMessage())
                        }
                    }
                })
    }

    private fun scrollCurIndex(rvLastest: RecyclerView) {

        rvLastest.smoothScrollToPosition(urlIndex)
        val mLayoutManager = rvLastest.layoutManager as LinearLayoutManager
        mLayoutManager.scrollToPositionWithOffset(urlIndex, 0)


    }

    override fun initListener() {
        super.initListener()
        refreshLayout.setOnLoadMoreListener {
            curCommentPage++
            getCommentList()
        }
    }

    private fun collection() {
        val vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
        if (AgainstCheatUtil.showWarn(vodService)) {
            return
        }
        RequestManager.execute(this,
                vodService.collect(1.toString(), mVodBean.vod_id.toString(), 2.toString()),
                object : BaseObserver<String>() {
                    override fun onSuccess(data: String) {
                        ToastUtils.showShort("已收藏")
                        val drawable = mActivity.getDrawable(R.drawable.ic_collected2)
                        isCollected = true
                        drawable?.setBounds(0, 0, drawable.minimumWidth,
                                drawable.minimumHeight)
                        headerView.findViewById<TextView>(R.id.item_tv_playinfo_collect)
                                .apply {
                                    setCompoundDrawables(null, drawable, null, null)
                                }
                        val drawables = mActivity.getDrawable(R.drawable.ico_qxsryy)
                        isCollected = true
                        drawables?.setBounds(0, 0, drawables.minimumWidth,
                                drawables.minimumHeight)
                        headerView.findViewById<TextView>(R.id.item_tv_playinfo_collects)
                                .apply {
                                    setCompoundDrawables(null, drawables, null, null)
                                }
                    }

                    override fun onError(e: ResponseException) {

                    }

                })
    }

    private fun uncollection() {
        val vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
        if (AgainstCheatUtil.showWarn(vodService)) {
            return
        }
        RequestManager.execute(this,
                vodService.deleteCollect(mVodBean.vod_id.toString(), 2.toString()),
                object : BaseObserver<String>() {
                    override fun onSuccess(data: String) {
                        ToastUtils.showShort("取消成功")
                        isCollected = false
                        val drawable = mActivity.getDrawable(R.drawable.ic_collection2)
                        drawable?.setBounds(0, 0, drawable.minimumWidth,
                                drawable.minimumHeight)
                        headerView.findViewById<TextView>(R.id.item_tv_playinfo_collect)
                                .apply {
                                    setCompoundDrawables(null, drawable, null, null)
                                }
                        val drawables = mActivity.getDrawable(R.drawable.ico_sryy)
                        isCollected = false
                        drawables?.setBounds(0, 0, drawables.minimumWidth,
                                drawables.minimumHeight)
                        headerView.findViewById<TextView>(R.id.item_tv_playinfo_collects)
                                .apply {
                                    setCompoundDrawables(null, drawables, null, null)
                                }
                    }

                    override fun onError(e: ResponseException) {
                    }

                }
        )
    }

    private fun getCollectionState() {
        if (UserUtils.isLogin()) {
            val vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
            if (AgainstCheatUtil.showWarn(vodService)) {
                return
            }
            RequestManager.execute(this,
                    vodService.getCollectList(1.toString(), 100.toString(), 2.toString()),
                    object : BaseObserver<Page<CollectionBean>>() {
                        @SuppressLint("UseCompatLoadingForDrawables")
                        override fun onSuccess(data: Page<CollectionBean>) {
                            for (bean in data.list) {
                                if (bean.data.id == mVodBean.vod_id) {
                                    isCollected = true
                                    break
                                }
                            }
                            if (isCollected) {
                                val drawable = mActivity.getDrawable(R.drawable.ic_collected2)
                                drawable?.setBounds(0, 0, drawable.minimumWidth,
                                        drawable.minimumHeight)
                                headerView.findViewById<TextView>(R.id.item_tv_playinfo_collect)
                                        .apply {
                                            setCompoundDrawables(null, drawable, null, null)
                                        }
                                val drawables = mActivity.getDrawable(R.drawable.ico_qxsryy)
                                drawables?.setBounds(0, 0, drawables.minimumWidth,
                                        drawables.minimumHeight)
                                headerView.findViewById<TextView>(R.id.item_tv_playinfo_collects)
                                        .apply {
                                            setCompoundDrawables(null, drawables, null, null)
                                        }
                            } else {
                                val drawable = mActivity.getDrawable(R.drawable.ic_collection2)
                                drawable?.setBounds(0, 0, drawable.minimumWidth,
                                        drawable.minimumHeight)
                                headerView.findViewById<TextView>(R.id.item_tv_playinfo_collect)
                                        .apply {
                                            setCompoundDrawables(null, drawable, null, null)
                                        }
                                val drawables = mActivity.getDrawable(R.drawable.ico_sryy)
                                drawables?.setBounds(0, 0, drawables.minimumWidth,
                                        drawables.minimumHeight)
                                headerView.findViewById<TextView>(R.id.item_tv_playinfo_collects)
                                        .apply {
                                            setCompoundDrawables(null, drawables, null, null)
                                        }
                            }

                        }

                        override fun onError(e: ResponseException) {

                        }

                    })
        }
    }

    private fun score() {
        val vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
        if (AgainstCheatUtil.showWarn(vodService)) {
            return
        }
        ScoreDialog(mActivity)
                .setOnScoreSubmitClickListener(object : ScoreDialog.OnScoreSubmitClickListener {
                    override fun onScoreSubmit(scoreDialog: ScoreDialog, score: Float) {
                        if (score == 0f) {
                            ToastUtils.showShort("评分不能为空!")
                        } else {
                            scoreDialog.dismiss()
                            val vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
                            if (AgainstCheatUtil.showWarn(vodService)) {
                                return
                            }
                            RequestManager.execute(
                                    this@VideoDetailFragment,
                                    vodService.score(mVodBean.vod_id.toString(), score.toString()),
                                    object : BaseObserver<GetScoreBean>() {
                                        override fun onSuccess(data: GetScoreBean) {
                                            if (data.score != "0") {
                                                ToastUtils.showShort("评分成功，获得${data.score}积分")
                                            }
                                        }

                                        override fun onError(e: ResponseException) {
                                        }
                                    }
                            )
                        }
                    }
                })
                .show()
    }

    private fun commitComment(commentContent: String) {
        val vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
        if (AgainstCheatUtil.showWarn(vodService)) {
            return
        }
        RequestManager.execute(this,
                vodService.comment(commentContent, 1.toString(), mVodBean.vod_id.toString()),
                object : BaseObserver<GetScoreBean>() {
                    override fun onSuccess(data: GetScoreBean) {
                        if (data.score == "0") {
                            ToastUtils.showShort("评论成功")
                        } else {
                            ToastUtils.showShort("评论成功,获得${data.score}积分")
                        }
                        curCommentPage = 1
                        getCommentList(true)
                    }

                    override fun onError(e: ResponseException) {

                    }

                })
    }

    private fun replayComment(commentContent: String, commentId: String, commentPid: String) {
        val vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
        if (AgainstCheatUtil.showWarn(vodService)) {
            return
        }
        RequestManager.execute(this,
                vodService.replayComment(commentContent, 1.toString(), mVodBean.vod_id.toString(), commentId, commentPid),
                object : BaseObserver<String>() {
                    override fun onSuccess(data: String) {

                    }

                    override fun onError(e: ResponseException) {

                    }

                })
    }

    private fun getCommentList(isFresh: Boolean = false) {
        val vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
        if (AgainstCheatUtil.showWarn(vodService)) {
            return
        }
        RequestManager.execute(this,
                vodService.getCommentList(mVodBean.vod_id, 1.toString(), curCommentPage, 10),
                object : BaseObserver<Page<CommentBean>>() {
                    override fun onSuccess(data: Page<CommentBean>) {
                        if (curCommentPage == 1) {
                            if (isFresh)
                                commentAdapter.setNewData(data.list)
                            else
                                commentAdapter.addData(data.list)
                        }

                        if (curCommentPage > 1) {
                            commentAdapter.addData(data.list)
                            if (refreshLayout != null) {
                                if (data.list.isEmpty()) {
                                    refreshLayout.finishLoadMoreWithNoMoreData()
                                } else {
                                    refreshLayout.finishLoadMore(true)
                                }
                            }
                        }
                    }

                    override fun onError(e: ResponseException) {
                        if (curCommentPage > 1 && refreshLayout != null) {
                            refreshLayout.finishLoadMore(false)
                        }
                    }

                })
    }

    private fun getSameTypeData() {
        val vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
        if (AgainstCheatUtil.showWarn(vodService)) {
            return
        }
        RequestManager.execute(this,
                vodService.getSameTypeList(mVodBean.type_id, mVodBean.vod_class, curSameTypePage, 3),
                object : BaseObserver<Page<VodBean>>() {
                    override fun onSuccess(data: Page<VodBean>) {
                        if (data.list.isNotEmpty()) {
                            curSameTypePage++
                            recommendAdapter.setNewData(data.list)
                        }
                    }

                    override fun onError(e: ResponseException) {
                    }

                })
    }

    private fun getSameActorData() {
        val vodService = Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
        if (AgainstCheatUtil.showWarn(vodService)) {
            return
        }
        RequestManager.execute(this,
                vodService.getSameActorList(mVodBean.type_id, mVodBean.vod_actor, curSameActorPage, 3),
                object : BaseObserver<Page<VodBean>>() {
                    override fun onSuccess(data: Page<VodBean>) {
                        if (data.list.isNotEmpty()) {
                            recommendAdapter.setNewData(data.list)
                            curSameActorPage++
                        }
                    }

                    override fun onError(e: ResponseException) {

                    }

                })
    }

    fun changePlaysource(playSourceIndex: Int) {
        tlPlaySource.getTabAt(playSourceIndex)?.select()
    }

    private class CommentAdapter : BaseQuickAdapter<CommentBean, BaseViewHolder>(R.layout.item_hot_comment) {
        override fun convert(helper: BaseViewHolder, item: CommentBean?) {
            helper.let {
                item?.run {
                    it.setText(R.id.tvUser, comment_name)
                    it.setText(R.id.tvTime, TimeUtils.millis2String(comment_time * 1000))
                    it.setText(R.id.tvComment, comment_content)
                    val ivAvatar = it.getView<ImageView>(R.id.ivAvatar)
                    if (user_portrait.isNotEmpty()) {
                        Glide.with(helper.convertView)
                                .load(ApiConfig.MOGAI_BASE_URL + "/" + user_portrait)
                                .apply(RequestOptions.bitmapTransform(CircleCrop()))
                                .into(ivAvatar)
                    } else {
                        Glide.with(helper.convertView)
                                .load(R.drawable.user_tx)
                                .apply(RequestOptions.bitmapTransform(CircleCrop()))
                                .into(ivAvatar)
                    }
                }
            }
        }


    }

    private class RecommendAdapter : BaseQuickAdapter<VodBean, BaseViewHolder>(R.layout.item_card_child) {

        override fun convert(helper: BaseViewHolder, item: VodBean) {
            helper.setVisible(R.id.item_tv_card_child_tip, false)
            helper.setText(R.id.item_tv_card_child_title, item.vodName)
            helper.setText(R.id.item_tv_card_child_up_title, item.vodRemarks)
            val img = item.vod_pic

            val icon = helper.getView<ImageView>(R.id.item_iv_card_child_icon)
            val lp = icon.layoutParams
            val perWidth = (getScreenWidth(LitePalApplication.getContext()) - dp2px(LitePalApplication.getContext(), 4f)) / 3
            lp.height = (perWidth * 1.4f).toInt()
            icon.layoutParams = lp

            val multiTransformation = MultiTransformation(CenterInside(), RoundedCornersTransformation(15, 8, RoundedCornersTransformation.CornerType.ALL))

            Glide.with(helper.itemView.context)
                    .load(img)
                    .thumbnail(1.0f)
                    .apply(RequestOptions.bitmapTransform(multiTransformation))
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(icon)
        }
    }

    inner class SelectionAdapter : BaseQuickAdapter<UrlBean, BaseViewHolder>(R.layout.item_video_source) {

        override fun convert(helper: BaseViewHolder, item: UrlBean) {
            if (mVodBean.type_id == 3) {
                helper.itemView.layoutParams = helper.itemView.layoutParams.apply {
                    width = ViewGroup.MarginLayoutParams.WRAP_CONTENT //ConvertUtils.dp2px(130f)
                    height = ConvertUtils.dp2px(50f)
                }
            } else {
                helper.itemView.layoutParams = helper.itemView.layoutParams.apply {
                    width = ViewGroup.MarginLayoutParams.WRAP_CONTENT//ConvertUtils.dp2px(50f)
                    height = ConvertUtils.dp2px(50f)
                }
            }
            val position = helper.layoutPosition
//            if (isOrder) {
            if (position == urlIndex) {
                helper.setTextColor(R.id.tv, ColorUtils.getColor(R.color.userTopBg))
                helper.setVisible(R.id.wqddg_AudioWaveView,true);
            } else {
                helper.setTextColor(R.id.tv, ColorUtils.getColor(R.color.gray_999))
                helper.setVisible(R.id.wqddg_AudioWaveView,false);
            }
//            } else {
//                var indexPostion = 0
//                if (urlIndex == 0) {
//                    indexPostion = urlIndex
//                } else {
//                    indexPostion = selectionAdapter.data.size - 1 - urlIndex
//                }
//                if (position == indexPostion) {
//                    helper.setTextColor(R.id.tv, ColorUtils.getColor(R.color.userTopBg))
//                } else {
//                    helper.setTextColor(R.id.tv, ColorUtils.getColor(R.color.gray_999))
//                }
//            }
            val name = item.name.replace("第", "").replace("集", "")
            helper.setText(R.id.tv, name)

        }
    }

    companion object {

        var mVodBeans = ""

        const val VOD_BEAN = "vodBean"

        const val URL_INDEX = "urlIndex"

        const val PLAY_SOURCE_INDEX = "playInfoIndex"

        fun newInstance(vodBean: VodBean, urlIndex: Int, playSourceIndex: Int): VideoDetailFragment = VideoDetailFragment().apply {
            arguments = Bundle().apply {
                putParcelable(VOD_BEAN, vodBean)
                putInt(URL_INDEX, urlIndex)
                putInt(PLAY_SOURCE_INDEX, playSourceIndex)
            }
        }
    }


    private fun startCache() {
        val bottomSheetDialog = activity?.let {

            BottomSheetDialog(it)
        }
        val view: View = LayoutInflater.from(activity).inflate(R.layout.cache_all_list_layout, null)
        bottomSheetDialog?.setContentView(view)
        bottomSheetDialog?.window?.findViewById<View>(R.id.design_bottom_sheet)?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//        if (vod_play_list.isEmpty()) {
//            Toast.makeText(activity, "正在请求数据，请稍后", Toast.LENGTH_SHORT).show()
//            return
//        }
        val cacheItem: ArrayList<Square> = ArrayList()
        if (vod_play_list.isNotEmpty()) {
            val playInfoBean = playActivity.playFrom
            val urlS = playInfoBean.urls
            if (urlS.isNotEmpty()) {
                for (index in urlS.indices) {
                    val urlBean = urlS[index]
                    val square = Square(urlBean.name) {
                        val downloadTitle = "${mVodBean.vodName}\t${urlBean.name}"
                        Log.e("TAG", "" + urlBean.url)
                        if (urlBean.url.contains(".m3u8?") || urlBean.url.endsWith(".m3u8")) {
                            val imageView = it.findViewById<ImageView>(R.id.status_tag)
                            imageView.setVisibility(View.VISIBLE)
                            imageView.setImageResource(R.drawable.ic_cache_down)
                            Toast.makeText(activity, "开始缓存第${urlBean.name}集", Toast.LENGTH_SHORT).show()
                            // 三个参数 下载地址 标题  封面图片
                            DownloadPresenter.addM3u8Task(activity, urlBean.url, downloadTitle, mVodBean.vod_pic)
                        } else {
                            var iscache = false;
                            if (!isParse) {
                                it.isSelected = true
                                val imageView = it.findViewById<ImageView>(R.id.status_tag)
                                imageView.setVisibility(View.VISIBLE)
                                imageView.setImageResource(R.drawable.ic_cache_down)
                                isParse = true

                                // 链接转换
                                val parse = playInfoBean.player_info.parse2
                                JieXiUtils2.INSTANCE.getPlayUrl(parse, urlBean.url, curParseIndex, object : BackListener {
                                    override fun onSuccess(url: String, curParseIndex: Int) {
                                        isParse = false
                                        LogUtils.eTag("TAG", "onSuccess: curParseIndex =  $curParseIndex url=${url}")
                                        url.let {
                                            if (url.endsWith(".m3u8") || url.contains(".m3u8?")) {
                                                if (!iscache) {
                                                    iscache = true
                                                    Toast.makeText(activity, "开始缓存${urlBean.name}", Toast.LENGTH_SHORT).show()
                                                    // 三个参数 下载地址 标题  封面图片
                                                    DownloadPresenter.addM3u8Task(activity, it, downloadTitle, mVodBean.vod_pic)
                                                }

                                            } else {
                                                ToastUtils.showLong("不支持此链接缓存。")
                                            }
                                        }

                                    }

                                    override fun onError() {
                                        isParse = false
                                        ToastUtils.showLong("解析失败，请尝试切换线路缓存")
                                    }

                                    override fun onProgressUpdate(msg: String?) {

                                    }
                                }, curFailIndex)
                            } else {
                                ToastUtils.showLong("请等待上一个解析完在缓存")
                            }
                        }
                    }

                    square.isSelected = false
                    square.finished = false
                    val info: List<M3u8DownloadingInfo> = DownloadPresenter.getM3u8DownLoading(urlS[index].url)
                    if (info.isNotEmpty()) {
                        //正在下载中
                        square.isSelected = true
                    }
                    val doneInfos: List<M3u8DoneInfo> = DownloadPresenter.getM3u8Done(urlS[index].url)
                    if (doneInfos.isNotEmpty()) {
                        //已下载完成
                        square.isSelected = false
                        square.finished = true
                    }
                    cacheItem.add(square)
                }
                val selectedSet = TreeSet<Int>()
                val multiTypeAdapter = MultiTypeAdapter()
                multiTypeAdapter.register(Square::class.java, SquareViewBinder(selectedSet))
                val cacheItems = ArrayList<Any?>()
                cacheItems.addAll(cacheItem)
                multiTypeAdapter.items = cacheItems
                val allList: RecyclerView = view.findViewById(R.id.all_list)
                val title = view.findViewById<TextView>(R.id.title)
                // 查看下载
                val downCenter = view.findViewById<TextView>(R.id.down_center)
                downCenter.setOnClickListener {
                    //进入下载界面
                    activity?.let { it1 -> AllDownloadActivity.start(it1) }
                    bottomSheetDialog?.dismiss()
                }
                title.text = "缓存剧集"
                val close = view.findViewById<ImageView>(R.id.close)
                val gridLayoutManager = GridLayoutManager(activity, 3)
                gridLayoutManager.orientation = GridLayoutManager.VERTICAL
                allList.addItemDecoration(GridItemDecoration(activity, R.drawable.grid_item_decor))
                allList.layoutManager = gridLayoutManager
                allList.adapter = multiTypeAdapter
                bottomSheetDialog?.show()
                close.setOnClickListener {
                    bottomSheetDialog?.dismiss()
                }
            }
        }
    }

}
