package org.fasttrackit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class PersonService {
    private List<Person> persons;

    public PersonService(List<Person> persons) {
        this.persons = persons;
    }

    public List<String> listAllPersonNames() {
        List<String> result = new ArrayList<>();
        for (Person person : persons) {
            result.add(person.toString());
        }
        return result;
    }

    public List<Person> listAllMajorPersons() {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() >= 18) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> listPersonsFromOradea(){
        List<Person> result = new ArrayList<>();
        for(Person person : persons){
            if("Oradea".equals(person.getCity())){
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> listPersonsFromOradeaOrCluj(){
        List<Person> result = new ArrayList<>();
        for(Person person : persons){
            String city = person.getCity();
            if ("Oradea".equals(city) || "Cluj".equals(city)){
                result.add(person);
            }
        }
        return result;
    }

    public List<String> listFirstNamesCapitalized(){
        List<String> result = new ArrayList<>();
        for (Person person : persons){
            result.add(person.getFirstName().toUpperCase());
        }
        return result;
    }

    public List<String> listFirstNamesPlusInitials(){
        List<String> result = new ArrayList<>();
        for(Person person : persons){
            String lastNameInitial = person.getLastName().isEmpty() ? "" : " " + person.getLastName().charAt(0);
            result.add(person.getFirstName() + lastNameInitial);
        }
        return result;
    }

    public List<Person> listPersonsBetween18and60(){
        List<Person> result = new ArrayList<>();
        for (Person person : persons){
            if(person.getAge() > 18 && person.getAge() < 60){
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> listNamesStartingWithA(){
        List<Person> result = new ArrayList<>();
        for(Person person : persons){
            if (person.getFirstName().startsWith("A")) {
                result.add(person);
            }
        }
        return result;
    }

    public List<String> listFirstNamesUniquely(){
        List<String> uniqueFirstNames = new ArrayList<>();
        for(Person person : persons){
            String firstName = person.getFirstName();
            if(!uniqueFirstNames.contains(firstName)){
                uniqueFirstNames.add(firstName);
            }
        }
        return uniqueFirstNames;
    }

    public List<Person> sortPersonByFirstName(){
        List<Person> sortedPersons = new ArrayList<>(persons);
        sortedPersons.sort(Comparator.comparing(Person::getFirstName));
        return sortedPersons;
    }

    public List<Person> sortPersonByLastName(){
        List<Person> sortedPersons = new ArrayList<>(persons);
        sortedPersons.sort(Comparator.comparing(Person::getLastName));
        return sortedPersons;
    }

    public List<Person> sortPersonByFirstNameLastNameAge(){
        List<Person> sortedPersons = new ArrayList<>(persons);
        sortedPersons.sort(Comparator.comparing(Person::getFirstName)
                .thenComparing(Person::getLastName).thenComparingInt(Person::getAge));
        return sortedPersons;
    }
}
