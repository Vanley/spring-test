package com.vanley.cookbook.controller;

import com.vanley.cookbook.controller.dto.domain.RecipeDTO;
import com.vanley.cookbook.controller.dto.mapper.RecipeMapper;
import com.vanley.cookbook.data.RecipeRepository;
import com.vanley.cookbook.domain.Recipe;
import com.vanley.cookbook.domain.Status;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vanley on 22/10/2016.
 */
@RestController
@RequestMapping("recipes")
public class RecipeController {

    @Autowired
    RecipeRepository recipeRepository;

    @Autowired
    RecipeMapper recipeMapper;

    @RequestMapping(method = RequestMethod.GET)
    public Page<RecipeDTO> getAll(@RequestParam(required=false) PageRequest page) {
        Page<Recipe> result = recipeRepository.findAll(page);
        List<RecipeDTO> ret = new ArrayList<>();

        result.forEach(r -> ret.add(recipeMapper.map(r)));

        return new PageImpl<RecipeDTO>(ret);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public RecipeDTO add(@RequestBody RecipeDTO recipeDTO) {
        Recipe recipeDB = recipeMapper.map(recipeDTO);
        recipeRepository.save(recipeDB);
        return recipeMapper.map(recipeDB);
    }

//test patch post, co zmienia czy tylko update pol wystepujacych
    @RequestMapping(method = RequestMethod.POST)
    public RecipeDTO update(@RequestBody RecipeDTO recipeDTO) {
        Recipe recipeDB = recipeMapper.map(recipeDTO);
        if (!recipeRepository.exists(recipeDB.getId())) {
            throw new RuntimeException("Wrong ID");
        }
        recipeRepository.save(recipeDB);
        return recipeMapper.map(recipeDB);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public RecipeDTO delete(@PathVariable Integer id) {
        Recipe recipeDB = recipeRepository.findOne(id);
        recipeDB.setStatus(Status.DELETED);
        recipeRepository.save(recipeDB);
        return recipeMapper.map(recipeDB);
    }
}
