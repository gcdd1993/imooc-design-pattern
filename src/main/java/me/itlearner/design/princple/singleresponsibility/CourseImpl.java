package me.itlearner.design.princple.singleresponsibility;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/7/27.
 */
public class CourseImpl implements ICourseContent, ICourseManager {
    @Override
    public String getCoursName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
