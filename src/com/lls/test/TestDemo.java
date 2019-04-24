package com.lls.test;

import com.lls.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    //        ApplicationContext配置的所有bean都会在容器创建的时候创建
//        如果配置的bean过多,在创建容器的时候会导致内存过大的问题
    ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("applicationContext.xml");
//    Spring就是一个容器，帮助我们管理对象
    @Test
    public void Test1(){
//        ApplicationContext配置的所有bean都会在容器创建的时候创建
//        如果配置的bean过多,在创建容器的时候会导致内存过大的问题
//        通过getBeaen获取配置好的user对象（向Spring容器要对象）
//        Object user = applicationContext.getBean("user");
        User user = applicationContext.getBean(User.class);
        System.out.println(user);
    }

    @Test
    public void Test2(){
//        scope="singleton":单例的 只会创建一个对象 一般项目中使用该默认值
        User user1 = applicationContext.getBean(User.class);
        User user2 = applicationContext.getBean(User.class);
        //true
        System.out.println(user1 == user2);
    }

    @Test
    public void Test3(){
        //scope="prototype":多例的 在获取的时候会创建多个对象
        User user1 = applicationContext.getBean(User.class);
        User user2 = applicationContext.getBean(User.class);
        //false
        System.out.println(user1 == user2);
    }
}
