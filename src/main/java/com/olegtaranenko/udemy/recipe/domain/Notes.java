package com.olegtaranenko.udemy.recipe.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

/*
    Created by user1 at Mar 05, 2019
*/

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Notes {

    @Id
    private String id;
    private Recipe recipe;
    private String recipeNotes;

}
