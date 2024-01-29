package com.zergatstage.grdltst;

import lombok.Getter;

import java.io.Serializable;
import java.util.Random;
import java.util.UUID;

@Getter
public class Person implements Serializable {
    private String name;
    private final UUID id;
    private transient int salary;
    private static final Random random = new Random();

    /**
     * Class describes a Person
     */
    public Person(){
        this.id = UUID.randomUUID();
        this.salary = random.nextInt(2000, 4440);
    }

    /**
     * Creates a Person with defined name and generated based on this name UUID
     * @param name Person's name
     */
    public Person(String  name) {
        this.name =name;
        this.id = UUID.randomUUID();
        this.salary = random.nextInt(2000, 4440);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
