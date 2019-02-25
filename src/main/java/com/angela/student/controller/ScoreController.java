package com.angela.student.controller;


import com.angela.student.Service.ScoreService;
import com.angela.student.dao.ScoreRepository;
import com.angela.student.entity.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScoreController {
    @Autowired
    ScoreRepository scoreRepository;
    ScoreService scoreService;


    /**
     * find all
     * @return all score in a list
     */
    @GetMapping(value="/score")
    private List<Score> scoreList() {
        return scoreRepository.findAll();
    }


    /**
     * create score with
     * knowing personid,subjectid, mark
     * @param personid
     * @param subjectid
     * @param mark
     * @return
     */
    @PostMapping(value="/score")
    public Score scoreAdd(@RequestParam("personid") Integer personid,
            @RequestParam("subjectid") Integer subjectid,
            @RequestParam("mark") Integer mark){
        Score score = new Score();
        score.setPersonid(personid);
        score.setSubjectid(subjectid);
        score.setMark(mark);
        return scoreRepository.save(score);
    }

    /**
     * find scores of a person
     * @param personid
     * @return List<Score>
     */
    @GetMapping(value="/score/{personid}")
    public List<Score> scoreFindByPersonid(@PathVariable("personid") Integer personid) {
        return scoreRepository.findByPersonid(personid);
    }

    /**
     * find scores of a subject
     * @param subjectid
     * @return List<Score>
     */
    @GetMapping(value = "/score/{subjectid}")
    public List<Score> scoreFindBySubjectid(@PathVariable("subjectid") Integer subjectid){
        return  scoreRepository.findBySubjectid(subjectid);
    }

    /**
     * find scores of a specific mark
     * @param mark
     * @return List<Score>
     */
    @GetMapping(value="/score/{mark}")
    public  List<Score> scoreFindByMark(@PathVariable("mark") Integer mark){
        return scoreRepository.findByMark(mark);
    }

    /**
     * try to find
     */

    /**
     * (condition: personid and subjectid exist already)
     * enter mark for an existing subjectid of an existing personid
     * @param personid
     * @param subjectid
     * @param mark
     * @return
     */
    @PutMapping(value = "/score/{personid}/{subjectid}")
    public Score scoreUpdate(@PathVariable("personid") Integer personid,
                             @PathVariable("subjectid") Integer subjectid,
                             @RequestParam("mark") Integer mark){
        Score score= new Score();
        score.setPersonid(personid);
        score.setSubjectid(subjectid);
        score.setMark(mark);
        return scoreRepository.save(score);
    }




    @PostMapping("/score/two")
    public void scoreTwo(){scoreService.insertTwo();}

}

