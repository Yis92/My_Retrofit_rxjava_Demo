package com.sunny.rx.entity;

/**
 * 启动页 - 返回
 * Created by sunny on 2016/5/6.
 */
public class StartResp extends CommonResponse<StartResp> {

    private String img;
    private String appkey;
    private String web_url;
    private String name;//底部 百度内容名称
    private String share_url;//分享链接
    private int isOpenRobot;//是否开启机器人 1开启  0不开启
    private String shareMess;
    private int isShareQQ;//是否使用qq分享
    private int isOnlyShareCircle;//是否之分享到朋友圈

    public int getIsShareQQ() {
        return isShareQQ;
    }

    public void setIsShareQQ(int isShareQQ) {
        this.isShareQQ = isShareQQ;
    }

    public int getIsOnlyShareCircle() {
        return isOnlyShareCircle;
    }

    public void setIsOnlyShareCircle(int isOnlyShareCircle) {
        this.isOnlyShareCircle = isOnlyShareCircle;
    }

    public String getShareMess() {
        return shareMess;
    }

    public void setShareMess(String shareMess) {
        this.shareMess = shareMess;
    }

    public int getIsOpenRobot() {
        return isOpenRobot;
    }

    public void setIsOpenRobot(int isOpenRobot) {
        this.isOpenRobot = isOpenRobot;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getWeb_url() {
        return web_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }


}
