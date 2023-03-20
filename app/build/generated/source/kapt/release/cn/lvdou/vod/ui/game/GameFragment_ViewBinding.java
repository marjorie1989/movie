// Generated code from Butter Knife. Do not modify!
package cn.lvdou.vod.ui.game;

import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import cn.lvdou.vod.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GameFragment_ViewBinding implements Unbinder {
  private GameFragment target;

  @UiThread
  public GameFragment_ViewBinding(GameFragment target, View source) {
    this.target = target;

    target.gameListView = Utils.findRequiredViewAsType(source, R.id.game_listview, "field 'gameListView'", ListView.class);
    target.bannerImg = Utils.findRequiredViewAsType(source, R.id.banner_img, "field 'bannerImg'", ImageView.class);
    target.tvGdmsg = Utils.findRequiredViewAsType(source, R.id.tv_notice_gdmsg, "field 'tvGdmsg'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GameFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.gameListView = null;
    target.bannerImg = null;
    target.tvGdmsg = null;
  }
}
