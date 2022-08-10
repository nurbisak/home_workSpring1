package org.example.entity;

import org.example.dao.Animal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Parrot implements Animal{
    @Value("${parrot.name}")
    private String name;
    @Value("${parrot.colour}")
    private String colour;

    public Parrot() {
    }

    public Parrot(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void animalPlus() {
        System.out.println("Parrots has a nice voice");
        System.out.println(getName());
        System.out.println(getColour());

    }

    @Override
    public void animalMinus() {
        System.out.println("Always screaming");

    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
