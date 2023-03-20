// Generated code from Butter Knife. Do not modify!
package cn.lvdou.vod.ui.home;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import cn.lvdou.vod.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeOtherChildFragment2_ViewBinding implements Unbinder {
  private HomeOtherChildFragment2 target;

  @UiThread
  public HomeOtherChildFragment2_ViewBinding(HomeOtherChildFragment2 target, View source) {
    this.target = target;

    target.rv_screen_result = Utils.findRequiredViewAsType(source, R.id.rv_screen_result, "field 'rv_screen_result'", RecyclerView.class);
    target.refreshLayout = Utils.findRequiredViewAsType(source, R.id.srl_home_other_child, "field 'refreshLayout'", SmartRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeOtherChildFragment2 target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rv_screen_result = null;
    target.refreshLayout = null;
  }
}
