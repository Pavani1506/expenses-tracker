package com.expensetracker.expensetracker.Service;

import com.expensetracker.expensetracker.Entity.User;
import com.expensetracker.expensetracker.Exception.UserIdInvalide;
import com.expensetracker.expensetracker.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.expensetracker.expensetracker.Entity.Income;
import com.expensetracker.expensetracker.Repo.IncomeRepo;
import java.util.List;

import java.util.Optional;

@Service
public class IncomeServiceImp implements IncomeService {
    @Autowired
    private IncomeRepo incomeRepo;

    @Autowired
    private UserRepo userRepo;

    @Override
    public Income saveRecord(Income income) {
        Optional<User> u1=userRepo.findById(income.getUser().getId());
        if(u1.isEmpty()){
            throw new UserIdInvalide("you passed wrong user id");
        }
        if(u1.isPresent()) {
            Income i1 = incomeRepo.save(income);
            i1.setUser(u1.get());
            return i1;
        }
        return null;
    }
    @Override
    public List<Income> getIncomeByUserId(Integer id) {
        List<Income> income = incomeRepo.findByUser_Id(id);
        return income;
    }
    @Override
    public List<Income> getAllData() {
        List<Income> i1=incomeRepo.findAll();

        return i1;
    }

}
