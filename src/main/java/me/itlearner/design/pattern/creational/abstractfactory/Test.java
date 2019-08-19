package me.itlearner.design.pattern.creational.abstractfactory;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/8/3.
 */
public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();

        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();

        video.produce();
        article.produce();
    }
}
