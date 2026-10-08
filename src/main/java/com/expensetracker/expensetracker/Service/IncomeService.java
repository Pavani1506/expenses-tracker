package com.expensetracker.expensetracker.Service;

import com.expensetracker.expensetracker.Entity.Income;
import java.util.List;


public interface IncomeService {
    public Income saveRecord(Income income);
    public List<Income> getIncomeByUserId(Integer id);
    public List<Income> getAllData();
}
