package com.expensetracker.expensetracker.Service;

import com.expensetracker.expensetracker.Entity.Income;
import java.util.List;


public interface IncomeService {
    public Object saveRecord(Income income);
    public List<Income> getIncomeByUserId(Integer id);
}
