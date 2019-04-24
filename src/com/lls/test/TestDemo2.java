package com.lls.test;

import com.lls.bean.MyCollection;
import com.lls.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo2 {
    ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("applicationContext_injection.xml");
    @Test
    public void Test1() {

//        ApplicationContext配置的所有bean都会在容器创建的时候创建
//        如果配置的bean过多,在创建容器的时候会导致内存过大的问题
//        通过getBeaen获取配置好的user对象（向Spring容器要对象）
//        Object user = applicationContext.getBean("user");
        User user = applicationContext.getBean(User.class);
        System.out.println(user);
    }

    @Test
    public void Test2(){
        MyCollection myCollection = applicationContext.getBean(MyCollection.class);
        System.out.println(myCollection);
    }
}
