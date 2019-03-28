package com.onps.dao;

import com.onps.model.User;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class testFuction {
    private ApplicationContext applicationContext;

    @Test
    public void userTest(){
        String configLocation = "classpath:spring/applicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
        UserDAO userDAO = (UserDAO) applicationContext.getBean("userDAO");
        Map<String,String> map = new HashMap<String,String>();
        map.put("userName","小明");
        map.put("pw","123");
        User user = userDAO.login(map);

    }
}
