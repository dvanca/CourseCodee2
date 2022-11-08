package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    @Test
    void addPerson() {
        //GIVEN
        PersonService personService = Mockito.mock(PersonService.class);
        Person person = new Person("John",20);
        Mockito.when(personService.addPerson(person)).thenCallRealMethod();
        Mockito.when(personService.getNewId()).thenReturn(23);



        //WHEN

        Person result = personService.addPerson(person);

        //THEN

        Assertions.assertThat(result.getName()).isEqualTo(person.getName());
        Assertions.assertThat(result.getId()).isEqualTo(23);
    }
    @Test
    void testGetNewId() {
        //GIVEN
        PersonService personService = Mockito.mock(PersonService.class);
        Mockito.when(personService.getNewId()).thenCallRealMethod();



        //WHEN

        personService.getNewId();

        //THEN
        ArgumentCaptor<Integer> randomIdCaptor = ArgumentCaptor.forClass(Integer.class);
        Mockito.verify(personService, Mockito.atLeastOnce()).alreadyExists(randomIdCaptor.capture());
        for(Integer i : randomIdCaptor.getAllValues()){
            Assertions.assertThat(i).isLessThan(1000);
        }

    }
}