package com.olegtaranenko.udemy.recipe.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Recipe {

    @Id
    private String id;

    private String description;
    private Integer prepareTime;
    private Integer cookTime;
    private Integer serving;
    private String source;
    private String url;

//    @Lob
    private String directions;

//    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;

//    @Lob
    private Byte[] image;

    private Notes notes;

    @Builder.Default
    private Set<Ingredient> ingredients = new HashSet<>();

    @Builder.Default
    private Set<Category> categories = new HashSet<>();

    public void setNotes(Notes notes) {
        if (notes != null) {
            this.notes = notes;
        }
    }

    public Recipe addIngredient(Ingredient ingredient) {
//        ingredient.setRecipe(this);
        this.ingredients.add(ingredient);
        return this;
    }
}
