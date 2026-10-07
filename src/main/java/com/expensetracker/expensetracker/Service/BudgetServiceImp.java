package com.expensetracker.expensetracker.Service;

import com.expensetracker.expensetracker.Entity.Budget;
import com.expensetracker.expensetracker.Repo.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BudgetServiceImp implements BudgetService {
    @Autowired
    private BudgetRepository budgetRepository;

    @Override
    public Object saveRecord(Budget budget) {
        return budgetRepository.save(budget);
    }
    @Override
    public List<Budget> getBudgetByUserId(Integer id) {
        return budgetRepository.findByUserId(id);
    }
}
