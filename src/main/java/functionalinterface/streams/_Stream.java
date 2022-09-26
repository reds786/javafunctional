package functionalinterface.streams;

import java.awt.image.DataBufferInt;
import java.util.List;
import java.util.stream.Collectors;

import functionalinterface.streams.Gender.*;

import static functionalinterface.streams.Gender.*;

enum Gender {
    MALE, FEMALE, PREFER_NOT_TO_SAY
}

public class _Stream {
    public static void main(String[] args) {
        new DMain().steamsExample();
    }

}

class DMain {
    List<Person> people = List.of(
            new Person("John", MALE),
            new Person("Maria", FEMALE),
            new Person("Aisha", FEMALE),
            new Person("Alex", MALE),
            new Person("Alice", FEMALE),
            new Person("Bob", PREFER_NOT_TO_SAY)
    );

    public void steamsExample() {

        people.stream()
                .map(person -> person.getGender())
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}

class Person {
    private final String name;
    private final Gender gender;

    Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}