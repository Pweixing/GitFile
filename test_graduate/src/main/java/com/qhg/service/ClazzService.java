package com.qhg.service;

import com.qhg.model.Clazz;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/4/2 18:32
 * @Description:
 */
public interface ClazzService {
     void addClazz(Clazz clazz);
     void updateClazzSelective(Clazz clazz) ; //更新班级信息
     void delClazzOfId(String clazzId);
     List<Clazz> selectAllClazz();//查询所有班级信息
     Clazz selectClazz(String clazzId);
     boolean clazzName(String clazzName);
}
