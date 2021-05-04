package com.carshopping.adminside.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;


    public Admin signIn(Admin admin) {
        Admin optionalAdmin = adminRepository.signIn(admin.getUsername(), admin.getPassword());
        if (optionalAdmin == null) {
            throw new IllegalStateException("Username or password is incorrect");
        }
        return optionalAdmin;
    }

}
