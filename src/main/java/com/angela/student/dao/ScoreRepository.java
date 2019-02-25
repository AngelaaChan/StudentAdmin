package com.angela.student.dao;


import com.angela.student.entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScoreRepository extends JpaRepository<Score, Integer>{


    List<Score> findBySubjectid(Integer subject_id);

    List<Score> findByMark(Integer mark);

    List<Score> findByPersonid(Integer personid);
}
