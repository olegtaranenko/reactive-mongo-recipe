package com.olegtaranenko.udemy.recipe.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

/**
 * Created by user1 at Mar 14, 2019
 */

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class UnitOfMeasure {
    @Id
    @Builder.Default
    private String id = UUID.randomUUID().toString();
    private String description;
}
