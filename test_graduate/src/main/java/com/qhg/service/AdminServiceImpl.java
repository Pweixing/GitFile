package com.qhg.service;

import com.qhg.dao.AdminMapper;
import com.qhg.model.Admin;
import com.qhg.model.AdminExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/3/16 21:04
 * @Description:
 */

@Transactional
@Service

public class AdminServiceImpl implements AdminService {
    @Autowired

    AdminMapper adminMapper;

    public Admin selectAdmin(String name, String passworld) {

        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andNameEqualTo(name).andPasswordEqualTo(passworld);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        return admins.get(0);
    }

    public boolean yes(String name, String passworld) {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andNameEqualTo(name).andPasswordEqualTo(passworld);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        int x = admins.size();
        return x == 1;

    }
}
