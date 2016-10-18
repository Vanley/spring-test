package com.vanley.springTest.domain;

import com.vanley.springTest.SpringTestConfig;
import com.vanley.springTest.data.IndigrientRepository;
import com.vanley.springTest.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by vanley on 16/10/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringTestConfig.class)
public class IndigrientTest {

    @Autowired
    IndigrientRepository repo;

    @Test
    public void readIndigrient() throws Exception {
        Indigrient i = new Indigrient();
        i.setName("salt");
        i.setDescription("salty");

        repo.save(i);
    }


}