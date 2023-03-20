// Generated code from Butter Knife. Do not modify!
package cn.lvdou.vod.ui.seek;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import cn.lvdou.vod.R;
import cn.lvdou.vod.ad.AdWebView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SeekActivity_ViewBinding implements Unbinder {
  private SeekActivity target;

  private View view7f080798;

  private View view7f0801cc;

  private View view7f0801cb;

  private View view7f080608;

  @UiThread
  public SeekActivity_ViewBinding(SeekActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SeekActivity_ViewBinding(final SeekActivity target, View source) {
    this.target = target;

    View view;
    target.awvSeek = Utils.findRequiredViewAsType(source, R.id.awvSeek, "field 'awvSeek'", AdWebView.class);
    target.seekHistoryView = Utils.findRequiredViewAsType(source, R.id.shv_seek, "field 'seekHistoryView'", SeekHistoryView.class);
    view = Utils.findRequiredView(source, R.id.tv_seek_seek, "field 'tv_seek' and method 'seek'");
    target.tv_seek = Utils.castView(view, R.id.tv_seek_seek, "field 'tv_seek'", TextView.class);
    view7f080798 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.seek();
      }
    });
    target.editText = Utils.findRequiredViewAsType(source, R.id.et_seek_seek, "field 'editText'", EditText.class);
    target.nsv = Utils.findRequiredViewAsType(source, R.id.nsv, "field 'nsv'", NestedScrollView.class);
    target.result_recyclerView = Utils.findRequiredViewAsType(source, R.id.rv_seek_result, "field 'result_recyclerView'", RecyclerView.class);
    target.tvSeekHotTitle = Utils.findRequiredViewAsType(source, R.id.tv_seek_hot_title, "field 'tvSeekHotTitle'", AppCompatTextView.class);
    view = Utils.findRequiredView(source, R.id.iv_seek_clear_seek, "field 'ivSeekClearSeek' and method 'clearSeek'");
    target.ivSeekClearSeek = Utils.castView(view, R.id.iv_seek_clear_seek, "field 'ivSeekClearSeek'", ImageView.class);
    view7f0801cc = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clearSeek();
      }
    });
    target.rvAssociate = Utils.findRequiredViewAsType(source, R.id.rvAssociate, "field 'rvAssociate'", RecyclerView.class);
    target.linear_s = Utils.findRequiredViewAsType(source, R.id.linear_s, "field 'linear_s'", FrameLayout.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.rv_seek_hot, "field 'recyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.iv_seek_clear_history, "method 'clearHistory'");
    view7f0801cb = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clearHistory();
      }
    });
    view = Utils.findRequiredView(source, R.id.rlBack, "method 'back'");
    view7f080608 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.back();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    SeekActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.awvSeek = null;
    target.seekHistoryView = null;
    target.tv_seek = null;
    target.editText = null;
    target.nsv = null;
    target.result_recyclerView = null;
    target.tvSeekHotTitle = null;
    target.ivSeekClearSeek = null;
    target.rvAssociate = null;
    target.linear_s = null;
    target.recyclerView = null;

    view7f080798.setOnClickListener(null);
    view7f080798 = null;
    view7f0801cc.setOnClickListener(null);
    view7f0801cc = null;
    view7f0801cb.setOnClickListener(null);
    view7f0801cb = null;
    view7f080608.setOnClickListener(null);
    view7f080608 = null;
  }
}
