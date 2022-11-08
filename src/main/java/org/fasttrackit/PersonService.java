package org.fasttrackit;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@NoArgsConstructor
@EqualsAndHashCode
public class PersonService {
    @Getter

    private final List<Person> persons = new ArrayList<>();

    public Person addPerson(Person person){

        Person personWithId = new Person(getNewId(), person.getName(), person.getAge());
        getPersons().add(personWithId);
        return personWithId;

    }


    Integer getNewId(){
        Random random = new Random();
        while(true){
            int randomId = random.nextInt(1000);
            if(!alreadyExists(randomId)){
                return randomId;
            }
        }

    }

    public boolean alreadyExists(int personId){
        for(Person person : getPersons()){
            if(person.getId()==personId){
                return true;
            }
        }

        return false;
    }
}
