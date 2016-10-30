package com.vanley.cookbook.domain;

import com.vanley.cookbook.DataTest;
import com.vanley.cookbook.data.RecipeRepository;
import com.vanley.cookbook.data.TagRepository;
import com.vanley.cookbook.service.TagService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vanley on 20/10/2016.
 */
public class RecipeWithTagTest extends DataTest{
    @Autowired
    RecipeRepository rRepo;
    @Autowired
    TagRepository tRepo;
    @Autowired
    TagService tagService;

    @Test
    public void test() throws Exception {
        Recipe r = testRecipe();
        Tag t = testTag();
        List<Tag> l = new ArrayList<>();
        l.add(t);
        r.setTags(l);
        //tRepo.save(t);
        rRepo.saveAndFlush(r);

        tagService.testPrintOutRepository();
    }


    public Recipe testRecipe() throws Exception {
        Recipe r = new Recipe();
        r.setName("Tiramisu");
        r.setDescription("Best Creamy Tiramisu");
        r.setPreparationTimeInMinutes(60);
        r.setPreparationDescription("Mix everything and will be Grand!");
        return r;
    }

    public Tag testTag() throws Exception {
        Tag t = new Tag();
        t.setName("Italian Kitchen");
        return t;
    }
}
