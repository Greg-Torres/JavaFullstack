package com.ctorres.domain.repository;

import java.util.List;
import java.util.Optional;

import com.ctorres.domain.Category;


public interface CategoryRepository {

	List<Category> getAll();
    Optional<Category> getCate(int CategoryId);
    Category save(Category category);
    void delete(int CategoryId);

}
