package com.vanley.cookbook.controller.dto.mapper;

import com.vanley.cookbook.controller.dto.domain.StatusDTO;
import com.vanley.cookbook.domain.Status;
import org.springframework.stereotype.Service;

/**
 * Created by vanley on 22/10/2016.
 */
@Service
public class StatusMapper {
    public StatusDTO map(Status s) {
        if(s == null) return null;
        StatusDTO ret = null;

        switch(s) {
            case ACTIVE:
                ret = StatusDTO.ACTIVE;
                break;
            case DELETED:
                ret = StatusDTO.DELETED;
                break;
        }
        return ret;
    }

    public Status map(StatusDTO s) {
        if(s == null) return null;
        Status ret = null;

        switch(s) {
            case ACTIVE:
                ret = Status.ACTIVE;
                break;
            case DELETED:
                ret = Status.DELETED;
                break;
        }
        return ret;
    }
}
