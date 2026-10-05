package com.expensetracker.expensetracker.Service;

import com.expensetracker.expensetracker.Entity.User;
import com.expensetracker.expensetracker.Exception.UserNameInvalide;
import com.expensetracker.expensetracker.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService{
    @Autowired
   private UserRepo userRepo;

    @Override
    public User saveRecord(User user) {
        User u1=userRepo.save(user);
        return u1;
    }

    @Override
    public User getByName(String name) {
        Optional<User> u1=userRepo.findByName(name);
        return u1.get();
    }

    @Override
    public User updateByPhoneNumber(String name, Long phoneNumber) {
        Optional<User> u1=userRepo.findByName(name);
        if(u1.isPresent()){
            u1.get().setPhoneNumber(phoneNumber);
            User u2=userRepo.save(u1.get());
            return u2;
        }
        if(u1.isEmpty()){
            throw new UserNameInvalide("please pass valide user name");
        }
        return null;
    }
}
