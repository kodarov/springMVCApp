package ru.kodarovs.springmvc.dao;

import org.springframework.stereotype.Component;
import ru.kodarovs.springmvc.models.Person;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private static int COUNT = 1;
    private List<Person> people;
    {
        people = new ArrayList<>();
        people.add(new Person(COUNT++,"Tom"));
        people.add(new Person(COUNT++,"Bob"));
        people.add(new Person(COUNT++,"Serj"));
        people.add(new Person(COUNT++,"Mihael"));
    }
    public  List<Person> index(){
        return people;
    }
    public Person show(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
