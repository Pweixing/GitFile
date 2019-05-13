package com.qhg.service;

import com.qhg.dao.ClazzMapper;
import com.qhg.model.Clazz;
import com.qhg.model.ClazzExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/3/31 18:00
 * @Description: 班级
 */
@Service
@Transactional //开启事务
public class ClazzServiceImpl implements ClazzService {
    /*
    * 新建班级
    * */
    @Autowired
    ClazzMapper clazzMapper;
    public void addClazz(Clazz clazz){
        clazzMapper.insert(clazz);
    }
    public List<Clazz> selectAllClazz(){//查询所有班级信息
       return clazzMapper.selectAllClazz();
    }

    @Override
    public Clazz selectClazz(String clazzId) {
        return clazzMapper.selectByPrimaryKey(clazzId);
    }

    @Override
    public boolean clazzName(String clazzName) {
        ClazzExample clazzExample=new ClazzExample();
        ClazzExample.Criteria criteria = clazzExample.createCriteria();
        criteria.andClazzNameEqualTo(clazzName);
        List<Clazz> clazzes = clazzMapper.selectByExample(clazzExample);
        int x=clazzes.size();
        return 0==x;
    }


    public void updateClazzSelective(Clazz clazz) { //更新班级信息
//        updateByPrimaryKeySelective  updateByPrimaryKey
//        前者只是更新新的model中不为空的字段。后者则会将为空的字段在数据库中置为NULL。
        clazzMapper.updateByPrimaryKeySelective(clazz);
    }
    public void delClazzOfId(String clazzId){

        clazzMapper.deleteByPrimaryKey(clazzId);
    }
}
