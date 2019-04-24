package com.lls.test;

import com.lls.bean.Pet;
import com.lls.bean.User2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//使用juniti进行测试，帮我i们生成容器
@ContextConfiguration("classpath:applicationContext_injection.xml")//读取配置文件
public class TestJunit {
    @Autowired
    private Pet pet;
    @Test
    public void Test1(){
        System.out.println(pet);
    }
}
