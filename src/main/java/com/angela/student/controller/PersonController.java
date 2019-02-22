package com.angela.student.controller;

import com.angela.student.Service.PsersonService;
import com.angela.student.dao.PersonRepository;
import com.angela.student.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@RestController
public class PersonController {
    @Autowired
    PersonRepository personRepository;
    PsersonService personService;

    @GetMapping(value = "/person")
    private List<Person> personList() {

        return personRepository.findAll();
    }


/***********__________CRUD__________************/

    /**********    create    **********/
    @PostMapping(value = "/person")
    public Person personAdd(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return personRepository.save(person);
    }

    /**********    QUERY  by ID  **********/
    @GetMapping(value = "/person/{id}")
    public Optional<Person> personFindById(@PathVariable("id") Integer id) {
        return personRepository.findById(id);
    }

    /**********    QUERY  by age  **********/
    @GetMapping(value = "/person/{age}")
    public Person personFindByAge(@PathVariable("age") Integer age) {
        return personRepository.findByAge(age);
    }


    /***********__________UPDATE__________************/
    @PutMapping(value = "/person/{id}")
    public Person personUpdate(@PathVariable("id") Integer id,
                               @RequestParam("name") String name,
                               @RequestParam("age") Integer age) {
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setAge(age);
        return personRepository.save(person);
    }


    /***********__________TEST__________************/
    @PostMapping("/person/two")
    public void personTwo(){
        personService.insertTwo();
    }


}