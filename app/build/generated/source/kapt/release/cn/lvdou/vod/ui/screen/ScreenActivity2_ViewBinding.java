// Generated code from Butter Knife. Do not modify!
package cn.lvdou.vod.ui.screen;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import cn.lvdou.vod.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ScreenActivity2_ViewBinding implements Unbinder {
  private ScreenActivity2 target;

  private View view7f080608;

  private View view7f0801c8;

  @UiThread
  public ScreenActivity2_ViewBinding(ScreenActivity2 target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ScreenActivity2_ViewBinding(final ScreenActivity2 target, View source) {
    this.target = target;

    View view;
    target.rv_screen_result = Utils.findRequiredViewAsType(source, R.id.rv_screen_result, "field 'rv_screen_result'", RecyclerView.class);
    target.refreshLayout = Utils.findRequiredViewAsType(source, R.id.srl_home_other_child, "field 'refreshLayout'", SmartRefreshLayout.class);
    target.tv_screen_title = Utils.findRequiredViewAsType(source, R.id.tv_screen_title, "field 'tv_screen_title'", TextView.class);
    view = Utils.findRequiredView(source, R.id.rlBack, "method 'back'");
    view7f080608 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.back();
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_screen_seek, "method 'seek'");
    view7f0801c8 = view;
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
    ScreenActivity2 target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rv_screen_result = null;
    target.refreshLayout = null;
    target.tv_screen_title = null;

    view7f080608.setOnClickListener(null);
    view7f080608 = null;
    view7f0801c8.setOnClickListener(null);
    view7f0801c8 = null;
  }
}
