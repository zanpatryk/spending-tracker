package org.example.spendingtracker.expense.internal;

import org.example.spendingtracker.expense.api.dto.ExpenseRequest;
import org.example.spendingtracker.expense.api.dto.ExpenseResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
interface ExpenseMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "timestamp", expression = "java(java.time.Instant.now())")
    ExpenseEntity toEntity(ExpenseRequest expenseRequest);

    ExpenseResponse toResponse(ExpenseEntity expense);
}
