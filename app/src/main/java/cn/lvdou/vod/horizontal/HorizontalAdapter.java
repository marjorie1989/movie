package cn.lvdou.vod.horizontal;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import cn.lvdou.vod.R;
import cn.lvdou.vod.base.BaseRecyclerAdapter;
import cn.lvdou.vod.bean.VodBean;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

/**
 * @author : yjz
 * @date : 2020/10/29 17:50
 * @des :
 */
public class HorizontalAdapter extends BaseRecyclerAdapter<VodBean> {

    private Context context;
    public HorizontalAdapter(@NonNull Context context, List<VodBean> data) {
        super(context, R.layout.item_horizontal, data, true);
        this.context = context;
    }

    @Override
    public void convert(ViewHolder holder, VodBean item, int position) {

        AppCompatImageView imageView = (AppCompatImageView) holder.getView(R.id.item_iv_card_child_icon);
        String img = item.getVod_pic_thumb();

        MultiTransformation multiTransformation = new MultiTransformation(new CenterCrop(),
                new RoundedCornersTransformation(20, 0, RoundedCornersTransformation.CornerType.ALL));

        Glide.with(context)

                .load(img)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .thumbnail(1.0f)
                .apply(RequestOptions.bitmapTransform(multiTransformation))
                .into(imageView);

        holder.setText(R.id.item_tv_card_child_title, item.getVodName())
                .setText(R.id.item_tv_card_child_vod_blurb, item.getVodBlurb());
    }
}
