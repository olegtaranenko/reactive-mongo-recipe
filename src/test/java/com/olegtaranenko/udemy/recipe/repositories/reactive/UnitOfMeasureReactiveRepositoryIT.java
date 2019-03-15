package com.olegtaranenko.udemy.recipe.repositories.reactive;

import com.olegtaranenko.udemy.recipe.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by user1 at Mar 15, 2019
 */
@RunWith(SpringRunner.class)
@DataMongoTest
public class UnitOfMeasureReactiveRepositoryIT {

    @Autowired
    UnitOfMeasureReactiveRepository repository;


    @Before
    public void setUp() throws Exception {
        repository.deleteAll();
    }

    @Test
    public void saveUomTest() throws Exception {
        UnitOfMeasure uom = UnitOfMeasure.builder().build();

        UnitOfMeasure saved = repository.save(uom).block();

        assertNotNull(saved);
        assertNotNull(saved.getId());
        assertNull(saved.getDescription());
    }
}