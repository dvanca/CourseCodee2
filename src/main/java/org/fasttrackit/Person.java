package org.fasttrackit;

import lombok.*;

@Getter
@EqualsAndHashCode
public class Person {
    private Integer id;
    private String name;
    private int age;

    public Person(String name, int age) {
        if(name==null || age <0){
            throw new RuntimeException();
        }
        this.name = name;
        this.age = age;
    }

    void doSomething(){

    }

    public Person(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}