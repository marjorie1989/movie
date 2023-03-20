// Generated code from Butter Knife. Do not modify!
package cn.lvdou.vod.ui.live;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import cn.lvdou.vod.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LiveFragment_ViewBinding implements Unbinder {
  private LiveFragment target;

  @UiThread
  public LiveFragment_ViewBinding(LiveFragment target, View source) {
    this.target = target;

    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
    target.titleTv = Utils.findRequiredViewAsType(source, R.id.tv_title, "field 'titleTv'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LiveFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
    target.titleTv = null;
  }
}
