package cn.lvdou.vod.ui.collection

import android.graphics.Bitmap
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import cn.lvdou.vod.R
import cn.lvdou.vod.base.BaseFragment
import cn.lvdou.vod.base.exception.ResponseException
import cn.lvdou.vod.base.observer.BaseObserver
import cn.lvdou.vod.bean.CollectionBean
import cn.lvdou.vod.bean.Page
import cn.lvdou.vod.netservice.VodService
import cn.lvdou.vod.ui.login.LoginActivity
import cn.lvdou.vod.ui.play.PlayActivity
import cn.lvdou.vod.utils.AgainstCheatUtil
import cn.lvdou.vod.utils.MMkvUtils
import cn.lvdou.vod.utils.Retrofit2Utils
import cn.lvdou.vod.utils.UserUtils
import com.blankj.utilcode.util.ActivityUtils
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.request.RequestOptions
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.github.StormWyrm.wanandroid.base.net.RequestManager
import com.scwang.smartrefresh.layout.footer.ClassicsFooter
import jp.wasabeef.glide.transformations.RoundedCornersTransformation
import kotlinx.android.synthetic.main.activity_collection.*

class CollectionFragment : BaseFragment() {
    private var curCollectionPage = 1

    private val collectionAdapter: CollectionAdapter by lazy {
        CollectionAdapter().apply {
            setOnItemClickListener { adapter, _, position ->
                val item = adapter.getItem(position) as CollectionBean
                if (!UserUtils.isLogin()) {
                    LoginActivity.start()
                } else {
                    PlayActivity.startByCollection(item.data.id)
                }

            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(): CollectionFragment {
            if (!UserUtils.isLogin()) {
                ActivityUtils.startActivity(LoginActivity::class.java)
            }
            val args = Bundle()
            val fragment = CollectionFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_collection
    }

    override fun onResume() {
        super.onResume()
        getCollectionList()
    }

    override fun initView() {
        super.initView()

        refreshLayout.setEnableRefresh(false)
        refreshLayout.setRefreshFooter(ClassicsFooter(mActivity))

        rvCollection.layoutManager = GridLayoutManager(mActivity,2);
//        rvCollection.layoutManager = LinearLayoutManager(mActivity)
        rvCollection.adapter = collectionAdapter

        getCollectionList()
    }

    override fun initListener() {
        super.initListener()

        refreshLayout.setOnLoadMoreListener {
            curCollectionPage++
            getCollectionList()
        }
    }

    private fun getCollectionList() {
        var vodService= Retrofit2Utils.INSTANCE.createByGson(VodService::class.java)
        if (AgainstCheatUtil.showWarn(vodService)) {
            return;
        }
        RequestManager.execute(this,
                vodService.getCollectList2(),
                object : BaseObserver<Page<CollectionBean>>() {
                    override fun onSuccess(data: Page<CollectionBean>) {
                        collectionAdapter.setNewData(data.list)
                        refreshLayout.finishLoadMoreWithNoMoreData()
                    }

                    override fun onError(e: ResponseException) {
                        if (curCollectionPage > 1) {
                            refreshLayout.finishLoadMore(false)
                        }
                    }

                })
    }

    private fun getSelectCount(): Int {
        var count = 0
        collectionAdapter.data.map {
            count++
        }
        return count
    }


    class CollectionAdapter() : BaseQuickAdapter<CollectionBean, BaseViewHolder>(R.layout.item_collection2) {

        override fun convert(helper: BaseViewHolder, item: CollectionBean?) {
            item?.let {
                helper.setText(R.id.tvName, it.data.name)
                helper.setText(R.id.tvType, it.data.type.type_name)
                val ivAvator = helper.getView<ImageView>(R.id.ivImg)

                val mation: MultiTransformation<Bitmap> = MultiTransformation(CenterCrop(), RoundedCornersTransformation(20, 0, RoundedCornersTransformation.CornerType.ALL))
                Glide.with(helper.itemView.context)
                        .load(it.data.pic)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .apply(RequestOptions.bitmapTransform(mation))
                        .into(ivAvator)
            }

        }

    }


}
