package com.mingtai.mingtai_backend.services.impl;

import com.mingtai.mingtai_backend.mappers.CategoryMapper;
import com.mingtai.mingtai_backend.mappers.OrchidMapper;
import com.mingtai.mingtai_backend.pojos.Category;
import com.mingtai.mingtai_backend.services.interfaces.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper;

    @Resource
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
    @Transactional
    public boolean deleteCategory(int id){
        Integer parent_id = getParentID(id);

        orchidMapper.updateOrchidWhenDeleteSubCategory(id, parent_id);
        if(categoryMapper.getChildren(id).size() != 0){
            for(Category category : categoryMapper.getChildren(id)){
                orchidMapper.updateOrchidWhenDeleteSubCategory(category.getId(), null);
            }
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
