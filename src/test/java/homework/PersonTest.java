package homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void testDoSomething(){
        Person p = new Person("John",10);
        p.doSomething();
    }



}