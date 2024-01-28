package org.fasttrackit;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String city;

    @Override
    public String toString(){
        return firstName + " " + lastName;
    }
}
