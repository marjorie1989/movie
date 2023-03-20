// Generated code from Butter Knife. Do not modify!
package cn.lvdou.vod.ui.start;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import cn.lvdou.vod.R;
import cn.lvdou.vod.ad.AdWebView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class StartActivity_ViewBinding implements Unbinder {
  private StartActivity target;

  private View view7f08079b;

  @UiThread
  public StartActivity_ViewBinding(StartActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public StartActivity_ViewBinding(final StartActivity target, View source) {
    this.target = target;

    View view;
    target.webView = Utils.findRequiredViewAsType(source, R.id.awv_start, "field 'webView'", AdWebView.class);
    view = Utils.findRequiredView(source, R.id.tv_start, "field 'textView' and method 'missAd'");
    target.textView = Utils.castView(view, R.id.tv_start, "field 'textView'", TextView.class);
    view7f08079b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.missAd();
      }
    });
    target.imageView = Utils.findRequiredViewAsType(source, R.id.iv_image, "field 'imageView'", ImageView.class);
    target.loadTv = Utils.findRequiredViewAsType(source, R.id.tv_load, "field 'loadTv'", TextView.class);
    target.start_frame = Utils.findRequiredViewAsType(source, R.id.start_frame, "field 'start_frame'", ViewGroup.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    StartActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.webView = null;
    target.textView = null;
    target.imageView = null;
    target.loadTv = null;
    target.start_frame = null;

    view7f08079b.setOnClickListener(null);
    view7f08079b = null;
  }
}
