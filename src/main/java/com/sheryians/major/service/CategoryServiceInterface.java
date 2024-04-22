package com.sheryians.major.service;

import com.sheryians.major.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryServiceInterface {
    List<Category> getAllCategory();
    void addCategory(Category category);
    void removeCategoryById(int id);
    Optional<Category> getCategoryById(int id);
}
