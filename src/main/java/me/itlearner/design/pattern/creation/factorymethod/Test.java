package me.itlearner.design.pattern.creation.factorymethod;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/7/28.
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory javaVideoFactory = new JavaVideoFactory();
        VideoFactory pythonVideoFactory = new PythonVideoFactory();
        VideoFactory feVideoFactory = new FEVideoFactory();
    }
}
