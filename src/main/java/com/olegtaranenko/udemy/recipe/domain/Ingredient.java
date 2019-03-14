package com.olegtaranenko.udemy.recipe.domain;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

/**
 * Created by user1 at Mar 05, 2019
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class Ingredient {

    @Id
    private String id;

    private String description;
    private BigDecimal amount;
//    private Recipe recipe;
    private UnitOfMeasure uom;

}
