// Generated code from Butter Knife. Do not modify!
package cn.lvdou.vod.ui.home;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import cn.lvdou.vod.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeOtherChildFragment_ViewBinding implements Unbinder {
  private HomeOtherChildFragment target;

  @UiThread
  public HomeOtherChildFragment_ViewBinding(HomeOtherChildFragment target, View source) {
    this.target = target;

    target.refreshLayout = Utils.findRequiredViewAsType(source, R.id.srl_home_other_child, "field 'refreshLayout'", SwipeRefreshLayout.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.rv_home_other_child, "field 'recyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeOtherChildFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.refreshLayout = null;
    target.recyclerView = null;
  }
}
