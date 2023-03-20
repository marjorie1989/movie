// Generated code from Butter Knife. Do not modify!
package cn.lvdou.vod.ui.specialtopic;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import cn.lvdou.vod.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TopicDetailActivity_ViewBinding implements Unbinder {
  private TopicDetailActivity target;

  private View view7f08006d;

  @UiThread
  public TopicDetailActivity_ViewBinding(TopicDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TopicDetailActivity_ViewBinding(final TopicDetailActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.back_item, "field 'backItem' and method 'onViewClicked'");
    target.backItem = Utils.castView(view, R.id.back_item, "field 'backItem'", LinearLayout.class);
    view7f08006d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    target.topicBanner = Utils.findRequiredViewAsType(source, R.id.iv_topic_banner, "field 'topicBanner'", ImageView.class);
    target.tvTopicName = Utils.findRequiredViewAsType(source, R.id.topic_name, "field 'tvTopicName'", TextView.class);
    target.tvTopicInfo = Utils.findRequiredViewAsType(source, R.id.topic_info, "field 'tvTopicInfo'", TextView.class);
    target.topicVideoListView = Utils.findRequiredViewAsType(source, R.id.topic_videolist_view, "field 'topicVideoListView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TopicDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.backItem = null;
    target.topicBanner = null;
    target.tvTopicName = null;
    target.tvTopicInfo = null;
    target.topicVideoListView = null;

    view7f08006d.setOnClickListener(null);
    view7f08006d = null;
  }
}
