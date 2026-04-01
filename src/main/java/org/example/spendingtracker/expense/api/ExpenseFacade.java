package org.example.spendingtracker.expense.api;

import org.example.spendingtracker.expense.api.dto.ExpenseRequest;
import org.example.spendingtracker.expense.api.dto.ExpenseResponse;

public interface ExpenseFacade {
    ExpenseResponse createExpense(ExpenseRequest request);
}