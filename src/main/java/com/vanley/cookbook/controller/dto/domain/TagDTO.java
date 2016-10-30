package com.vanley.cookbook.controller.dto.domain;

/**
 * Created by vanley on 22/10/2016.
 */
public class TagDTO {
    private Integer id;
    private String name;
    private StatusDTO status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusDTO getStatus() {
        return status;
    }

    public void setStatus(StatusDTO status) {
        this.status = status;
    }
}
