package com.angela.student.Service;


import com.angela.student.dao.PersonLrnSubjectRepository;
import com.angela.student.entity.PersonLrnSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PersonLrnSubjectService {
    @Autowired
    private PersonLrnSubjectRepository personLrnSubjectRepository;

    @Transactional
    public void insertOnePersonLrnSubjects(){
        PersonLrnSubject pls = new PersonLrnSubject();
        pls.setPersonId(99);
        pls.setScoreCalculus(77);
        pls.setScoreEnglish(92);
        pls.setScoreClanguage(90);
        personLrnSubjectRepository.save(pls);
    }


}
