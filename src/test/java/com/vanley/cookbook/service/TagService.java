package com.vanley.cookbook.service;

import com.vanley.cookbook.data.RecipeRepository;
import com.vanley.cookbook.domain.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by vanley on 20/10/2016.
 */
@Service
public class TagService {
    @Autowired
    RecipeRepository r_repo;

    @Transactional
    public void testPrintOutRepository()
    {
        System.out.println("-----------------");
        Recipe one = r_repo.getOne(5);
        System.out.println(one.getName());
    }
}
