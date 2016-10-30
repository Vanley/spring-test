package com.vanley.cookbook.service;

import com.vanley.cookbook.CookbookConfig;
import com.vanley.cookbook.DataTest;
import com.vanley.cookbook.domain.User;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by vanley on 15/10/2016.
 */
public class UserServiceTest extends DataTest {
    @Autowired
    UserService us ;
    @Test
    public void getUser() throws Exception {
        User test = us.getUser("test");
        assertEquals("test",test.getId());
    }

}