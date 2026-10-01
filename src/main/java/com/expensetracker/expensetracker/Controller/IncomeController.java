package com.expensetracker.expensetracker.Controller;

import com.expensetracker.expensetracker.Entity.Income;
import com.expensetracker.expensetracker.Service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Income")
public class IncomeController {
    @Autowired
    private IncomeService incomeService;

    @PostMapping("/saveIncomeData")
    public ResponseEntity<Object> saveIncome(@RequestBody Income income) {
        Object i1 = incomeService.saveRecord(income);
        return new ResponseEntity<>(i1, HttpStatus.CREATED);
    }
}
