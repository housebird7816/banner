package cn.housebird.bannerlib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

/**
 * Created By qym
 * on 2019-12-16
 * at 13:46
 */
public class BannerVideoView extends VideoView {

    private Integer widthMeasureSpec;
    private Integer heightMeasureSpec;

    public BannerVideoView(Context context) {
        super(context);
    }

    public BannerVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BannerVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public BannerVideoView(Context context, int widthMeasureSpec, int heightMeasureSpec) {
        super(context);
        this.widthMeasureSpec = widthMeasureSpec;
        this.heightMeasureSpec = heightMeasureSpec;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        if (this.widthMeasureSpec == null || this.heightMeasureSpec == null) {
            this.widthMeasureSpec = widthMeasureSpec;
            this.heightMeasureSpec = heightMeasureSpec;
        }
        int width = getDefaultSize(getWidth(), this.widthMeasureSpec);
        int height = getDefaultSize(getHeight(), this.heightMeasureSpec);
        setMeasuredDimension(width, height);
    }
}
