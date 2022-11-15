import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService(List.of(
                new Person("Mark","Doe",24, "Cluj"),
                new Person("Anna", "Popescu", 33, "Oradea"),
                new Person("Mihaela", "Enescu", 43, "Oradea"),
                new Person("Maria", "Pop", 17, "Cluj"),
                new Person("Anton", "Avramescu", 53, "Oradea"),
                new Person("Endel", "Coltescu", 16, "Alba Iulia"),
                new Person("Anna", "Coltescu", 26, "Alba Iulia")
        ));


        System.out.println(personService.allPersonsNames());
        System.out.println(personService.getMajorPersons());
        System.out.println(personService.getOradeaResidents());
        System.out.println(personService.getOradeaAndClujResidents());
        System.out.println(personService.allFirstNamesCapitalized());
        System.out.println(personService.allFirstNamesPlusLastNameInitial());
        System.out.println(personService.ageBetweenEighteenAndSixty());
        System.out.println(personService.personsThatStartWithA());
        System.out.println(personService.allPersonsUniquely());
        System.out.println(personService.sortPersonsByFirstName());
        System.out.println(personService.sortPersonsByLastName());
        System.out.println(personService.sortPersonsByFirstLastAndAge());
    }

}
