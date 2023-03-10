package com.mingtai.mingtai_backend.services.interfaces;

import com.mingtai.mingtai_backend.pojos.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    // list categories
    List<Category> getAllCategories();

    //add category
    boolean addCategory(Category category);

    boolean deleteCategory(int id);

    boolean updateCategory(int id, Category category);

    Integer getParentID(int id);

}
