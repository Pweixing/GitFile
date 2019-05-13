package com.qhg.service;

import com.qhg.model.Tutor;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/4/2 20:01
 * @Description:
 */

public interface TutorService {
    void insert(Tutor tutor); //添加导师信息
    List<Tutor> selectAllTutor();
    void delTutor(String tutorId);
    Tutor selectTutor(String tutorName);
    boolean yes(String tutorName, String password);
    Tutor selectTutor(String tutorName, String password);
    boolean existName(String tutorName);
    void update(Tutor tutor);
    Tutor select(String tutorId);
}
