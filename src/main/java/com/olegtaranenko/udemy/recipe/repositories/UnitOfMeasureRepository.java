package com.olegtaranenko.udemy.recipe.repositories;

import com.olegtaranenko.udemy.recipe.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by user1 at Mar 05, 2019
 */
@Repository
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, String> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
