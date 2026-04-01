package org.example.spendingtracker.expense.internal;

import org.springframework.data.mongodb.repository.MongoRepository;

interface ExpenseRepository extends MongoRepository<ExpenseEntity, String> {
}
