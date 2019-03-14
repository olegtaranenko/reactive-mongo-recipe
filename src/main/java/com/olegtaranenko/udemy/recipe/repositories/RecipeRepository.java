package com.olegtaranenko.udemy.recipe.repositories;

import com.olegtaranenko.udemy.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by user1 at Mar 05, 2019
 */
public interface RecipeRepository extends CrudRepository<Recipe, String> {
    Recipe findByDescription(String pattern);
}
