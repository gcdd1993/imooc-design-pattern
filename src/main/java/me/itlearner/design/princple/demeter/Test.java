package me.itlearner.design.princple.demeter;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/7/27.
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.commandCheckNumber(new TeamLeader());
    }
}
