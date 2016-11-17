package com.vanley.cookbook.controller.dto.mapper;

import com.vanley.cookbook.controller.dto.domain.TagDTO;
import com.vanley.cookbook.domain.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vanley on 22/10/2016.
 */
@Service
public class TagMapper {

    @Autowired
    private StatusMapper statusMapper;

    public TagDTO map(Tag t) {
        if (t == null) {return null;}

        TagDTO ret = new TagDTO();
        ret.setId(t.getId());
        ret.setName(t.getName());
        ret.setStatus(statusMapper.map(t.getStatus()));

        return ret;
    }

    public Tag map(TagDTO t) {
        if (t == null) {return null;}

        Tag ret = new Tag();
        ret.setId(t.getId());
        ret.setName(t.getName());
        ret.setStatus(statusMapper.map(t.getStatus()));

        return ret;
    }

}
