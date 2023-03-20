package cn.lvdou.vod.ui.home;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.youxiao.ssp.ad.bean.SSPContentItem;
import com.youxiao.ssp.ad.listener.IContentPageListener;
import com.youxiao.ssp.ad.listener.IContentVideoListener;
import com.youxiao.ssp.core.SSPSdk;

import cn.lvdou.vod.R;
import cn.lvdou.vod.base.BaseMainFragment;

public class Wqddg_Gao extends BaseMainFragment {

    public static Wqddg_Gao newInstance() {
        Bundle args = new Bundle();
        Wqddg_Gao fragment = new Wqddg_Gao();
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    protected int getLayoutResID() {
        return R.layout.framage_wqddg_gao;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        //方式一： 打开默认短视频页面（ 接入简单， 只需要提供入口， 快速接入）
//        SSPSdk.openContentPage();
////方式二： Fragment方式接入（ 自定义页面样式， 根据自己实际业务需求添加监听， 具体参照Demo）
////获取短视频内容Fragment页面
//        Fragment contentFragment = SSPSdk.getContent();
////加载短视频内容页面
//        getFragmentManager().beginTransaction().replace(R.id.content_layout,
//                contentFragment).commitAllowingStateLoss();
////增加内容页面监听器
//        SSPSdk.setContentPageListener(new IContentPageListener()
//        {
//            @Override
//            public void onPageEnter(SSPContentItem sspContentItem) {
////页面进入
//            }
//            @Override
//            public void onPageResume(SSPContentItem sspContentItem) {
////页面恢复可见
//            } @
//                Override
//        public void onPagePause(SSPContentItem sspContentItem) {
////页面不可见
//        } @
//                Override
//        public void onPageLeave(SSPContentItem sspContentItem) {
////页面离开
//        }
//        });
//        SSPSdk.setContentVideoListener(new IContentVideoListener() {
//            @Override
//            public void onVideoPlayStart(SSPContentItem sspContentItem) {
//
//            }
//
//            @Override
//            public void onVideoPlayPaused(SSPContentItem sspContentItem) {
//
//            }
//
//            @Override
//            public void onVideoPlayResume(SSPContentItem sspContentItem) {
//
//            }
//
//            @Override
//            public void onVideoPlayCompleted(SSPContentItem sspContentItem) {
//
//            }
//
//            @Override
//            public void onVideoPlayError(SSPContentItem sspContentItem, int i, int i1) {
//
//            }
//        });
//        SSPSdk.setReqPermission(true);
    }

    //    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.framage_wqddg_gao,container,false);
//    }
}
