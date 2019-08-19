package me.itlearner.design.pattern.creational.abstractfactory;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/8/3.
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java手记");
    }
}
