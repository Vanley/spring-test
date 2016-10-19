package com.vanley.cookbook.data;

import com.vanley.cookbook.domain.User;

/**
 * Created by vanley on 15/10/2016.
 */

public interface UserRepository {
    User getById(String id);
}
