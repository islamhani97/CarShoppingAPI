package com.carshopping.adminside.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminCategoryService {

    @Autowired
    private AdminCategoryRepository adminCategoryRepository;


    public List<AdminCategory> getMajorCategories() {
        return adminCategoryRepository.getMajorCategories();
    }

    public List<AdminCategory> getAllCategories() {
        return adminCategoryRepository.findAll();
    }

    public List<AdminCategory> getSubCategories(Long parentId){
        return adminCategoryRepository.getSubCategories(parentId);
    }
    public void saveCategory(AdminCategory adminCategory) {
        adminCategoryRepository.save(adminCategory);
    }


}
