package com.vanley.springTest.domain;

import com.vanley.springTest.SpringTestConfig;
import com.vanley.springTest.data.IngredientRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by vanley on 16/10/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringTestConfig.class)
public class IngredientTest {

    @Autowired
    IngredientRepository repo;

    @Test
    public void testIngredient() throws Exception {
        Ingredient i = new Ingredient();
        i.setName("salt");
        i.setDescription("salty");

        repo.save(i);
    }

}