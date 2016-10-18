package com.vanley.springTest.data;

import com.vanley.springTest.domain.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vanley on 16/10/2016.
 */
@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {

}
