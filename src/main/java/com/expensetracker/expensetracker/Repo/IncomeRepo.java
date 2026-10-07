package com.expensetracker.expensetracker.Repo;

import com.expensetracker.expensetracker.Entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IncomeRepo extends JpaRepository<Income,Integer> {
    public List<Income> findByUser_Id(Integer id);
}
