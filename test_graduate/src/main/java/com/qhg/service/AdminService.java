package com.qhg.service;

import com.qhg.model.Admin;

/**
 * @Auther: admin
 * @Date: 2019/4/2 18:31
 * @Description:
 */
public interface AdminService {
    Admin selectAdmin(String name, String passworld);
    boolean yes(String name, String passworld);
}
