package com.expensetracker.expensetracker.Repo;

import com.expensetracker.expensetracker.Entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepo extends JpaRepository<Income,Integer> {
}
