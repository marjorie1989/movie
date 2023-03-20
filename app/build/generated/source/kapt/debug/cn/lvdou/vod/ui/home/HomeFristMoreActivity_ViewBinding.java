// Generated code from Butter Knife. Do not modify!
package cn.lvdou.vod.ui.home;

import android.view.View;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import cn.lvdou.vod.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeFristMoreActivity_ViewBinding implements Unbinder {
  private HomeFristMoreActivity target;

  private View view7f0801c9;

  @UiThread
  public HomeFristMoreActivity_ViewBinding(HomeFristMoreActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HomeFristMoreActivity_ViewBinding(final HomeFristMoreActivity target, View source) {
    this.target = target;

    View view;
    target.liveGridView = Utils.findRequiredViewAsType(source, R.id.live_gridview, "field 'liveGridView'", GridView.class);
    target.mTvTitle = Utils.findRequiredViewAsType(source, R.id.tv_task_title, "field 'mTvTitle'", TextView.class);
    target.rlBack = Utils.findRequiredViewAsType(source, R.id.rlBack, "field 'rlBack'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.iv_search, "method 'seek'");
    view7f0801c9 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.seek();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeFristMoreActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.liveGridView = null;
    target.mTvTitle = null;
    target.rlBack = null;

    view7f0801c9.setOnClickListener(null);
    view7f0801c9 = null;
  }
}
