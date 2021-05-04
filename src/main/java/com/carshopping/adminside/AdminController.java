package com.carshopping.adminside;

import com.carshopping.adminside.admin.Admin;
import com.carshopping.adminside.admin.AdminService;
import com.carshopping.adminside.category.AdminCategoryService;
import com.carshopping.adminside.feature.AdminFeatureService;
import com.carshopping.adminside.featurevalue.AdminFeatureValueService;
import com.carshopping.adminside.offer.AdminOfferService;
import com.carshopping.adminside.product.AdminProductService;
import com.carshopping.adminside.version.AdminVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
