package com.olegtaranenko.udemy.recipe.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by user1 at Mar 05, 2019
 */
@Getter
@Setter
@Document
public class Category {

    @Id
    private String  id;
    private String description;

    @Builder.Default
    @DBRef
    private Set<Recipe> recipes = new HashSet<>();

}
