package cn.housebird.bannerlib.bean;

import java.io.Serializable;

/**
 * Created By qym
 * on 2019-12-16
 * at 10:27
 */
public class MediaBean implements Serializable {
    public static final int MEDIA_TYPE_VIDEO = 1001;
    public static final int MEDIA_TYPE_IMAGE = 1002;

    private String url;
    private int type;

    private int videoPosition;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getType() {
        type = type != 0 ? type : MEDIA_TYPE_IMAGE;
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getVideoPosition() {
        return videoPosition;
    }

    public void setVideoPosition(int videoPosition) {
        this.videoPosition = videoPosition;
    }
}
