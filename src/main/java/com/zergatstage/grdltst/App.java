package com.zergatstage.grdltst;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Person> employees = new ArrayList<>();
        employees.add(new Person("Jackson"));
        employees.add(new Person("Josh"));
        //add a Person with empty name to add it using Reflection
        employees.add(new Person());

        //loop over list to fill empty names
        employees.stream().filter((e) -> (e.getName() == null || e.getName().isEmpty())).forEach(e -> {
            try {
                Field nameField = e.getClass()
                        .getDeclaredField("name");
                nameField.setAccessible(true);
                nameField.set(e, "Empty");
            } catch (NoSuchFieldException | IllegalAccessException ex){
                ex.printStackTrace();
                throw new RuntimeException("Bad user! Bad user! Bad user!...\n" );
            }
        });
        employees.forEach(person -> System.out.println(person.toString()));
        //serialization to the object


    }
}
