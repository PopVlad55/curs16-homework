import org.fasttrackit.Person;
import org.fasttrackit.PersonService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Mihai", "Popescu", 45, "Cluj"));
        personList.add(new Person("Stefan", "Bogdan", 20, "Oradea"));
        personList.add(new Person("Ana", "Popescu", 30, "Cluj"));
        personList.add(new Person("Mihai", "Ion", 16, "Sibiu"));
        personList.add(new Person("Andrei", "Stefan", 18, "Cluj"));

        PersonService personService = new PersonService(personList);

        System.out.println("Person names: " + personService.listAllPersonNames());
        System.out.println("Major persons: " + personService.listAllMajorPersons());
        System.out.println("Persons from Oradea: " + personService.listPersonsFromOradea());
        System.out.println("Persons from Oradea or Cluj: " + personService.listPersonsFromOradeaOrCluj());
        System.out.println("Names capitalized: " + personService.listFirstNamesCapitalized());
        System.out.println("Names and initials: " + personService.listFirstNamesPlusInitials());
        System.out.println("Persons between 18 and 60" + personService.listPersonsBetween18and60());
        System.out.println("Names starting with A" + personService.listNamesStartingWithA());
        System.out.println("Unique first names: " + personService.listFirstNamesUniquely());
        System.out.println("Sorted by first name: " + personService.sortPersonByFirstName());
        System.out.println("Sorted by last name: " + personService.sortPersonByLastName());
        System.out.println("Sorted by first name, last name and age: " + personService.sortPersonByFirstNameLastNameAge());
    }
}
