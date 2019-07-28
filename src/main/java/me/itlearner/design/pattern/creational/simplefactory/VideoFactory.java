package me.itlearner.design.pattern.creational.simplefactory;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/7/28.
 */
public class VideoFactory {

    public Video getVideo(Class<? extends Video> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
//    public Video getVideo(String type) {
//        if ("Java".equals(type)) {
//            return new JavaVideo();
//        } else if ("Python".equals(type)) {
//            return new PythonVideo();
//        } else {
//            return null;
//        }
//    }
}
