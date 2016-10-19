package com.vanley.cookbook.service;

import com.vanley.cookbook.data.UserRepository;
import com.vanley.cookbook.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vanley on 15/10/2016.
 */
@Service
public class UserService {

    @Autowired
    UserRepository users;

    public User getUser(String id){
        return users.getById(id);
    }


}
