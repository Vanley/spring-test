package com.vanley.springTest.service;

import com.vanley.springTest.SpringTestConfig;
import com.vanley.springTest.domain.User;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by vanley on 15/10/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringTestConfig.class)
public class UserServiceTest {
    @Autowired
    UserService us ;
    @Test
    public void getUser() throws Exception {
        User test = us.getUser("test");
        assertEquals("test",test.getId());
    }

}