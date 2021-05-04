package com.carshopping.adminside.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminProductService {

    @Autowired
    private AdminProductRepository adminProductRepository;
}
