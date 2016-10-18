package com.vanley.springTest.service;

import com.vanley.springTest.data.UserRepository;
import com.vanley.springTest.domain.User;
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
