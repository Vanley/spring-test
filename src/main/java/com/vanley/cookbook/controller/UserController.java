package com.vanley.cookbook.controller;

import com.vanley.cookbook.domain.User;
import com.vanley.cookbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vanley on 15/10/2016.
 */
@RestController
public class UserController {
    @Autowired
    UserService us;

    @RequestMapping("/users/{id}")
    public User getUser(@PathVariable String id) {
        return us.getUser(id);
    }
}
