package me.itlearner.design.pattern.creational.simplefactory;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/7/28.
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("Java");
        // 优化开闭原则
        Video video = videoFactory.getVideo(JavaVideo.class);
        video.produce();
//        Video video = new JavaVideo();
//        video.produce();
    }
}
