package me.itlearner.design.princple.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/7/27.
 */
public class TeamLeader {

    public void checkNumberOfCourse(List<Course> courseList) {
        System.out.println("在线课程的数量是 ：" + courseList.size());
    }
}
