package com.carshopping.adminside.featurevalue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminFeatureValueRepository extends JpaRepository<AdminFeatureValue,Long> {
}
