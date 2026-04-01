package org.example.spendingtracker.expense.internal;

import lombok.AllArgsConstructor;
import org.example.spendingtracker.expense.api.ExpenseFacade;
import org.example.spendingtracker.expense.api.dto.ExpenseRequest;
import org.example.spendingtracker.expense.api.dto.ExpenseResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
class ExpenseService implements ExpenseFacade {
    private final ExpenseRepository repository;
    private final ExpenseMapper mapper;

    @Transactional
    public ExpenseResponse createExpense(ExpenseRequest request){
        ExpenseEntity entity = mapper.toEntity(request);
        ExpenseEntity saved = repository.save(entity);
        return mapper.toResponse(saved);
    }
}
