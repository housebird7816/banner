package cn.housebird.bannerlib;

import androidx.viewpager.widget.ViewPager.PageTransformer;

import cn.housebird.bannerlib.transformer.AccordionTransformer;
import cn.housebird.bannerlib.transformer.BackgroundToForegroundTransformer;
import cn.housebird.bannerlib.transformer.CubeInTransformer;
import cn.housebird.bannerlib.transformer.CubeOutTransformer;
import cn.housebird.bannerlib.transformer.DefaultTransformer;
import cn.housebird.bannerlib.transformer.DepthPageTransformer;
import cn.housebird.bannerlib.transformer.FlipHorizontalTransformer;
import cn.housebird.bannerlib.transformer.FlipVerticalTransformer;
import cn.housebird.bannerlib.transformer.ForegroundToBackgroundTransformer;
import cn.housebird.bannerlib.transformer.RotateDownTransformer;
import cn.housebird.bannerlib.transformer.RotateUpTransformer;
import cn.housebird.bannerlib.transformer.ScaleInOutTransformer;
import cn.housebird.bannerlib.transformer.StackTransformer;
import cn.housebird.bannerlib.transformer.TabletTransformer;
import cn.housebird.bannerlib.transformer.ZoomInTransformer;
import cn.housebird.bannerlib.transformer.ZoomOutSlideTransformer;
import cn.housebird.bannerlib.transformer.ZoomOutTranformer;

public class Transformer {

    public static Class<? extends PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
