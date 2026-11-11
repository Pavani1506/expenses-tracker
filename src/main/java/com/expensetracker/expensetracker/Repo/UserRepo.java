package com.expensetracker.expensetracker.Repo;

import com.expensetracker.expensetracker.Entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

    public Optional<User> findByName(String name);

    public Page<User> findByName(String name, Pageable pageable);
}
