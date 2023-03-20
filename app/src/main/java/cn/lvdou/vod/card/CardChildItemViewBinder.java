package cn.lvdou.vod.card;

import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.blankj.utilcode.util.ColorUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.request.RequestOptions;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Objects;

import cn.lvdou.vod.R;
import cn.lvdou.vod.base.BaseItemClickListener;
import cn.lvdou.vod.bean.UpdateEvent;
import cn.lvdou.vod.ui.home.Vod;
import cn.lvdou.vod.utils.AppColorUtils;
import cn.lvdou.vod.utils.MMkvUtils;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import kotlin.Pair;
import me.drakeet.multitype.ItemViewBinder;

@SuppressWarnings("unused,WeakerAccess")
public class CardChildItemViewBinder extends ItemViewBinder<Vod, CardChildItemViewBinder.ViewHolder> implements View.OnClickListener {

    private BaseItemClickListener baseItemClickListener;

    public CardChildItemViewBinder() {
        EventBus.getDefault().register(this);
    }

    public void onDestory() {
        EventBus.getDefault().unregister(this);
    }

    public void setBaseItemClickListener(BaseItemClickListener baseItemClickListener) {
        this.baseItemClickListener = baseItemClickListener;
    }

    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        int ui_home_data;
        String startBean = Objects.requireNonNull(MMkvUtils.Companion.Builds().loadStartBean("")).getUi_home_data();
        if (startBean !=null ) {
            if (startBean.equals("2")) {
                ui_home_data = R.layout.item_card_child2;
            } else {
                ui_home_data = R.layout.item_card_child;
            }
        }else{
            ui_home_data = R.layout.item_card_child;
        }

        return new ViewHolder(inflater.inflate(ui_home_data, parent, false));
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull Vod item) {
        holder.itemView.setTag(R.id.itemData, item);
        holder.itemView.setOnClickListener(this);

        holder.title.setText(item.getVodName());
        holder.blurb.setVisibility(View.GONE);
//        holder.blurb.setText(item.getVodBlurb());
//        if(StringUtils.isEmpty(item.getVod_custom_tag())){
//            holder.tip.setVisibility(View.GONE);
//        }else{
//            holder.tip.setVisibility(View.VISIBLE);
//            holder.tip.setText(item.getVod_custom_tag());
//            holder.tip.setBackgroundResource(AppColorUtils.getTagBgResId(item.getVod_custom_tag()));
//        }
        Pair<String, Integer> pair = AppColorUtils.getTagBgResId(holder.getAdapterPosition(), item.getVod_custom_tag());
        if (pair.component1().isEmpty()) {
            holder.tip.setVisibility(View.INVISIBLE);
        } else {
            holder.tip.setVisibility(View.VISIBLE);
            holder.tip.setText(pair.component1());
            holder.tip.setBackgroundResource(pair.component2());
        }

        if (item.getType().getTypeName().equals("电影")) {
           // holder.up_title.setTextColor(ColorUtils.getColor(R.color.colorPrimary)); old 配色
            holder.up_title.setTextColor(ColorUtils.getColor(R.color.white));
            TextPaint tp = holder.up_title.getPaint();
            tp.setFakeBoldText(true);
            holder.up_title.setText(item.getVod_score());
        } else {
            holder.up_title.setTextColor(ColorUtils.getColor(R.color.white));
            holder.up_title.setText(item.getVodRemarks());
            TextPaint tp = holder.up_title.getPaint();
            tp.setFakeBoldText(false);
        }

//        ViewGroup.LayoutParams lp = holder.icon.getLayoutParams();
//        int per_width = (DensityUtils.INSTANCE.getScreenWidth(getContext()) - DensityUtils.INSTANCE.dp2px(getContext(), 4)) / 3;
//        lp.height = (int) (per_width * 1.4f);
//        Glide.with(holder.itemView.getContext())
//                .load(item.getVodPic())
//                .thumbnail(0.1f)
//                .diskCacheStrategy(DiskCacheStrategy.ALL)
//                .into(holder.icon);

        String img = item.getVodPic();
        if (!TextUtils.isEmpty(img) && !isScroll) {

            MultiTransformation multiTransformation = new MultiTransformation(new CenterCrop(),
                    new RoundedCornersTransformation(20, 6, RoundedCornersTransformation.CornerType.ALL));
//已修改
            // 这里可以用Glide等网络图片加载库

            Glide.with(holder.itemView.getContext())
                    .load(img)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .thumbnail(1.0f)
                    .apply(RequestOptions.bitmapTransform(multiTransformation))
                    .dontAnimate()

                    .into(holder.icon);



        } else {
//            Glide.with(holder.itemView.getContext())
//                    .load(url)
//                    .thumbnail(0.1f)
//                    .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
////                    .transform(new GlideRoundTransform(0))
//                    .dontAnimate()
//                    .preload();

            holder.icon.setImageResource(R.drawable.shape_bg_white_icon);
        }
    }

    @Override
    public void onClick(View view) {
        Object o = view.getTag(R.id.itemData);
        if (o != null && baseItemClickListener != null) {
            baseItemClickListener.onClickItem(view, o);
        }
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private @NonNull
        AppCompatImageView icon;
        private @NonNull
        TextView tip;
        private @NonNull
        TextView up_title;
        private @NonNull
        TextView title;
        private @NonNull
        TextView blurb;

        ViewHolder(View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.item_iv_card_child_icon);
            tip = itemView.findViewById(R.id.item_tv_card_child_tip);
            up_title = itemView.findViewById(R.id.item_tv_card_child_up_title);
            title = itemView.findViewById(R.id.item_tv_card_child_title);
            blurb = itemView.findViewById(R.id.item_tv_card_child_vod_blurb);
        }
    }


    boolean isScroll;

    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void onEvent(UpdateEvent event) {
        isScroll = event.isScroll;
        System.out.println("==============" + isScroll);
    }

}
