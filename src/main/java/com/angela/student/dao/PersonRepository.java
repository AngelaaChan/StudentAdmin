package com.angela.student.dao;

import com.angela.student.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {
    Person findByAge(Integer age);
}