package org.example.spendingtracker.expense.api.dto;

import java.math.BigDecimal;
import java.time.Instant;

public record ExpenseResponse(
   String id,
   BigDecimal amount,
   String currency,
   String category,
   String description,
   Instant timestamp
) {}
