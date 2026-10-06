
package com.expensetracker.expensetracker.Service;

import com.expensetracker.expensetracker.Entity.categories;
import java.util.List;

public interface CategoryService {
    categories saveCategory(categories category);
    List<categories> getAllCategories();
    categories getCategoryById(int id);
    void deleteCategory(int id);
}
