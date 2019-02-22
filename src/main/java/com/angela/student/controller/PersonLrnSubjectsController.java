package com.angela.student.controller;


import com.angela.student.Service.PersonLrnSubjectService;
import com.angela.student.dao.PersonLrnSubjectRepository;
import com.angela.student.entity.PersonLrnSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PersonLrnSubjectsController {
    @Autowired
    PersonLrnSubjectRepository personLrnSubjectRepository;
    PersonLrnSubjectService personLrnSubjectService;

    @GetMapping(value = "/personLrnSubjects")
    private List<PersonLrnSubject> personLrnSubjects() {
        return personLrnSubjectRepository.findAll();
    }





    /**
     * enter score for 4 subjects
     * if person is not recorded yet
     * @param personId
     * @param scoreCalculus
     * @param scoreEnglish
     * @param scoreClanguage
     * @return
     */
    @PostMapping(value = "/personLrnSubjects/plsCreateAddFour")
    public PersonLrnSubject plsCreateAddFour(@RequestParam("personId") Integer personId,
                                       @RequestParam("scoreCalculus") Integer scoreCalculus,
                                       @RequestParam("scoreEnglish") Integer scoreEnglish,
                                       @RequestParam("scoreClanguage") Integer scoreClanguage
                                       ){
        PersonLrnSubject pls = new PersonLrnSubject();
        pls.setPersonId(personId);
        pls.setScoreCalculus(scoreCalculus);
        pls.setScoreEnglish(scoreEnglish);
        pls.setScoreClanguage(scoreClanguage);
        return personLrnSubjectRepository.save(pls);
    }

    /**
     * enter score for calculus
     * if person is not recorded yet
     * @param personId
     * @param scoreCalculus
     * @return
     */
    @PostMapping(value = "/personLrnSubjects/plsCreateAddCal")
    public PersonLrnSubject plsCreateAddCal(@RequestParam("personId") Integer personId,
                                       @RequestParam("scoreCalculus") Integer scoreCalculus
    ){
        PersonLrnSubject pls = new PersonLrnSubject();
        pls.setPersonId(personId);
        pls.setScoreCalculus(scoreCalculus);
        return personLrnSubjectRepository.save(pls);
    }

    /**
     * enter score for English
     * if person is not recorded yet
     * @param personId
     * @param scoreEnglish
     * @return
     */
    @PostMapping(value = "/personLrnSubjects/plsCreateAddEnglish")
    public PersonLrnSubject plsCreateAddEnglish(@RequestParam("personId") Integer personId,
                                             @RequestParam("scoreEnglish") Integer scoreEnglish
    ){
        PersonLrnSubject pls = new PersonLrnSubject();
        pls.setPersonId(personId);
        pls.setScoreEnglish(scoreEnglish);
        return personLrnSubjectRepository.save(pls);
    }

    /**
     * enter score for C Language
     * if person is not recorded yet
     * @param personId
     * @param scoreClanguage
     * @return
     */
    @PostMapping(value = "/personLrnSubjects/plsCreateAddFour")
    public PersonLrnSubject plsCreateAddFour(@RequestParam("personId") Integer personId,
                                             @RequestParam("scoreClanguage") Integer scoreClanguage
    ){
        PersonLrnSubject pls = new PersonLrnSubject();
        pls.setPersonId(personId);
        pls.setScoreClanguage(scoreClanguage);
        return personLrnSubjectRepository.save(pls);
    }









    /**
     * find perosnLrnSubject records by personId
     * @param personId
     * @return perosnLrnSubject records
     */
    @GetMapping(value = "personLrnSubjects/{personId}")
    public List<PersonLrnSubject> PersonLrnSubjectFindByPersonId(@PathVariable("personId") Integer personId) {
        return (List<PersonLrnSubject>) personLrnSubjectRepository.findByPersonId(personId);
    }

    /**
     * find perosnLrnSubject records by scoreCalculus
     * @param scoreCalculus
     * @return  perosnLrnSubject records
     */
    @GetMapping(value = "personLrnSubjects/{scoreCalculus}")
    public List<PersonLrnSubject> PersonLrnSubjectFindByCalculusScore(@PathVariable("scoreCalculus") Integer scoreCalculus){
        return (List<PersonLrnSubject>) personLrnSubjectRepository.findByScoreCalculus(scoreCalculus);
    }

    /**
     * find  perosnLrnSubject records by scoreEnglish
     * @param scoreEnglish
     * @return
     */
    @GetMapping(value = "personLrnSubjects/{scoreEnglish}")
    public List<PersonLrnSubject> PersonLrnSubjectFindByEnglishScore(@PathVariable("scoreEnglish") Integer scoreEnglish) {
        return (List<PersonLrnSubject>) personLrnSubjectRepository.findByScoreEnglish(scoreEnglish);
    }

    /**
     * find  perosnLrnSubject records by scoreClanguage
     * @param scoreClanguage
     * @return
     */
    @GetMapping(value = "personLrnSubjects/{scoreCLanguage}")
    public List<PersonLrnSubject> PersonLrnSubjectsFindByClanguage(@PathVariable("scoreClanguage") Integer scoreClanguage) {
        return (List<PersonLrnSubject>) personLrnSubjectRepository.findByScoreClanguage(scoreClanguage);
    }

    @PutMapping(value = "/personLrnSubjects/{personId}")
    public PersonLrnSubject plsUpdateFourScore(@PathVariable("personId") Integer personId,
                                               @RequestParam("scoreCalculus") Integer scoreCalculus,
                                               @RequestParam("scoreEnglish") Integer scoreEnglish,
                                               @RequestParam("scoreClanguage") Integer scoreClanguage){
        PersonLrnSubject pls = new PersonLrnSubject();

        pls.setScoreCalculus(scoreCalculus);
        pls.setScoreEnglish(scoreEnglish);
        pls.setScoreClanguage(scoreClanguage);
        return personLrnSubjectRepository.save(pls);
    }








    @PostMapping("/personLrnSubjects/four")
    public void inserOnePersonLrnSubjects() {personLrnSubjectService.insertOnePersonLrnSubjects();}

}
