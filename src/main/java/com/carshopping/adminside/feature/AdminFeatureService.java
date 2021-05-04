package com.carshopping.adminside.feature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminFeatureService {

    @Autowired
    private AdminFeatureRepository adminFeatureRepository;
}
