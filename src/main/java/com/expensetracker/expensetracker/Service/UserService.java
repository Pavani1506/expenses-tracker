package com.expensetracker.expensetracker.Service;

import com.expensetracker.expensetracker.Entity.User;

import java.util.List;

public interface UserService {

    public User saveRecord(User user);

    public User getByName(String name);

    public User updateByPhoneNumber(String name, Long phoneNumber);

    public List<User> getAllData();

   public User updateUserDataByName(String name, User user);
}
