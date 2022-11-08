package org.fasttrackit;

import lombok.Data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void testDoSomething(){
        Person person = new Person("John",10);
        person.doSomething();
    }

    @Test
    @DisplayName("WHEN null name is given THEN constructor throws an error")

    public void testCreatePersonWithNullName(){
        org.assertj.core.api.Assertions.assertThatThrownBy(() ->{
            new Person(null,10);
        }).isInstanceOf(RuntimeException.class);
    }


}