// Generated code from Butter Knife. Do not modify!
package cn.lvdou.vod.pic;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import cn.lvdou.vod.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PicActivity_ViewBinding implements Unbinder {
  private PicActivity target;

  private View view7f0801c0;

  private View view7f0801c1;

  @UiThread
  public PicActivity_ViewBinding(PicActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PicActivity_ViewBinding(final PicActivity target, View source) {
    this.target = target;

    View view;
    target.imageView = Utils.findRequiredViewAsType(source, R.id.iv_pic, "field 'imageView'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.iv_pic_back, "method 'onBack'");
    view7f0801c0 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onBack();
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_pic_edit, "method 'openPic'");
    view7f0801c1 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openPic();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    PicActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageView = null;

    view7f0801c0.setOnClickListener(null);
    view7f0801c0 = null;
    view7f0801c1.setOnClickListener(null);
    view7f0801c1 = null;
  }
}
