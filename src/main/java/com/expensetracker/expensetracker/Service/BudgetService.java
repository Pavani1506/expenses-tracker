package com.expensetracker.expensetracker.Service;

import com.expensetracker.expensetracker.Entity.Budget;
import java.util.List;

public interface BudgetService {
    Object saveRecord(Budget budget);
    List<Budget> getBudgetByUserId(Integer id);
}
