package me.itlearner.design.princple.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/7/27.
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader) {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        teamLeader.checkNumberOfCourse(courseList);
    }
}
