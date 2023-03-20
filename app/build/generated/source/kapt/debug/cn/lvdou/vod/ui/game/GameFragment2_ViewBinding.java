// Generated code from Butter Knife. Do not modify!
package cn.lvdou.vod.ui.game;

import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import cn.lvdou.vod.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GameFragment2_ViewBinding implements Unbinder {
  private GameFragment2 target;

  @UiThread
  public GameFragment2_ViewBinding(GameFragment2 target, View source) {
    this.target = target;

    target.webview = Utils.findRequiredViewAsType(source, R.id.webview, "field 'webview'", WebView.class);
    target.titleTv = Utils.findRequiredViewAsType(source, R.id.tv_title, "field 'titleTv'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GameFragment2 target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.webview = null;
    target.titleTv = null;
  }
}
