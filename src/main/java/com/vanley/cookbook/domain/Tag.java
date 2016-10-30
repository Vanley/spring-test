package com.vanley.cookbook.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by vanley on 20/10/2016.
 */
@Entity
@Table(name="tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    @Enumerated(EnumType.STRING)
    @Column()
    private Status status;

    @ManyToMany(mappedBy = "tags")
    private List<Recipe> recipes;


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public List<Recipe> getRecipies() {
        return recipes;
    }

    public void setRecipies(List<Recipe> recipies) {
        this.recipes = recipies;
    }

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
