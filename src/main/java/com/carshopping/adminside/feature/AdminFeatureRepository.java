package com.carshopping.adminside.feature;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminFeatureRepository  extends JpaRepository<AdminFeature,Long> {
}
