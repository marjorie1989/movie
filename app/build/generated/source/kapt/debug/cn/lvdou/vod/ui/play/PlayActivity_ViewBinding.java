// Generated code from Butter Knife. Do not modify!
package cn.lvdou.vod.ui.play;

import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import cn.lvdou.av.play.AvVideoView;
import cn.lvdou.vod.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PlayActivity_ViewBinding implements Unbinder {
  private PlayActivity target;

  @UiThread
  public PlayActivity_ViewBinding(PlayActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PlayActivity_ViewBinding(PlayActivity target, View source) {
    this.target = target;

    target.videoView = Utils.findRequiredViewAsType(source, R.id.avv_play, "field 'videoView'", AvVideoView.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.rv_play_content, "field 'recyclerView'", RecyclerView.class);
    target.tvTitle = Utils.findRequiredViewAsType(source, R.id.tv_title, "field 'tvTitle'", TextView.class);
    target.tvYear = Utils.findRequiredViewAsType(source, R.id.tv_year, "field 'tvYear'", TextView.class);
    target.tvActor = Utils.findRequiredViewAsType(source, R.id.tv_actor, "field 'tvActor'", TextView.class);
    target.tvType = Utils.findRequiredViewAsType(source, R.id.tv_type, "field 'tvType'", TextView.class);
    target.tvStatus = Utils.findRequiredViewAsType(source, R.id.tv_status, "field 'tvStatus'", TextView.class);
    target.tvPlayNumber = Utils.findRequiredViewAsType(source, R.id.tv_play_number, "field 'tvPlayNumber'", TextView.class);
    target.tvScore = Utils.findRequiredViewAsType(source, R.id.tv_score, "field 'tvScore'", TextView.class);
    target.tvSummaryHint = Utils.findRequiredViewAsType(source, R.id.tv_summary_hint, "field 'tvSummaryHint'", TextView.class);
    target.tvSummary = Utils.findRequiredViewAsType(source, R.id.tv_summary, "field 'tvSummary'", TextView.class);
    target.scSummary = Utils.findRequiredViewAsType(source, R.id.scSummary, "field 'scSummary'", ScrollView.class);
    target.ivCloseIntro = Utils.findRequiredViewAsType(source, R.id.iv_close_intro, "field 'ivCloseIntro'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PlayActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.videoView = null;
    target.recyclerView = null;
    target.tvTitle = null;
    target.tvYear = null;
    target.tvActor = null;
    target.tvType = null;
    target.tvStatus = null;
    target.tvPlayNumber = null;
    target.tvScore = null;
    target.tvSummaryHint = null;
    target.tvSummary = null;
    target.scSummary = null;
    target.ivCloseIntro = null;
  }
}
