package com.vanley.cookbook.domain;

import com.vanley.cookbook.CookbookConfig;
import com.vanley.cookbook.data.TagRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by vanley on 20/10/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CookbookConfig.class)
public class TagTest {

    @Autowired
    TagRepository repo;

    @Test
    public void testTag() throws Exception {
        Tag t = new Tag();
        t.setName("Italian Kitchen");

        repo.save(t);
    }

}
