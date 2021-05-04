package com.carshopping.adminside.offer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminOfferRepository extends JpaRepository<AdminOffer,Long> {
}
