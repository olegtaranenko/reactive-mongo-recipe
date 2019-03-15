package com.olegtaranenko.udemy.recipe.repositories.reactive;

import com.olegtaranenko.udemy.recipe.domain.Recipe;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by user1 at Mar 14, 2019
 */
@RunWith(SpringRunner.class)
@DataMongoTest
public class RecipeReactiveRepositoryIT {

    @Autowired
    RecipeReactiveRepository repository;

    @Before
    public void setUp() throws Exception {
        repository.deleteAll().block();
    }

    @Test
    public void recipeSaveTest() throws Exception {
        Recipe recipe = Recipe.builder().description("Doshirak").build();
        repository.save(recipe).block();

        Long count = repository.count().block();
        assertEquals(Long.valueOf(1L), count);
    }
}