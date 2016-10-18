package com.vanley.springTest.data;

import com.vanley.springTest.domain.User;

/**
 * Created by vanley on 15/10/2016.
 */

public interface UserRepository {
    User getById(String id);
}
