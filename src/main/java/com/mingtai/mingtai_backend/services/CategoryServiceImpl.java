package com.mingtai.mingtai_backend.services;

import com.mingtai.mingtai_backend.mappers.CategoryMapper;
import com.mingtai.mingtai_backend.pojos.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> getAllCategories() {
//        System.out.println(categoryMapper.getAllCategories().size());
        return categoryMapper.getAllCategories();
    }

    @Override
    public boolean addMainCategory(Category category){
        return categoryMapper.addMainCategory(category);
    }

    @Override
    public boolean addSubCategory(Category category){
        return categoryMapper.addSubCategory(category);
    }

    @Override
    public boolean deleteCategory(int id){
        return categoryMapper.deleteCategory(id);

    }

}
