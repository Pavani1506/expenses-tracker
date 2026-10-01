package com.expensetracker.expensetracker.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.expensetracker.expensetracker.Entity.Income;
import com.expensetracker.expensetracker.Repo.IncomeRepo;

@Service
public class IncomeServiceImp implements IncomeService {
    @Autowired
    private IncomeRepo incomeRepo;

    @Override
    public Income saveRecord(Income income) {
        Income i1 = incomeRepo.save(income);
        return i1;
    }

}
