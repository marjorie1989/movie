package cn.lvdou.vod.utils;

import android.content.Context;
import android.content.Intent;

import org.jetbrains.annotations.NotNull;

import cn.lvdou.vod.BuildConfig;
import cn.lvdou.vod.download.SPUtils;
import cn.lvdou.vod.ui.pay.PayActivity;
import cn.lvdou.vod.ui.widget.HitDialog;

public class LoginUtils {


    private boolean checkDebug(Context context) {
        return (BuildConfig.DEBUG);
    }


    public static  boolean checkLogin(Context context) {
//        if(checkDebug(context)){
//            return true;
//
//        }
        return true;
       /* if (UserUtils.isLogin()) {

            return true;

        } else {

            ActivityUtils.startActivity(LoginActivity.class);
            return false;
        }
*/

    }
    public static  boolean checkLogin2(Context context) {
//        if(checkDebug(context)){
//            return true;
//
//        }

       if (UserUtils.isLogin()) {

            return true;

        } else {

            return false;
        }


    }
    /**
     * 检查是不是vip
     *
     * @param context
     * @return
     */
    public static boolean checkVIP(Context context,String msg) {
        if (SPUtils.getBoolean(context, "isVip")) {
            return true;
        } else {
            new HitDialog(context).setTitle("提示").setMessage(msg).setOnHitDialogClickListener(new HitDialog.OnHitDialogClickListener() {
                @Override
                public void onCancelClick(@NotNull HitDialog dialog) {
                    super.onCancelClick(dialog);
                }

                @Override
                public void onOkClick(@NotNull HitDialog dialog) {
                    super.onOkClick(dialog);
                    context.startActivity(new Intent(context, PayActivity.class));
                }
            }).show();
            return false;
        }
    }
}
