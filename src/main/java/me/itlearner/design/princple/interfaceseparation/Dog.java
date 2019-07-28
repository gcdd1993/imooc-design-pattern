package me.itlearner.design.princple.interfaceseparation;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/7/27.
 */
public class Dog implements IEatAnimalAction,ISwimAnimalAction {
    @Override
    public void eat() {
        System.out.println("狗 吃饭");
    }

    @Override
    public void swim() {
        System.out.println("狗 游泳");
    }
}
