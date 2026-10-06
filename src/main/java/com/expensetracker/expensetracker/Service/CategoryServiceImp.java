package com.expensetracker.expensetracker.Service;

import com.expensetracker.expensetracker.Entity.categories;
import com.expensetracker.expensetracker.Repo.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public categories saveCategory(categories category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<categories> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public categories getCategoryById(int id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteCategory(int id) {
        categoryRepository.deleteById(id);
    }
}
