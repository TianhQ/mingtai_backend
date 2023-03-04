package com.mingtai.mingtai_backend.services;

import com.mingtai.mingtai_backend.mappers.CategoryMapper;
import com.mingtai.mingtai_backend.mappers.OrchidMapper;
import com.mingtai.mingtai_backend.pojos.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private OrchidMapper orchidMapper;


    @Override
    public List<Category> getAllCategories() {
//        System.out.println(categoryMapper.getAllCategories().size());
        return categoryMapper.getAllCategories();
    }

    @Override
    public boolean addCategory(Category category){
        if(category.getParent_id() == 0){
            return categoryMapper.addMainCategory(category);
        }
        return categoryMapper.addSubCategory(category);
    }

    @Override
    public boolean deleteCategory(int id){
        Integer parent_id = getParentID(id);
        if(parent_id != null){
            orchidMapper.updateOrchidWhenDeleteSubCategory(id, parent_id);
        }
        return categoryMapper.deleteCategory(id);

    }
    @Override
    public boolean updateCategory(int id, Category category){
        return categoryMapper.updateCategory(id, category);
    }

    @Override
    public Integer getParentID(int id){
        return categoryMapper.getParentID(id);
    }

}
