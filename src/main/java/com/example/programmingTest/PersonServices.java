package com.example.programmingTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServices {
    private final PersonRepository personRepository;

    @Autowired
    public PersonServices(PersonRepository personRepo){
        this.personRepository = personRepo;
    }

    public List<Person> getPersons (){
        return personRepository.findAll();
    }

    public void saveNewPerson (Person person){
        personRepository.save(person);
    }
}
