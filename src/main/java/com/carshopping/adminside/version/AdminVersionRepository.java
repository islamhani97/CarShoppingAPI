package com.carshopping.adminside.version;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminVersionRepository extends JpaRepository<AdminVersion,Long> {
}
