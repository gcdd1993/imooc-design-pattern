package me.itlearner.design.princple.singleresponsibility;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/7/27.
 */
public class Bird {
    public void mainMoveMode(String birdName) {
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + " 用脚走");
        } else {
            System.out.println(birdName + " 用翅膀飞");
        }
    }
}
