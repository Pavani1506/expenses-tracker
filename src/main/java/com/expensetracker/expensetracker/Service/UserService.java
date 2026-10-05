package com.expensetracker.expensetracker.Service;

import com.expensetracker.expensetracker.Entity.User;

public interface UserService {

    public User saveRecord(User user);

    public User getByName(String name);

    public User updateByPhoneNumber(String name, Long phoneNumber);
}
