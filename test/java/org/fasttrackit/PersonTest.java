package org.fasttrackit;


import jdk.swing.interop.SwingInterOpUtils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class PersonTest{

    @Test
    @DisplayName("Check if name is null")
    public void nullTest(){
        System.out.println("Check if name cand be null");
        // GIVEN

        Person person = new Person(null, "Doe", 13, "Bucuresti");

        // WHEN

        String result = person.getFirstName();

        //THEN

        Assertions.assertThat(result != null);
    }
}
