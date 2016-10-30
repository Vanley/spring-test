package com.vanley.cookbook.controller;

import com.vanley.cookbook.controller.dto.RestResponse;
import com.vanley.cookbook.controller.dto.domain.TagDTO;
import com.vanley.cookbook.controller.dto.mapper.TagMapper;
import com.vanley.cookbook.data.TagRepository;
import com.vanley.cookbook.domain.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vanley on 22/10/2016.
 */
@RestController
public class TagController {

    @Autowired
    TagRepository tagRepository;

    @Autowired
    TagMapper tagMapper;

    @RequestMapping(name = "tags", method = RequestMethod.POST)
    public TagDTO addTag(@RequestBody TagDTO tagDTO) {
        Tag tagDB = tagMapper.map(tagDTO);
        tagRepository.save(tagDB);
        return tagMapper.map(tagDB);
    }

    @RequestMapping(name = "tags", method = RequestMethod.PATCH)
    public TagDTO updateTag(@RequestBody TagDTO tagDTO) {
        Tag tagDB = tagMapper.map(tagDTO);
        if (!tagRepository.exists(tagDB.getId())) {
            throw new RuntimeException("Wrong ID");
        }
        tagRepository.save(tagDB);
        return tagMapper.map(tagDB);
    }

    @RequestMapping(name = "tags", method = RequestMethod.GET)
    public Page<TagDTO> getAll(@RequestParam(required = false) PageRequest page){
        Tag tagDB = new Tag();
        Page<Tag> result = tagRepository.findAll(page);
        List<TagDTO> ret = new ArrayList<>();

        result.forEach(t -> ret.add(tagMapper.map(t)));

        return new PageImpl<TagDTO>(ret);
    }



    //pobierz wszystkie aktywne

    //usun tag/deaktywuj

    //dodaj tag

    //
}
