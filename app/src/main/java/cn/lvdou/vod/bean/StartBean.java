package cn.lvdou.vod.bean;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("unused")
public class StartBean implements Serializable {

    private static final long serialVersionUID = -2259983684774852421L;

    private Sign sign;
    private Vodmark vod_mark;
    private Comment comment;
    private Danmu danmu;
    private Document document;
    private Ads ads;
    private Player player;
    private List<Payment> payments;

    private List<String> search_hot;
    private String ui_home_data;
    private String share_url;
    private String share_logo;
    private String sg;
    private String app_ui_home_small_icons;
    private String app_login_type;
    public String getApp_ui_home_small_icons() {
        return app_ui_home_small_icons;
    }

    public void setApp_ui_home_small_icons(String app_ui_home_small_icons) {
        this.app_ui_home_small_icons = app_ui_home_small_icons;
    }

    public String getUi_home_data() {
        return ui_home_data;
    }

    public void setUi_home_data(String ui_home_data) {
        this.ui_home_data = ui_home_data;
    }

    public String getSg() {
        return sg;
    }

    public void setSg(String sg) {
        this.sg = sg;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public String getShare_logo() {
        return share_logo;
    }

    public void setShare_logo(String share_logo) {
        this.share_logo = share_logo;
    }

    public List<String> getSearch_hot() {
        return search_hot;
    }

    public void setSearch_hot(List<String> search_hot) {
        this.search_hot = search_hot;
    }

    public Sign getSign() {
        return sign;
    }

    public void setSign(Sign sign) {
        this.sign = sign;
    }

    public Vodmark getVod_mark() {
        return vod_mark;
    }

    public void setVod_mark(Vodmark vod_mark) {
        this.vod_mark = vod_mark;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Danmu getDanmu() {
        return danmu;
    }

    public String getApp_login_type() {
        return app_login_type;
    }

    public void setApp_login_type(String app_login_type) {
        this.app_login_type = app_login_type;
    }

    public void setDanmu(Danmu danmu) {
        this.danmu = danmu;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Ads getAds() {
        return ads;
    }

    public void setAds(Ads ads) {
        this.ads = ads;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public static class Payment implements Serializable {

        private static final long serialVersionUID = 7734695863148246513L;

        private String payment;
        private String name;
        private int status;

        public String getPayment() {
            return payment;
        }

        public void setPayment(String payment) {
            this.payment = payment;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }

    public static class Player implements Serializable {

        private static final long serialVersionUID = -5788614876100276279L;

        private String app_logo;

        public String getApp_logo() {
            return app_logo;
        }

        public void setApp_logo(String app_logo) {
            this.app_logo = app_logo;
        }
    }

    public static class Ads implements Serializable {

        private static final long serialVersionUID = -4076207452483830162L;
        private Ad user_center;
        private Ad searcher;
        private Ad player_pause;
        private Ad player_down;
        private Ad variety;
        private Ad cartoon;
        private Ad sitcom;
        private Ad vod;
        private Ad index;
        private Ad startup_adv;
        private Ad service_qq;
        private Ad service_qqqun;
        private Ad test;
        private Ad download;
        private Ad pictureinpicture;
        private Ad projection;
        private Ad define_account;

        //激励
        private Ad csj_video_adv;
        //开屏
        private Ad csj_startup_adv;
        private Ad csj_index3_adv;
        //奖励观影次数
        private Ad Number_of_awards;
        //插屏
        private Ad csj_video2_adv;
        //穿山甲_Banner
        private Ad csj_Banner_adv;

        //信息流

        private Ad csj_video8_adv;

        private Ad share_description;
        private Ad play_logo;

        public Ad getShare_description() {
            return share_description;
        }

        public void setShare_description(Ad share_description) {
            this.share_description = share_description;
        }

        public Ad getPlay_logo() {
            return play_logo;
        }

        public void setPlay_logo(Ad play_logo) {
            this.play_logo = play_logo;
        }

        public Ad getCsj_video8_adv() {
            return csj_video8_adv;
        }

        public Ad getCsj_index3_adv() {
            return csj_index3_adv;
        }

        public void setCsj_index3_adv(Ad csj_index3_adv) {
            this.csj_index3_adv = csj_index3_adv;
        }

        public void setCsj_video8_adv(Ad csj_video8_adv) {
            this.csj_video8_adv = csj_video8_adv;
        }

        public static long getSerialVersionUID() {
            return serialVersionUID;
        }

        public Ad getCsj_video_adv() {
            return csj_video_adv;
        }

        public void setCsj_video_adv(Ad csj_video_adv) {
            this.csj_video_adv = csj_video_adv;
        }

        public Ad getCsj_startup_adv() {
            return csj_startup_adv;
        }

        public void setCsj_startup_adv(Ad csj_startup_adv) {
            this.csj_startup_adv = csj_startup_adv;
        }

        public Ad getNumber_of_awards() {
            return Number_of_awards;
        }

        public void setNumber_of_awards(Ad number_of_awards) {
            Number_of_awards = number_of_awards;
        }

        public Ad getCsj_video2_adv() {
            return csj_video2_adv;
        }

        public void setCsj_video2_adv(Ad csj_video2_adv) {
            this.csj_video2_adv = csj_video2_adv;
        }

        public Ad getCsj_Banner_adv() {
            return csj_Banner_adv;
        }

        public void setCsj_Banner_adv(Ad csj_Banner_adv) {
            this.csj_Banner_adv = csj_Banner_adv;
        }

        public void setProjection(Ad projection) {
            this.projection = projection;
        }

        public Ad getProjection() {
            return projection;
        }

        public void setPictureinpicture(Ad pictureinpicture) {
            this.pictureinpicture = pictureinpicture;
        }

        public Ad getPictureinpicture() {
            return pictureinpicture;
        }

        public void setDownload(Ad download) {
            this.download = download;
        }

        public Ad getDownload() {
            return download;
        }

        public Ad getUser_center() {
            return user_center;
        }

        public void setUser_center(Ad user_center) {
            this.user_center = user_center;
        }

        public Ad getDefine_account() {
            return define_account;
        }

        public void setDefine_account(Ad define_account) {
            this.define_account = define_account;
        }

        public Ad getSearcher() {
            return searcher;
        }

        public void setSearcher(Ad searcher) {
            this.searcher = searcher;
        }

        public Ad getPlayer_pause() {
            return player_pause;
        }

        public void setPlayer_pause(Ad player_pause) {
            this.player_pause = player_pause;
        }

        public Ad getPlayer_down() {
            return player_down;
        }

        public void setPlayer_down(Ad player_down) {
            this.player_down = player_down;
        }

        public Ad getVariety() {
            return variety;
        }

        public void setVariety(Ad variety) {
            this.variety = variety;
        }

        public Ad getCartoon() {
            return cartoon;
        }

        public void setCartoon(Ad cartoon) {
            this.cartoon = cartoon;
        }

        public Ad getSitcom() {
            return sitcom;
        }

        public void setSitcom(Ad sitcom) {
            this.sitcom = sitcom;
        }

        public Ad getVod() {
            return vod;
        }

        public void setVod(Ad vod) {
            this.vod = vod;
        }

        public Ad getIndex() {
            return index;
        }

        public void setIndex(Ad index) {
            this.index = index;
        }

        public Ad getStartup_adv() {
            return startup_adv;
        }

        public void setStartup_adv(Ad startup_adv) {
            this.startup_adv = startup_adv;
        }

        public Ad getService_qq() {
            return service_qq;
        }

        public void setService_qq(Ad service_qq) {
            this.service_qq = service_qq;
        }

        public Ad getService_qqqun() {
            return service_qqqun;
        }

        public void setService_qqqun(Ad service_qqqun) {
            this.service_qqqun = service_qqqun;
        }

        public Ad getTest() {
            return test;
        }

        public void setTest(Ad test) {
            this.test = test;
        }

        public Ad getXtw_video2_adv() {
            return xtw_video2_adv;
        }
        private Ad xtw_video2_adv;
        public void setXtw_video2_adv(Ad xtw_video2_adv) {
            this.xtw_video2_adv = xtw_video2_adv;
        }
    }

    public static class Ad implements Serializable {

        private static final long serialVersionUID = 588907356034112780L;

        private int id;
        private String typename;
        private int status;
        private int sort;
        private String tag;
        private String description;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTypename() {
            return typename;
        }

        public void setTypename(String typename) {
            this.typename = typename;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }

    public static class Document implements Serializable {

        private static final long serialVersionUID = 8078081983086676725L;

        private Register un_register;
        private Register registerd;
        private Register notice;
        private Register roll_notice;

        public Register getUn_register() {
            return un_register;
        }

        public void setUn_register(Register un_register) {
            this.un_register = un_register;
        }

        public Register getRegisterd() {
            return registerd;
        }

        public void setRegisterd(Register registerd) {
            this.registerd = registerd;
        }

        public Register getNotice() {
            return notice;
        }

        public void setNotice(Register notice) {
            this.notice = notice;
        }

        public Register getRoll_notice() {
            return roll_notice;
        }

        public void setRoll_notice(Register roll_notice) {
            this.roll_notice = roll_notice;
        }
    }

    public static class Register implements Serializable {

        private static final long serialVersionUID = 8588651912763025366L;

        private String status;
        private String title;
        private String content;
        private String type;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class Danmu implements Serializable {

        private static final long serialVersionUID = 4470900707347861579L;
        private Boolean os;
        private String status;
        private Reward reward;

        public Boolean getOs() {
            return os;
        }

        public void setOs(Boolean os) {
            this.os = os;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Reward getReward() {
            return reward;
        }

        public void setReward(Reward reward) {
            this.reward = reward;
        }


    }

    public static class Comment implements Serializable {

        private static final long serialVersionUID = 4592326999981178806L;

        private String status;
        private Reward reward;
        private String reward_num;
        private String sg;

        public String getSg() {
            return sg;
        }

        public void setSg(String sg) {
            this.sg = sg;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Reward getReward() {
            return reward;
        }

        public void setReward(Reward reward) {
            this.reward = reward;
        }

        public String getReward_num() {
            return reward_num;
        }

        public void setReward_num(String reward_num) {
            this.reward_num = reward_num;
        }
    }

    public static class Vodmark implements Serializable {

        private static final long serialVersionUID = 8033475746385964499L;

        private String status;
        private Reward reward;
        private String reward_num;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Reward getReward() {
            return reward;
        }

        public void setReward(Reward reward) {
            this.reward = reward;
        }

        public String getReward_num() {
            return reward_num;
        }

        public void setReward_num(String reward_num) {
            this.reward_num = reward_num;
        }
    }

    public static class Sign implements Serializable {

        private static final long serialVersionUID = 6618705643876600439L;

        private String status;
        private Reward reward;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Reward getReward() {
            return reward;
        }

        public void setReward(Reward reward) {
            this.reward = reward;
        }
    }

    public static class Reward implements Serializable {

        private static final long serialVersionUID = -6154405135159596170L;

        private String points;

        public String getPoints() {
            return points;
        }

        public void setPoints(String points) {
            this.points = points;
        }
    }

}
