package com.angela.student.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonLrnSubject {
    @Id
    private Integer personId;
    private Integer scoreCalculus;
    private Integer scoreEnglish;
    private Integer scoreClanguage;

    public PersonLrnSubject() {
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getScoreCalculus() {
        return scoreCalculus;
    }

    public void setScoreCalculus(Integer scoreCalculus) {
        this.scoreCalculus = scoreCalculus;
    }

    public Integer getScoreEnglish() {
        return scoreEnglish;
    }

    public void setScoreEnglish(Integer scoreEnglish) {
        this.scoreEnglish = scoreEnglish;
    }

    public Integer getScoreClanguage() {
        return scoreClanguage;
    }

    public void setScoreClanguage(Integer scoreClanguage) {
        this.scoreClanguage = scoreClanguage;
    }
}
