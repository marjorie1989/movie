package cn.lvdou.vod.base

import android.Manifest
import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.widget.Toast
import butterknife.ButterKnife
import butterknife.Unbinder
import cn.lvdou.vod.App
import cn.lvdou.vod.R
import com.blankj.utilcode.util.BarUtils
import com.blankj.utilcode.util.LogUtils
import com.blankj.utilcode.util.Utils
import com.hjq.permissions.OnPermission
import com.hjq.permissions.XXPermissions
import com.umeng.analytics.MobclickAgent
import com.youxiao.ssp.ad.config.DownloadConfirmPolicy
import com.youxiao.ssp.core.SSPSdk
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import me.yokeyword.fragmentation.SupportActivity
import org.greenrobot.eventbus.EventBus
import java.util.*

abstract class BaseActivity : SupportActivity() {

    private var unbinder: Unbinder? = null
    lateinit var mActivity: BaseActivity

    //画中画权限
    private val PICTURE_PERMISSION = arrayOf(
            Manifest.permission.SYSTEM_ALERT_WINDOW
    )

    private val mDisposablePool: CompositeDisposable by lazy {
        CompositeDisposable()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SSPSdk.init(application, App.SDKID, false)
        SSPSdk.setDownloadConfirmPolicy(DownloadConfirmPolicy.CONFIRM_NONE)
        //设置是否初始化时就申请权限
        SSPSdk.setReqPermission(true)



        BarUtils.setStatusBarColor(this, Color.TRANSPARENT)
        setContentView(getLayoutResID())
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.navigationBarColor = Color.parseColor("#E8E8E8")
        }
        mActivity = this
        BaseApplication.setContextRef(this)
        unbinder = ButterKnife.bind(this)
        if (this.javaClass.isAnnotationPresent(BindEventBus::class.java) || isUseEventBus()) {
            EventBus.getDefault().register(this)
        }
        initView()
        initListener()
        initData()
    }


    /**
     * 请求画中画权限
     */
    open fun requePer(getPermissionSuccess: () -> Unit) {
        if (XXPermissions.isHasPermission(this, PICTURE_PERMISSION)) {
            getPermissionSuccess()
        } else {
            XXPermissions.with(this) // 可设置被拒绝后继续申请，直到用户授权或者永久拒绝
                    .constantRequest()
                    .permission(PICTURE_PERMISSION)
                    .request(object : OnPermission {
                        override fun hasPermission(granted: List<String>, isAll: Boolean) {
                            getPermissionSuccess()
                        }
                        override fun noPermission(denied: List<String>, quick: Boolean) {
                            if (quick) {
                                Toast.makeText(this@BaseActivity, "被永久拒绝授权，请手动授予权限", Toast.LENGTH_LONG).show()
                            } else {
                                Toast.makeText(this@BaseActivity, "获取权限失败", Toast.LENGTH_LONG).show()
                            }
                        }
                    })
        }
    }

    override fun onResume() {
        super.onResume()
        MobclickAgent.onResume(this)
    }

    override fun onPause() {
        super.onPause()
        MobclickAgent.onPause(this)
    }

    protected abstract fun getLayoutResID(): Int

    protected open fun initView() {

    }

    protected open fun initListener() {

    }

    protected open fun initData() {

    }

    protected open fun isUseEventBus(): Boolean {
        return false
    }


    fun addDisposable(disposable: Disposable) {
        if (mDisposablePool.isDisposed)
            mDisposablePool.add(disposable)
    }

    fun removeDisposable(disposable: Disposable) {
        if (mDisposablePool.isDisposed)
            mDisposablePool.remove(disposable)
    }

    fun detach() {
        if (!mDisposablePool.isDisposed)
            mDisposablePool.clear()
    }


    override fun onDestroy() {
        LogUtils.e("onDestroy:--$this")
        super.onDestroy()
        detach()
        if (unbinder != null) unbinder!!.unbind()
        if (this.javaClass.isAnnotationPresent(BindEventBus::class.java) || isUseEventBus()) {
            EventBus.getDefault().unregister(this)
        }
    }

    override fun finish() {
        super.finish()
        this.overridePendingTransition(0, R.anim.slide_out_right)
    }

    @SuppressLint("HardwareIds")
    open fun getAndroidID(): String {
        val id = Settings.Secure.getString(Utils.getApp().contentResolver, Settings.Secure.ANDROID_ID
        )
        return id ?: ""
    }
}
