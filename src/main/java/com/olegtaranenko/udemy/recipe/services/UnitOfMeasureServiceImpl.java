package com.olegtaranenko.udemy.recipe.services;

import com.olegtaranenko.udemy.recipe.commands.UnitOfMeasureCommand;
import com.olegtaranenko.udemy.recipe.converters.UnitOfMeasureToUnitOfMeasureCommand;
import com.olegtaranenko.udemy.recipe.repositories.reactive.UnitOfMeasureReactiveRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

/**
 * Created by jt on 6/28/17.
 */
@Service
@AllArgsConstructor
public class UnitOfMeasureServiceImpl implements UnitOfMeasureService {

    private final UnitOfMeasureReactiveRepository unitOfMeasureRepository;
    private final UnitOfMeasureToUnitOfMeasureCommand unitOfMeasureToUnitOfMeasureCommand;

/*
    public UnitOfMeasureServiceImpl(UnitOfMeasureReactiveRepository unitOfMeasureRepository, UnitOfMeasureToUnitOfMeasureCommand unitOfMeasureToUnitOfMeasureCommand) {
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.unitOfMeasureToUnitOfMeasureCommand = unitOfMeasureToUnitOfMeasureCommand;
    }
*/

    @Override
    public Flux<UnitOfMeasureCommand> listAllUoms() {
        return unitOfMeasureRepository
                .findAll()
                .map(unitOfMeasureToUnitOfMeasureCommand::convert);

/*
        return StreamSupport.stream(unitOfMeasureRepository.findAll()
                .spliterator(), false)
                .map(unitOfMeasureToUnitOfMeasureCommand::convert)
                .collect(Collectors.toSet());
*/
    }
}
