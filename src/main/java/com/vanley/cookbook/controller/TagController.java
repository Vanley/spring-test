package com.vanley.cookbook.controller;

import com.vanley.cookbook.controller.dto.domain.TagDTO;
import com.vanley.cookbook.controller.dto.mapper.TagMapper;
import com.vanley.cookbook.data.TagRepository;
import com.vanley.cookbook.domain.Status;
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
@RequestMapping("tags")
public class TagController {

    @Autowired
    TagRepository tagRepository;

    @Autowired
    TagMapper tagMapper;

    @RequestMapping(method = RequestMethod.GET)
    public Page<TagDTO> getAll(@RequestParam(required = false) PageRequest page){
        Page<Tag> result = tagRepository.findByStatus(Status.ACTIVE, page);
        List<TagDTO> ret = new ArrayList<>();

        result.forEach(t -> ret.add(tagMapper.map(t)));

        return new PageImpl<TagDTO>(ret);
    }

    @RequestMapping(method = RequestMethod.POST)
    public TagDTO add(@RequestBody TagDTO tagDTO) {
        Tag tagDB = tagMapper.map(tagDTO);
        tagRepository.save(tagDB);
        return tagMapper.map(tagDB);
    }

    @RequestMapping(method = RequestMethod.PATCH)
    public TagDTO update(@RequestBody TagDTO tagDTO) {
        Tag tagDB = tagMapper.map(tagDTO);
        if (!tagRepository.exists(tagDB.getId())) {
            throw new RuntimeException("Wrong ID");
        }
        tagRepository.save(tagDB);
        return tagMapper.map(tagDB);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public TagDTO delete(@PathVariable Integer id) {
        Tag tagDB = tagRepository.findOne(id);
        tagDB.setStatus(Status.DELETED);
        tagRepository.save(tagDB);
        return tagMapper.map(tagDB);
    }
}
