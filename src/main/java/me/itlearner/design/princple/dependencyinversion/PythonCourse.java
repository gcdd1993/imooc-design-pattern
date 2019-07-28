package me.itlearner.design.princple.dependencyinversion;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/7/27.
 */
public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习Python课程");
    }
}
