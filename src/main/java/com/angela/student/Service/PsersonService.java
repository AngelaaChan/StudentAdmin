package com.angela.student.Service;


import com.angela.student.dao.PersonRepository;
import com.angela.student.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PsersonService {
    @Autowired
    private PersonRepository personRepository;


    @Transactional
    public void insertTwo() {
        Person personA = new Person();
        personA.setId(67);
        personA.setName("balala");
        personA.setAge(90);
        personRepository.save(personA);



        Person personB = new Person();
        personB.setId(68);
        personB.setName("hhh");
        personB.setAge(25);
        personRepository.save(personB);

    }
}
