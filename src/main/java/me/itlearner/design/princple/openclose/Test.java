package me.itlearner.design.princple.openclose;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/7/27.
 */
public class Test {

    public static void main(String[] args) {
//        ICourse iCourse = new JavaCourse(96, "我的Java课程", 348d);
//        System.out.println("课程ID: " + iCourse.getId() + " 课程名称： " + iCourse.getName() + "课程价格： " + iCourse.getPrice());

        ICourse javaCourse = new JavaDiscountCourse(96, "我的Java课程", 348d);

        JavaDiscountCourse iCourse = (JavaDiscountCourse) javaCourse;
        System.out.println("课程ID: " + iCourse.getId() + " 课程名称： " + iCourse.getName() + "课程原价： " + iCourse.getOriginPrice() + " 课程折后价格： " + iCourse.getPrice());
    }
}
