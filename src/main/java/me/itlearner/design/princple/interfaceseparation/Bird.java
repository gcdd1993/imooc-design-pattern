package me.itlearner.design.princple.interfaceseparation;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/7/27.
 */
public class Bird implements IEatAnimalAction,IFlyAnimalAction {
    @Override
    public void eat() {
        System.out.println("鸟 吃饭");
    }

    @Override
    public void fly() {
        System.out.println("鸟 飞");
    }
}
