package com.olegtaranenko.udemy.recipe.services;

import com.olegtaranenko.udemy.recipe.commands.RecipeCommand;
import com.olegtaranenko.udemy.recipe.domain.Recipe;

import java.util.Set;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(String id);

    RecipeCommand findCommandById(String id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(String idToDelete);
}
