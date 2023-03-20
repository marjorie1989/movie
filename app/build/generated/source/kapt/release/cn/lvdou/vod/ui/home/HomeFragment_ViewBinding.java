// Generated code from Butter Knife. Do not modify!
package cn.lvdou.vod.ui.home;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import cn.lvdou.vod.R;
import com.google.android.material.tabs.TabLayout;
import com.sunfusheng.marqueeview.MarqueeView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeFragment_ViewBinding implements Unbinder {
  private HomeFragment target;

  private View view7f080767;

  private View view7f0801b6;

  private View view7f0801b5;

  @UiThread
  public HomeFragment_ViewBinding(final HomeFragment target, View source) {
    this.target = target;

    View view;
    target.iv_home_top_bg = Utils.findRequiredViewAsType(source, R.id.iv_home_top_bg, "field 'iv_home_top_bg'", ImageView.class);
    target.wqddg_line = Utils.findRequiredViewAsType(source, R.id.wqddg_line, "field 'wqddg_line'", LinearLayout.class);
    target.tv_home_seek = Utils.findRequiredViewAsType(source, R.id.tv_home_seek, "field 'tv_home_seek'", MarqueeView.class);
    view = Utils.findRequiredView(source, R.id.tv_home_all, "field 'tv_home_all' and method 'allScreen'");
    target.tv_home_all = Utils.castView(view, R.id.tv_home_all, "field 'tv_home_all'", TextView.class);
    view7f080767 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.allScreen();
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_home_history, "field 'iv_home_history' and method 'playScore'");
    target.iv_home_history = Utils.castView(view, R.id.iv_home_history, "field 'iv_home_history'", ImageView.class);
    view7f0801b6 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.playScore();
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_home_download, "field 'iv_home_download' and method 'clickDownload'");
    target.iv_home_download = Utils.castView(view, R.id.iv_home_download, "field 'iv_home_download'", ImageView.class);
    view7f0801b5 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clickDownload();
      }
    });
    target.tl_home = Utils.findRequiredViewAsType(source, R.id.tl_home, "field 'tl_home'", TabLayout.class);
    target.conPlayHis = Utils.findRequiredViewAsType(source, R.id.conPlayHis, "field 'conPlayHis'", ConstraintLayout.class);
    target.imgClosHis = Utils.findRequiredViewAsType(source, R.id.imgClosHis, "field 'imgClosHis'", ImageView.class);
    target.tvHis = Utils.findRequiredViewAsType(source, R.id.tvHis, "field 'tvHis'", TextView.class);
    target.tvHis1 = Utils.findRequiredViewAsType(source, R.id.tvHis1, "field 'tvHis1'", TextView.class);
    target.vp_home = Utils.findRequiredViewAsType(source, R.id.vp_home, "field 'vp_home'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.iv_home_top_bg = null;
    target.wqddg_line = null;
    target.tv_home_seek = null;
    target.tv_home_all = null;
    target.iv_home_history = null;
    target.iv_home_download = null;
    target.tl_home = null;
    target.conPlayHis = null;
    target.imgClosHis = null;
    target.tvHis = null;
    target.tvHis1 = null;
    target.vp_home = null;

    view7f080767.setOnClickListener(null);
    view7f080767 = null;
    view7f0801b6.setOnClickListener(null);
    view7f0801b6 = null;
    view7f0801b5.setOnClickListener(null);
    view7f0801b5 = null;
  }
}
