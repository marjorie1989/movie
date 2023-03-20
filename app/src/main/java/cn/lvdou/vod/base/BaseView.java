package cn.lvdou.vod.base;

public interface BaseView<T> {

    void initView();

    void setPresenter(T presenter);

}
