package me.itlearner.design.princple.dependencyinversion;

import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/7/27.
 */
@AllArgsConstructor
public class Geely {

    @Setter
    private ICourse course;

//    public void studyJavaCourse() {
//        System.out.println("Geely在学习Java课程");
//    }
//
//    public void studyFECourse() {
//        System.out.println("Geely在学习FE课程");
//    }
//
//    public void studyPythonCourse() {
//        System.out.println("Geely在学习Python课程");
//    }

//    public void studyImoocCourse(ICourse course) {
//        course.studyCourse();
//    }

    public void studyImoocCourse() {
        course.studyCourse();
    }

}
