package com.carshopping.adminside;

import com.carshopping.adminside.admin.Admin;
import com.carshopping.adminside.admin.AdminService;
import com.carshopping.adminside.category.AdminCategory;
import com.carshopping.adminside.category.AdminCategoryService;
import com.carshopping.adminside.feature.AdminFeatureService;
import com.carshopping.adminside.featurevalue.AdminFeatureValueService;
import com.carshopping.adminside.offer.AdminOfferService;
import com.carshopping.adminside.product.AdminProductService;
import com.carshopping.adminside.version.AdminVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private AdminCategoryService adminCategoryService;
    @Autowired
    private AdminProductService adminProductService;
    @Autowired
    private AdminOfferService adminOfferService;
    @Autowired
    private AdminFeatureService adminFeatureService;
    @Autowired
    private AdminFeatureValueService adminFeatureValueService;
    @Autowired
    private AdminVersionService adminVersionService;



    @PostMapping("/signIn")
    public Admin signIn (@RequestBody Admin admin){
        return adminService.signIn(admin) ;
    }

    //==============================================

    @GetMapping("/categories/major")
    public List<AdminCategory> getMajorCategories(){
        return adminCategoryService.getMajorCategories();
    }

    @GetMapping("/categories")
    public List<AdminCategory> getAllCategories(){
        return adminCategoryService.getAllCategories();
    }

    @GetMapping("/categories/{parentId}")
    public List<AdminCategory> getSubCategories(@PathVariable("parentId") Long parentId){
        return adminCategoryService.getSubCategories(parentId);
    }

    @PostMapping("/categories")
    public void saveCategory(@RequestBody AdminCategory adminCategory){
        adminCategoryService.saveCategory(adminCategory);
    }




}
