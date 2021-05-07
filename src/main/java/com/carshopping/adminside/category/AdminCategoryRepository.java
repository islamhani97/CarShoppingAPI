package com.carshopping.adminside.category;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminCategoryRepository extends JpaRepository<AdminCategory, Long> {


    @Query("SELECT c FROM AdminCategory c WHERE c.parentId = null")
    List<AdminCategory> getMajorCategories();

    @Query("SELECT c FROM AdminCategory c WHERE c.parentId = ?1")
    List<AdminCategory> getSubCategories(Long parentId);

}
