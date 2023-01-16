package com.mingtai.mingtai_backend.controllers;

import com.mingtai.mingtai_backend.common.Result;
import com.mingtai.mingtai_backend.configs.ApiVersion;
import com.mingtai.mingtai_backend.pojos.Category;
import com.mingtai.mingtai_backend.services.CategoryService;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import javax.annotation.Resource;
import java.util.List;

import static org.apache.ibatis.ognl.DynamicSubscript.all;

//@CrossOrigin(origins = {"http://localhost:3000", "null"})
@RestController
@RequestMapping("/api/{version}/")
@ApiVersion(1)

public class CategoryController {
    @Resource
    private CategoryService categoryService;
    //get all category

//    public Result<List<Category>> getAllCategories(){
//        List<Category> list = categoryService.getAllCategories();
//        return Result.success(list);
//    }


    @GetMapping("/categories")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @PostMapping("/categories")
    public boolean addCategory(@RequestBody Category category){
        if(category.getParent_id() == 0){
            return categoryService.addMainCategory(category);
        }
        return categoryService.addSubCategory(category);
    }

    @DeleteMapping("/categories")
    public boolean deleteCategory(@RequestParam(value = "id") int id){
        return categoryService.deleteCategory(id);
    }


}