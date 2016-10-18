package com.vanley.springTest.data;

import com.vanley.springTest.domain.Indigrient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by vanley on 16/10/2016.
 */
@Repository
public interface IndigrientRepository extends JpaRepository<Indigrient, Integer> {


}


//    @PersistenceContext
//    EntityManager em;
//
//    @Transactional
//    public Indigrient store(Indigrient i) {
//        em.persist(i);
//        em.flush();
//        return i;
//    }