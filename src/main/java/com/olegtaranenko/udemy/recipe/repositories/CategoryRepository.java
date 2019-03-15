package com.olegtaranenko.udemy.recipe.repositories;

import com.olegtaranenko.udemy.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by user1 at Mar 05, 2019
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
