
package com.expensetracker.expensetracker.Controller;

import com.expensetracker.expensetracker.Entity.Categories;
import com.expensetracker.expensetracker.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @PostMapping("/saveCategoryData")
    public ResponseEntity<Object> saveCategory(@RequestBody Categories category) {
        Object c1 = categoryService.saveCategory(category);
        return new ResponseEntity<>(c1, HttpStatus.CREATED);
    }


    @GetMapping("/getCategoryById/{id}")
    public ResponseEntity<Object> getCategoryById(@PathVariable int id) {
        Object cat = categoryService.getCategoryById(id);
        return new ResponseEntity<>(cat, HttpStatus.OK);
    }



}
