package org.example.entity;

import org.example.dao.Animal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component


public class Chicken implements Animal {
    @Value("${chicken.name}")
    private String name;
    @Value("${chicken.foodName}")
    private String foodName;

    public Chicken() {
    }

    public Chicken(String name, String foodName) {
        this.name = name;
        this.foodName = foodName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "name='" + name + '\'' +
                ", foodName='" + foodName + '\'' +
                '}';
    }

    @Override
    public void animalPlus() {
        System.out.println("chicken meat is a ahhhh aaahhhhh");
        System.out.println(getName());
        System.out.println(getFoodName());
    }

    @Override
    public void animalMinus() {

    }
}
