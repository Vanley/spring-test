package com.vanley.cookbook.data;

import com.vanley.cookbook.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by vanley on 15/10/2016.
 */

@Repository
public class UserMemoryRepository implements UserRepository {

    @Override
    public User getById(String id) {
        User user = new User();
        user.setId(id);
        return user;
    }
}
