package me.itlearner.design.pattern.creation.factorymethod;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/7/28.
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程");
    }
}
