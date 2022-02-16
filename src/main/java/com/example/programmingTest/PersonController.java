package com.example.programmingTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/person")
public class PersonController {

    private final PersonServices personServices;

    @Autowired
    public PersonController(PersonServices personServices){
        this.personServices = personServices;
    }

    @PostMapping("/save")
    public void saveNewPerson(@RequestParam String name,String dob, String address, String postcode, String state){
        Person p= new Person(name,dob,address,postcode,state);
        personServices.saveNewPerson(p);
    }

    @GetMapping()
    public List<Person> getPersons(){
        return personServices.getPersons();
    }

}
