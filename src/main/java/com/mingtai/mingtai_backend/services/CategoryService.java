package com.mingtai.mingtai_backend.services;

import com.mingtai.mingtai_backend.pojos.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    // list categories
    List<Category> getAllCategories();

    //add category
    boolean addMainCategory(Category category);
    boolean addSubCategory(Category category);

    boolean deleteCategory(int id);



}
