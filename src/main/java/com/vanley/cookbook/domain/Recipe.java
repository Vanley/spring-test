package com.vanley.cookbook.domain;

import javax.persistence.*;

/**
 * Created by vanley on 19/10/2016.
 */
@Entity
@Table(name="recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String preparationDescription;
    @Column
    private Integer preparationTimeInMinutes;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparationDescription() {
        return preparationDescription;
    }

    public void setPreparationDescription(String preparationDescription) {
        this.preparationDescription = preparationDescription;
    }

    public Integer getPreparationTimeInMinutes() {
        return preparationTimeInMinutes;
    }

    public void setPreparationTimeInMinutes(Integer preparationTimeInMinutes) {
        this.preparationTimeInMinutes = preparationTimeInMinutes;
    }
}
