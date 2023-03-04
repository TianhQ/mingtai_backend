package com.mingtai.mingtai_backend.mappers;


import com.mingtai.mingtai_backend.configs.ApiVersion;
import com.mingtai.mingtai_backend.pojos.Category;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Mapper
public interface CategoryMapper {

    List<Category> getAllCategories();

//    Category queryCategoryById(@Param("id") int id);
//
    boolean addMainCategory(Category category);
    boolean addSubCategory(Category category);



    boolean deleteCategory(@Param("id") int id);

//
//    boolean deleteCategory(@Param("id") int id);
//
//    boolean updateUser(Category category);
//
    List<Category> getChildren();

    Integer getParentID(@Param("id") int id);

    boolean updateCategory(@Param("id") int id, @Param("category") Category category);




}
