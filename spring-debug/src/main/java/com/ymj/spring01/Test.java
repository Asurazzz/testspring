package com.ymj.spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        // ApplicationContext ac = new ClassPathXmlApplicationContext("/ymj/spring01/spring-${username}.xml");
        MyClassPathXmlApplicationContext ac = new MyClassPathXmlApplicationContext("/ymj/spring01/spring.xml");

    }
}
