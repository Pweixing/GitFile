package com.qhg.service;

import com.qhg.dao.TutorMapper;
import com.qhg.model.Tutor;
import com.qhg.model.TutorExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/4/2 20:03
 * @Description:
 */
@Service
@Transactional
public class TutorServiceImpl implements TutorService {
    @Autowired
    TutorMapper tutorMapper;

    @Override
    public void insert(Tutor tutor) {
        tutorMapper.insert(tutor);

    }

    @Override
    public List<Tutor> selectAllTutor() {
        return tutorMapper.selectAllTutor();
    }

    @Override
    public void delTutor(String tutorId) {
        tutorMapper.deleteByPrimaryKey(tutorId);
    }

    @Override
    public Tutor selectTutor(String tutorName) {
        TutorExample tutorExample = new TutorExample();
        TutorExample.Criteria criteria = tutorExample.createCriteria();
        criteria.andTutorNameEqualTo(tutorName);
        List<Tutor> tutors = tutorMapper.selectByExample(tutorExample);
        return tutors.get(0);
    }

    @Override
    public boolean yes(String name, String passworld) {
        TutorExample tutorExample = new TutorExample();
        TutorExample.Criteria criteria = tutorExample.createCriteria();
        criteria.andTutorNameEqualTo(name).andTutorPasswordEqualTo(passworld);
        List<Tutor> tutors = tutorMapper.selectByExample(tutorExample);

        return tutors.size() == 1;
    }

    @Override
    public Tutor selectTutor(String tutorName, String passworld) {
        TutorExample tutorExample = new TutorExample();
        TutorExample.Criteria criteria = tutorExample.createCriteria();
        criteria.andTutorNameEqualTo(tutorName).andTutorPasswordEqualTo(passworld);
        List<Tutor> tutors = tutorMapper.selectByExample(tutorExample);
        return tutors.get(0);
    }

    @Override
    public boolean existName(String tutorName) {
        boolean b = true;
        List<String> list = new ArrayList();
        List<Tutor> tutors = tutorMapper.selectAllTutor();
        for (Tutor tutor : tutors
                ) {
            list.add(tutor.getTutorName());
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(tutorName)) {
                b = false;
                break;
            }
        }
        return b;
    }

    @Override
    public void update(Tutor tutor) {
        tutorMapper.updateByPrimaryKeySelective(tutor);
    }

    @Override
    public Tutor select(String tutorId) {
        return tutorMapper.selectByPrimaryKey(tutorId);

    }
}
