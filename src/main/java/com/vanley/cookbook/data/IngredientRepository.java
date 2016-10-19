package com.vanley.cookbook.data;

import com.vanley.cookbook.domain.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vanley on 16/10/2016.
 */
@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {

}
