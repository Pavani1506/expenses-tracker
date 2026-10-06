
package com.expensetracker.expensetracker.Repo;

import com.expensetracker.expensetracker.Entity.categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<categories, Integer> {

}
