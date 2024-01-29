package com.zergatstage.grdltst;

import java.util.UUID;

public class Person {
    private String name;
    private final UUID id;

    /**
     * Class describes a Person
     */
    public Person(){
        this.id = UUID.randomUUID();
    }

    /**
     * Creates a Person with defined name and generated based on this name UUID
     * @param name Person's name
     */
    public Person(String  name) {
        this.name =name;
        this.id = UUID.randomUUID();
    }
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}