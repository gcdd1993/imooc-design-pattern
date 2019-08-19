package me.itlearner.design.pattern.creational.factorymethod;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/7/28.
 */
public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
