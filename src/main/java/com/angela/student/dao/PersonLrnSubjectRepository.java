package com.angela.student.dao;


import com.angela.student.entity.PersonLrnSubject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonLrnSubjectRepository extends JpaRepository<PersonLrnSubject,Integer>{
    PersonLrnSubject findByPersonId(Integer personId);

    PersonLrnSubject findByScoreCalculus(Integer scoreCalculus);

    PersonLrnSubject findByScoreEnglish(Integer scoreEnglish);

    PersonLrnSubject findByScoreClanguage(Integer scoreClanguage);
}
