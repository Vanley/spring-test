package com.vanley.cookbook.domain;

import com.vanley.cookbook.CookbookConfig;
import com.vanley.cookbook.DataConfiguration;
import com.vanley.cookbook.DataTest;
import com.vanley.cookbook.data.IngredientRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by vanley on 16/10/2016.
 */
public class IngredientTest extends DataTest{

    @Autowired
    IngredientRepository repo;

    @Test
    public void testIngredient() throws Exception {
        Ingredient i = new Ingredient();
        i.setName("mascarpone");
        i.setDescription("creamy");

        repo.save(i);
    }

}