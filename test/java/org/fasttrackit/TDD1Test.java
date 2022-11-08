package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TDD1Test {

    @Test

    public void instantiateObject(){
        TDD1 tdd1 = new TDD1();
    }
    @Test
    public void callMethod(){
        TDD1 tdd1 = new TDD1();
        tdd1.celsiusToFarenheit(50);

    }

    @Test
    public void farenheitToCelsiusTest(){
        //GIVEN
        double a = 50;
        TDD1 tdd1 = new TDD1();

        //WHEN

        double result = tdd1.farenheitToCelsius(50);

        //THEN

        Assertions.assertThat(result).isEqualTo(10);
    }

    @Test
    public void farenheitToCelsiusNegativeNumber(){
        //GIVEN
        double a = -50;
        TDD1 tdd1 = new TDD1();

        //WHEN
        double result = tdd1.farenheitToCelsius(-50);

        //THEN

        Assertions.assertThat(result).isEqualTo(-45.55555555555556);
    }



}
