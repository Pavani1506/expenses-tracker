package com.expensetracker.expensetracker.Service;

import com.expensetracker.expensetracker.Entity.User;
import com.expensetracker.expensetracker.Exception.UserIdInvalide;
import com.expensetracker.expensetracker.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.expensetracker.expensetracker.Entity.Income;
import com.expensetracker.expensetracker.Repo.IncomeRepo;

import java.util.Optional;

@Service
public class IncomeServiceImp implements IncomeService {
    @Autowired
    private IncomeRepo incomeRepo;

    @Autowired
    private UserRepo userRepo;

    @Override
    public Object saveRecord(Income income) {
        Optional<User> u1=userRepo.findById(income.getUser().getId());
        if(u1.isEmpty()){
            throw new UserIdInvalide("you passed worng user id");
        }
        if(u1.isPresent()) {
            Income i1 = incomeRepo.save(income);
            i1.setUser(u1.get());
            return i1;
        }
        return null;
    }

}
