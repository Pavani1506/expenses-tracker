package com.expensetracker.expensetracker.Controller;

import com.expensetracker.expensetracker.Entity.Budget;
import com.expensetracker.expensetracker.Service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/budget")
@CrossOrigin
public class BudgetController {

    @Autowired
    private BudgetService budgetService;

    @PostMapping("/add")
    public Object addBudget(@RequestBody Budget budget) {
        return budgetService.saveRecord(budget);
    }

    @GetMapping("/user/{userId}")
    public List<Budget> getBudgetByUser(@PathVariable Integer userId) {
        return budgetService.getBudgetByUserId(userId);
    }
}
