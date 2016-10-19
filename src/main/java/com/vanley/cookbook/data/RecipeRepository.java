package com.vanley.cookbook.data;

import com.vanley.cookbook.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vanley on 19/10/2016.
 */
@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
}
