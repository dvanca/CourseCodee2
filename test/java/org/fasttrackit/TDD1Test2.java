package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TDD1Test2 {
    @Test
    public void celsiusToFarenheit(){
        //GIVEN
        double a = 50;
        TDD1 tdd1 = new TDD1();

        //WHEN

        double result = tdd1.celsiusToFarenheit(50);

        //THEN
        Assertions.assertThat(result).isEqualTo(122);
    }
}
