package com.vanley.cookbook.data;

import com.vanley.cookbook.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by vanley on 15/10/2016.
 */
@Repository
public interface UserRepository {
    User getById(String id);
}
