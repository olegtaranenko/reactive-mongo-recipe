package com.olegtaranenko.udemy.recipe.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by user1 at Mar 14, 2019
 */

@Getter
@Setter
@Document
public class UnitOfMeasure {
    @Id
    private String id;
    private String description;
}
