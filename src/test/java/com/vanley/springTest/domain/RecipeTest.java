package com.vanley.springTest.domain;

import com.vanley.springTest.SpringTestConfig;
import com.vanley.springTest.data.RecipeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by vanley on 19/10/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringTestConfig.class)
public class RecipeTest {

    @Autowired
    RecipeRepository repo;

    @Test
    public void testRecipe() throws Exception {
        Recipe r = new Recipe();
        r.setName("Tiramisu");
        r.setDescription("Best Creamy Tiramisu");
        r.setPreparationTimeInMinutes(60);
        r.setPreparationDescription("Mix everything and will be Grand!");

        repo.save(r);
    }
}
