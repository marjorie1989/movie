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

public class RankChildFragment_ViewBinding implements Unbinder {
  private RankChildFragment target;

  @UiThread
  public RankChildFragment_ViewBinding(RankChildFragment target, View source) {
    this.target = target;

    target.refreshLayout = Utils.findRequiredViewAsType(source, R.id.srl_rank_child, "field 'refreshLayout'", SmartRefreshLayout.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.rv_rank_child, "field 'recyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RankChildFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.refreshLayout = null;
    target.recyclerView = null;
  }
}
