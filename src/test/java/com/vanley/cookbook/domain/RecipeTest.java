package com.vanley.cookbook.domain;

import com.vanley.cookbook.CookbookConfig;
import com.vanley.cookbook.DataTest;
import com.vanley.cookbook.data.RecipeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by vanley on 19/10/2016.
 */
public class RecipeTest extends DataTest {

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
