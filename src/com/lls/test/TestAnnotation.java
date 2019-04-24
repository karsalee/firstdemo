package com.lls.test;

import com.lls.bean.MyCollection;
import com.lls.bean.User2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("applicationContext_annotation.xml");

    @Test
    public void Test1(){

        User2 user2 = (User2) applicationContext.getBean("user");
        System.out.println(user2);
    }
}
