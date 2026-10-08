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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/api/Income")
public class IncomeController {
    @Autowired
    private IncomeService incomeService;

    @PostMapping("/saveIncomeData")
    public ResponseEntity<Income> saveIncome(@RequestBody Income income) {
        Income i1 = incomeService.saveRecord(income);
        return new ResponseEntity<>(i1, HttpStatus.CREATED);
    }
    @GetMapping("/getIncomeByUserId/{id}")
    public ResponseEntity<List<Income>> getIncomeByUserId(@PathVariable Integer id) {
        List<Income> income = incomeService.getIncomeByUserId(id);
        return new ResponseEntity<>(income, HttpStatus.OK);
    }
    @GetMapping("/getAllIncomedata")
    public ResponseEntity<List<Income>> getAllIncome(){
        List<Income> i1=incomeService.getAllData();
        return new ResponseEntity<>(i1,HttpStatus.OK);
    }
}
