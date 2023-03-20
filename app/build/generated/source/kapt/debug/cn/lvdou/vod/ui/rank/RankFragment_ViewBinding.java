// Generated code from Butter Knife. Do not modify!
package cn.lvdou.vod.ui.rank;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import cn.lvdou.vod.R;
import com.google.android.material.tabs.TabLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RankFragment_ViewBinding implements Unbinder {
  private RankFragment target;

  @UiThread
  public RankFragment_ViewBinding(RankFragment target, View source) {
    this.target = target;

    target.titleTv = Utils.findRequiredViewAsType(source, R.id.tv_title, "field 'titleTv'", TextView.class);
    target.tl_rank = Utils.findRequiredViewAsType(source, R.id.tl_rank, "field 'tl_rank'", TabLayout.class);
    target.vp_rank = Utils.findRequiredViewAsType(source, R.id.vp_rank, "field 'vp_rank'", ViewPager.class);
    target.rl_day = Utils.findRequiredViewAsType(source, R.id.rl_day, "field 'rl_day'", RelativeLayout.class);
    target.tv_day = Utils.findRequiredViewAsType(source, R.id.tv_day, "field 'tv_day'", TextView.class);
    target.hot_data_up_time = Utils.findRequiredViewAsType(source, R.id.hot_data_up_time, "field 'hot_data_up_time'", TextView.class);
    target.iv_show = Utils.findRequiredViewAsType(source, R.id.iv_show, "field 'iv_show'", ImageView.class);
    target.app_my_sc_sch = Utils.findRequiredViewAsType(source, R.id.app_my_sc_sch, "field 'app_my_sc_sch'", ImageView.class);
    target.linear_Banners = Utils.findRequiredViewAsType(source, R.id.linear_Banners, "field 'linear_Banners'", FrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RankFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleTv = null;
    target.tl_rank = null;
    target.vp_rank = null;
    target.rl_day = null;
    target.tv_day = null;
    target.hot_data_up_time = null;
    target.iv_show = null;
    target.app_my_sc_sch = null;
    target.linear_Banners = null;
  }
}
