// Generated code from Butter Knife. Do not modify!
package cn.lvdou.vod.ui.specialtopic;

import android.view.View;
import android.widget.ListView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import cn.lvdou.vod.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SpecialtTopicFragment_ViewBinding implements Unbinder {
  private SpecialtTopicFragment target;

  @UiThread
  public SpecialtTopicFragment_ViewBinding(SpecialtTopicFragment target, View source) {
    this.target = target;

    target.topicListView = Utils.findRequiredViewAsType(source, R.id.topic_listview, "field 'topicListView'", ListView.class);
    target.refreshLayout = Utils.findRequiredViewAsType(source, R.id.refreshLayout, "field 'refreshLayout'", SmartRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SpecialtTopicFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.topicListView = null;
    target.refreshLayout = null;
  }
}
