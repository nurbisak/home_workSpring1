package org.example.entity;

import org.example.dao.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")

public class Person {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    private Animal animal;

    private Chicken chicken;

    public Person() {
    }
@Autowired
    public Person(@Qualifier("parrot") Animal animal,@Qualifier("chicken") Chicken chicken) {
        this.animal = animal;
        this.chicken = chicken;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public void callYourDearAnimal(){
        animal.animalPlus();
        chicken.animalPlus();


    }

}
