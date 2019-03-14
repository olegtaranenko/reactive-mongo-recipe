package com.olegtaranenko.udemy.recipe.bootstrap;

import com.olegtaranenko.udemy.recipe.repositories.reactive.UnitOfMeasureReactiveRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by user1 at Mar 14, 2019
 */
@Slf4j
@Component
@AllArgsConstructor
public class RecipeBootstrap implements ApplicationListener<ContextRefreshedEvent> {

//    private final UnitOfMeasureReactiveRepository reactiveRepository;

    @Autowired
    UnitOfMeasureReactiveRepository reactiveRepository;

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.error("###");
        log.error(reactiveRepository.count().block().toString());

    }
}
