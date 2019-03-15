package com.olegtaranenko.udemy.recipe.repositories.reactive;

import com.olegtaranenko.udemy.recipe.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by user1 at Mar 14, 2019
 */
public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String > {
}
