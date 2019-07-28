package me.itlearner.design.princple.dependencyinversion;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/7/27.
 */
public class Test {

    // v1
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyFECourse();
//        geely.studyJavaCourse();
//    }

    // v2
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyImoocCourse(new JavaCourse());
//        geely.studyImoocCourse(new PythonCourse());
//    }

    public static void main(String[] args) {
        Geely geely = new Geely(new JavaCourse());
        geely.studyImoocCourse();

        geely.setCourse(new FECourse());
        geely.studyImoocCourse();
    }
}
