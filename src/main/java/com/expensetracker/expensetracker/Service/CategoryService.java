
package com.expensetracker.expensetracker.Service;

import com.expensetracker.expensetracker.Entity.Categories;
import java.util.List;

public interface CategoryService {
    Categories saveCategory(Categories category);
    List<Categories> getAllCategories();
    Categories getCategoryById(int id);
    void deleteCategory(int id);
}
