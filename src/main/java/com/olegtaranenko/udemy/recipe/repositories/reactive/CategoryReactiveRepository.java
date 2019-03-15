package com.olegtaranenko.udemy.recipe.repositories.reactive;

import com.olegtaranenko.udemy.recipe.domain.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

/**
 * Created by user1 at Mar 14, 2019
 */
public interface CategoryReactiveRepository extends ReactiveMongoRepository<Category, String> {

    public Mono<Category> findByDescription(String description);

}
