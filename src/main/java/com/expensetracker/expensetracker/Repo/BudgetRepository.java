package com.expensetracker.expensetracker.Repo;

import com.expensetracker.expensetracker.Entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BudgetRepository extends JpaRepository<Budget, Integer> {
    List<Budget> findByUserId(Integer userId);
}
