package com.olegtaranenko.udemy.recipe.services;

import com.olegtaranenko.udemy.recipe.commands.UnitOfMeasureCommand;
import com.olegtaranenko.udemy.recipe.converters.UnitOfMeasureToUnitOfMeasureCommand;
import com.olegtaranenko.udemy.recipe.domain.UnitOfMeasure;
import com.olegtaranenko.udemy.recipe.repositories.reactive.UnitOfMeasureReactiveRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Flux;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by user1 at Mar 14, 2019
 */
public class UnitOfMeasureServiceImplTest {

    UnitOfMeasureToUnitOfMeasureCommand unitOfMeasureToUnitOfMeasureCommand = new UnitOfMeasureToUnitOfMeasureCommand();
    UnitOfMeasureService unitOfMeasureService;

    @Mock
    UnitOfMeasureReactiveRepository unitOfMeasureReactiveRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        unitOfMeasureService = new UnitOfMeasureServiceImpl(unitOfMeasureReactiveRepository, unitOfMeasureToUnitOfMeasureCommand);

    }

    @Test
    public void listAllUomsTest() throws Exception {

        //given
        UnitOfMeasure uom1 = UnitOfMeasure.builder().id("1").build();
        UnitOfMeasure uom2 = UnitOfMeasure.builder().id("2").build();
        when(unitOfMeasureReactiveRepository.findAll()).thenReturn(Flux.just(uom1, uom2));

        //when
        List<UnitOfMeasureCommand> commands = this.unitOfMeasureService.listAllUoms().collectList().block();


        assertEquals(2, commands.size());
        verify(unitOfMeasureReactiveRepository, times(1)).findAll();
    }
}