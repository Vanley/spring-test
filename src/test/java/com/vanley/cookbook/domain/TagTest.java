package com.vanley.cookbook.domain;

import com.vanley.cookbook.DataTest;
import com.vanley.cookbook.data.TagRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by vanley on 20/10/2016.
 */
public class TagTest extends DataTest {

    @Autowired
    TagRepository repo;

    @Test
    public void testTag() throws Exception {
        Tag t = new Tag();
        t.setName("Italian Kitchen");
        t.setStatus(Status.ACTIVE);

        repo.save(t);
    }

}
