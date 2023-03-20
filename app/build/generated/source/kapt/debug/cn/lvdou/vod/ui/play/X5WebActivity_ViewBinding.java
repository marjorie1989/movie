// Generated code from Butter Knife. Do not modify!
package cn.lvdou.vod.ui.play;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import cn.lvdou.vod.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class X5WebActivity_ViewBinding implements Unbinder {
  private X5WebActivity target;

  @UiThread
  public X5WebActivity_ViewBinding(X5WebActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public X5WebActivity_ViewBinding(X5WebActivity target, View source) {
    this.target = target;

    target.tvTitle = Utils.findRequiredViewAsType(source, R.id.tv_title, "field 'tvTitle'", TextView.class);
    target.tvClose = Utils.findRequiredViewAsType(source, R.id.tv_close, "field 'tvClose'", TextView.class);
    target.rlBack = Utils.findRequiredViewAsType(source, R.id.rlBack, "field 'rlBack'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    X5WebActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvTitle = null;
    target.tvClose = null;
    target.rlBack = null;
  }
}
