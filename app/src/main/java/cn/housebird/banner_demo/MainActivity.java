package cn.housebird.banner_demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import cn.housebird.bannerlib.Banner;
import cn.housebird.bannerlib.BannerConfig;
import cn.housebird.bannerlib.Transformer;
import cn.housebird.bannerlib.bean.MediaBean;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {

        List<MediaBean> images = new ArrayList<>();
//        MediaBean mediaBean = new MediaBean();
//        mediaBean.setType(MediaBean.MEDIA_TYPE_IMAGE);
//        mediaBean.setUrl("https://img01.sogoucdn.com/app/a/100520021/4437ca3796e39439ef9f66b543381834");
//        images.add(mediaBean);
//        MediaBean mediaBean1 = new MediaBean();
//        mediaBean1.setType(MediaBean.MEDIA_TYPE_IMAGE);
//        mediaBean1.setUrl("https://img02.sogoucdn.com/app/a/100520020/34f880c9667f135bac6f2c38a9d424a1");
//        images.add(mediaBean1);
        MediaBean mediaBean3 = new MediaBean();
        mediaBean3.setType(MediaBean.MEDIA_TYPE_VIDEO);
        mediaBean3.setUrl("http://vjs.zencdn.net/v/oceans.mp4");
        images.add(mediaBean3);
        MediaBean mediaBean4 = new MediaBean();
        mediaBean4.setType(MediaBean.MEDIA_TYPE_VIDEO);
        mediaBean4.setUrl("https://media.w3.org/2010/05/sintel/trailer.mp4");
        images.add(mediaBean4);
        MediaBean mediaBean2 = new MediaBean();
        mediaBean2.setType(MediaBean.MEDIA_TYPE_IMAGE);
        mediaBean2.setUrl("https://img02.sogoucdn.com/app/a/100520020/cfc66cf3d2ce6bc0141aa7f8284167e5");
        images.add(mediaBean2);


        List<String> titles = new ArrayList<>();
//        titles.add("图片1");
//        titles.add("图片2");

        titles.add("视频4");
        titles.add("视频5");
        titles.add("图片3");
        Banner banner = findViewById(R.id.banner);
        //设置banner样式
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(images);
        //设置banner动画效果
        banner.setBannerAnimation(Transformer.DepthPage);
        //设置标题集合（当banner样式有显示title时）
        banner.setBannerTitles(titles);
        //设置自动轮播，默认为true
        banner.isAutoPlay(true);
        //设置轮播时间
        banner.setDelayTime(1500 * 60);
        //设置指示器位置（当banner模式中有指示器时）
        banner.setIndicatorGravity(BannerConfig.CENTER);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
    }
}

