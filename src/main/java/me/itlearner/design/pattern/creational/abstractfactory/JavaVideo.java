package me.itlearner.design.pattern.creational.abstractfactory;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/8/3.
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程");
    }
}
