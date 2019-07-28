package me.itlearner.design.princple.openclose;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author gaochen
 * Created on 2019/7/27.
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return new BigDecimal(super.getPrice().toString()).multiply(new BigDecimal("0.8")).doubleValue();
    }
}
