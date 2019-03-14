package com.olegtaranenko.udemy.recipe.repositories.reactive;

import com.olegtaranenko.udemy.recipe.domain.UnitOfMeasure;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by user1 at Mar 14, 2019
 */
public interface UnitOfMeasureReactiveRepository extends ReactiveMongoRepository<UnitOfMeasure, String> {
}
