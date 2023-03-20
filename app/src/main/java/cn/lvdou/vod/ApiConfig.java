package cn.lvdou.vod;

public class ApiConfig {

    public static final String MOGAI_BASE_URL = App.BASE_URL;
    public static final String getStart = "/mc_api.php/v1.main/startup";
    public static final String getTypeList = "/mc_api.php/v1.vod/types";
    public static final String getBannerList = "/mc_api.php/v1.vod";

    public static final String getDanMuList = "/mc_api.php/v1.danmu/index";
    //专题
    public static final String getTopicList = "/mc_api.php/v1.topic/topicList";
    //专题详情
    public static final String getTopicDetail = "/mc_api.php/v1.topic/topicDetail";
    //游戏
    public static final String getGameList = "/mc_api.php/v1.youxi/index";
    //添加视频播放记录+1
    public static final String addPlayLog = "/mc_api.php/v1.user/addViewLog";
    //上报观影时长+1
    public static final String watchTimeLong = "/mc_api.php/v1.user/viewSeconds";
    //获取视频播放记录
    public static final String getPlayLogList = "/mc_api.php/v1.user/viewLog";
    //获取视频播放进度
    public static final String getVideoProgress = "/mc_api.php/v1.vod/videoProgress";
    //删除播放记录+1
    public static final String dleltePlayLogList = "/mc_api.php/v1.user/delVlog";
    //直播列表
    public static final String getLiveList = "/mc_api.php/v1.zhibo";
    //播放器开始播放广告
    public static final String getAdconfig = "/mc_api.php/v1.Vodad";
    //找回密码短信发送
    public static final String findpasssms = "/mc_api.php/v1.auth/findpasssms";
    //找回密码
    public static final String findpass = "/mc_api.php/v1.auth/findpass";

    public static final String getTopList = "/mc_api.php/v1.vod";
    public static final String getCardList = "/mc_api.php/v1.main/category";
    public static final String getRecommendList = "/mc_api.php/v1.vod/vodPhbAll";
    public static final String getCardListByType = "/mc_api.php/v1.vod/type";
    public static final String getVodList = "/mc_api.php/v1.vod";
    public static final String getVod = "/mc_api.php/v1.vod/detail";

    public static final String COMMENT = "/mc_api.php/v1.comment";

    public static final String USER_INFO = "/mc_api.php/v1.user/detail";
    public static final String LOGIN = "/mc_api.php/v1.auth/login"; //+1
    public static final String LOGOUT = "/mc_api.php/v1.auth/logout"; //+1
    public static final String REGISTER = "/mc_api.php/v1.auth/register"; //+1
    public static final String VERIFY_CODE = "/mc_api.php/v1.auth/registerSms";//发送注册验证码
    public static final String OPEN_REGISTER = "/mc_api.php/v1.user/phoneReg";
    public static final String SIGN = "/mc_api.php/v1.sign"; //+1
    public static final String GROUP_CHAT = "/mc_api.php/v1.groupchat";
    public static final String CARD_BUY = "/mc_api.php/v1.user/buy"; //+1
    public static final String UPGRADE_GROUP = "/mc_api.php/v1.user/group"; //+1
    public static final String SCORE_LIST = "/mc_api.php/v1.user/groups";
    public static final String CHANGE_AGENTS = "/mc_api.php/v1.user/changeAgents";//+1
    public static final String AGENTS_SCORE = "/mc_api.php/v1.user/agentsScore";
    public static final String POINT_PURCHASE = "/mc_api.php/v1.user/order";
    public static final String CHANGE_NICKNAME = "/mc_api.php/v1.user";//+1
    public static final String CHANGE_AVATOR = "/mc_api.php/v1.upload/user";//+1
    public static final String GOLD_WITHDRAW = "/mc_api.php/v1.user/goldWithdrawApply";
    public static final String PAY_TIP = "/mc_api.php/v1.user/payTip";
    public static final String GOLD_TIP = "/mc_api.php/v1.user/goldTip";
    public static final String FEEDBACK = "/mc_api.php/v1.gbook";
    public static final String COLLECTION_LIST = "/mc_api.php/v1.user/favs";
    public static final String COLLECTION = "/mc_api.php/v1.user/ulog"; //+1
    public static final String SHARE_SCORE = "/mc_api.php/v1.user/shareScore"; //+1
    public static final String TASK_LIST = "/mc_api.php/v1.user/task";
    public static final String MSG_LIST = "/mc_api.php/v1.message/index";
    public static final String MSG_DETAIL = "/mc_api.php/v1.message/detail";
    public static final String EXPAND_CENTER = "/mc_api.php/v1.user/userLevelConfig";
    public static final String MY_EXPAND = "/mc_api.php/v1.user/subUsers";
    public static final String SEND_DANMU = "/mc_api.php/v1.danmu";
    public static final String SCORE = "/mc_api.php/v1.vod/score"; //+1
    public static final String CHECK_VOD_TRYSEE = "/mc_api.php/v1.user/checkVodTrySee";
    public static final String BUY_VIDEO = "/mc_api.php/v1.user/buypopedom"; //+1
    public static final String CHECK_VERSION = "/mc_api.php/v1.main/version";
    public static final String PAY = "/mc_api.php/v1.user/pay";
    public static final String ORDER = "/mc_api.php/v1.user/order";
    public static final String APP_CONFIG = "/mc_api.php/v1.user/appConfig";
    public static final String SHARE_INFO = "/mc_api.php/v1.user/shareInfo";
    public static final String video_count = "/mc_api.php/v1.vod/videoViewRecode"; //+1
    public static final String tabFourInfo = "/mc_api.php/v1.youxi/index";
    public static final String tabThreeName = "/mc_api.php/v1.zhibo/thirdUiName";
    public static final String getRankList = "/mc_api.php/v1.vod/vodphb";

    public static void main() {

    }

}
