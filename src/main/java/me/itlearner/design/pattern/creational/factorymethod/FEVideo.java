package me.itlearner.design.pattern.creational.factorymethod;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/7/28.
 */
public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制前端课程");
    }
}
