package com.angela.student.Service;




import com.angela.student.dao.ScoreRepository;
import com.angela.student.entity.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;


    @Transactional
    public void insertTwo(){
        Score score1 = new Score();
        score1.setPersonid(21);
        score1.setSubjectid(2);
        score1.setMark(90);
        scoreRepository.save(score1);

        Score score2 = new Score();
        score2.setPersonid(90);
        score2.setSubjectid(2);
        score2.setMark(99);
    }

}
