package com.vanley.cookbook.controller.dto.mapper;

import com.vanley.cookbook.controller.dto.domain.RecipeDTO;
import com.vanley.cookbook.domain.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vanley on 03/11/2016.
 */
@Service
public class RecipeMapper {

    @Autowired
    private StatusMapper statusMapper;

    public RecipeDTO map(Recipe r){
        if (r == null) {return null;}

        RecipeDTO ret = new RecipeDTO();
        ret.setId(r.getId());
        ret.setName(r.getName());
        ret.setDescription(r.getDescription());
        ret.setPreparationDescription(r.getPreparationDescription());
        ret.setPreparationTimeInMinutes(r.getPreparationTimeInMinutes());

        return ret;
    }

    public Recipe map(RecipeDTO r) {
        if (r == null) {return null;}

        Recipe ret = new Recipe();
        ret.setId(r.getId());
        ret.setName(r.getName());
        ret.setDescription(r.getDescription());
        ret.setPreparationDescription(r.getPreparationDescription());
        ret.setPreparationTimeInMinutes(r.getPreparationTimeInMinutes());

        return ret;
    }

}

