package me.itlearner.design.princple.openclose;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/7/27.
 */
@ToString
@AllArgsConstructor
public class JavaCourse implements ICourse {

    @Getter
    private Integer id;

    @Getter
    private String name;

    @Getter
    private Double price;
}
