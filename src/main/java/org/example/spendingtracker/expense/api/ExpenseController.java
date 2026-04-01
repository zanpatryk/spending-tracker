package org.example.spendingtracker.expense.api;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.example.spendingtracker.expense.api.dto.ExpenseRequest;
import org.example.spendingtracker.expense.api.dto.ExpenseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/expenses")
@AllArgsConstructor
public class ExpenseController {
    private final ExpenseFacade expenseFacade;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ExpenseResponse createExpense(@Valid @RequestBody ExpenseRequest req){
        return expenseFacade.createExpense(req);
    }
}
