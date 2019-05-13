package com.qhg;


import com.qhg.Interceptor.AdminInterceptor;
import com.qhg.Interceptor.StudentInterceptor;
import com.qhg.Interceptor.TutorInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.ArrayList;


/**
 * @Auther: admin
 * @Date: 2019/3/16 22:39
 * @Description: 配置   静态资源 js .css  拦截器
 */

@Configuration
public class StaticWebMvc extends WebMvcConfigurationSupport {
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    /** 
    * @Description: 缺陷：  以下拦截器没有拦截所有的地址。有些由于共享，并没有设置拦截。
    * @Param:  
    * @return: 
    * @Date: 2019/5/12 
    */  
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        //学生需要拦截的路径
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("/student/**");
        studentList.add("/problem/problemList");
        studentList.add("/problem/myProblem");
        studentList.add("/problem/stuMyReply");
        studentList.add("/task/stuTaskList");
        registry.addInterceptor(new StudentInterceptor()).addPathPatterns(studentList); //拦截
        //导师
        ArrayList<String> tutorList = new ArrayList<>();
        tutorList.add("/tutor/**");
        tutorList.add("/task/taskFile");
        tutorList.add("/task/taskList");
        tutorList.add("/project/projectList");
        tutorList.add("/problem/problemTutList ");
        tutorList.add("/problem/myTutProblem");
        tutorList.add("/problem/tutMyReply");
        registry.addInterceptor(new TutorInterceptor()).addPathPatterns(tutorList);
        //管理员
        ArrayList<String> adminList = new ArrayList<>();
        adminList.add("/clazz/**");
        adminList.add("/admin/**");
        registry.addInterceptor(new AdminInterceptor()).addPathPatterns(adminList);

    }
}
