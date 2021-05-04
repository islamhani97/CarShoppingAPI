package com.carshopping.adminside.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {


    @Query("SELECT a FROM Admin a WHERE a.username = ?1 AND a.password = ?2")
    Admin signIn(String username, String password);

}
