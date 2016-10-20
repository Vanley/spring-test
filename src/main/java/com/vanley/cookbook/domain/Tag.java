package com.vanley.cookbook.domain;

import javax.persistence.*;

/**
 * Created by vanley on 20/10/2016.
 */
@Entity
@Table(name="tag")
public class Tag {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
