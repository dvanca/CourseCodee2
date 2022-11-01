package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonService {

    private final List<Person> persons = new ArrayList<>();

    Person addPerson(Person person) {
        Person personWithId=new Person(person.getId(), person.getName(), person.getAge());
        persons.add(personWithId);
        return personWithId;

    }

    int getNewId() {
        Random random = new Random();
        while (true) {
            int randomId = random.nextInt(Integer.MAX_VALUE);
            boolean alreadyExists = false;
            for (Person person : persons) {
                if (person.getId() == randomId) {
                    alreadyExists = true;
                    break;
                }
            }
            if(!alreadyExists){
                return randomId;
            }
        }
    }
}
