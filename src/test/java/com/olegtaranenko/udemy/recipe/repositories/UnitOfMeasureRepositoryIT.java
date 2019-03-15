package com.olegtaranenko.udemy.recipe.repositories;

import com.olegtaranenko.udemy.recipe.bootstrap.RecipeBootstrap;
import com.olegtaranenko.udemy.recipe.domain.Recipe;
import com.olegtaranenko.udemy.recipe.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by user1 at Mar 15, 2019
 */
@RunWith(SpringRunner.class)
@DataMongoTest
public class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    RecipeRepository recipeRepository;


    @Before
    public void setUp() throws Exception {
        recipeRepository.deleteAll();
        unitOfMeasureRepository.deleteAll();
        categoryRepository.deleteAll();

        RecipeBootstrap recipeBootstrap = new RecipeBootstrap(unitOfMeasureRepository, categoryRepository, recipeRepository);
        recipeBootstrap.onApplicationEvent(null);
    }

    @Test
    public void findByDescriptionTest() throws Exception {
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");

        assertTrue(unitOfMeasure.isPresent());
        assertEquals("Teaspoon", unitOfMeasure.get().getDescription());
    }
}