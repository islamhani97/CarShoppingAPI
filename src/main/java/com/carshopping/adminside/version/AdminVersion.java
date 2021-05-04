package com.carshopping.adminside.version;

import javax.persistence.*;

@Entity
@Table(name = "version", schema = "dbo")
public class AdminVersion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "AdminVersion{" +
                "id=" + id +
                ", productId=" + productId +
                '}';
    }
}
