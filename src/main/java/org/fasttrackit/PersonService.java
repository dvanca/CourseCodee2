package org.fasttrackit;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonService {
    private List<Person> list;

    public PersonService(List<Person> list) {
        this.list = list;
    }

    public List<String> allPersonsNames() {
        return list.stream()
                .map(Person -> Person.getFirstName() + " " + Person.getLastName())
                .toList();
    }

    public List<String> getMajorPersons(){
        return list.stream()
                .filter(Person -> Person.getAge() >= 18)
                .map(Person -> Person.getFirstName() + " " + Person.getLastName())
                .toList();
    }

    public List<String> getOradeaResidents(){
        return list.stream()
                .filter(Person -> Person.getCity().equals("Oradea"))
                .map(Person -> Person.getFirstName()+ " " + Person.getLastName())
                .toList();
    }

    public List<String> getOradeaAndClujResidents(){
        return list.stream()
                .filter(Person -> Person.getCity().equals("Oradea") || Person.getCity().equals("Cluj"))
                .map(Person -> Person.getFirstName()+ " " + Person.getLastName())
                .toList();

    }

    public List<String> allFirstNamesCapitalized(){
        return  list.stream()
                .map(Person -> Person.getFirstName().toUpperCase())
                .toList();
    }

    public List<String> allFirstNamesPlusLastNameInitial(){
        return list.stream()
                .map(Person -> Person.getFirstName() + " " + Person.getLastName().charAt(0)+".")
                .toList();
    }

    public List<String> ageBetweenEighteenAndSixty(){
        return list.stream()
                .filter(Person -> Person.getAge() >18 && Person.getAge() < 60)
                .map(Person -> Person.getFirstName())
                .toList();
    }

    public List<String> personsThatStartWithA(){
        return list.stream()
                .map(Person -> Person.getFirstName())
                .filter(firstName -> firstName.charAt(0) == 'A')
                .toList();
    }

    public Set<String> allPersonsUniquely(){
        return  list.stream()
                .map(Person -> Person.getFirstName())
                .collect(Collectors.toSet());

    }

    public List<String> sortPersonsByFirstName(){
        return list.stream()
                .map(Person -> Person.getFirstName())
                .sorted()
                .toList();
    }

    public List<String> sortPersonsByLastName(){
        return list.stream()
                .map(Person -> Person.getLastName())
                .sorted()
                .toList();
    }

    public List<String> sortPersonsByFirstLastAndAge(){
        return  list.stream()
                .map(Person -> Person.getFirstName() + " " + Person.getLastName()+" " + Person.getAge())
                .sorted()
                .toList();

    }

}
