package com.carshopping.adminside.offer;


import javax.persistence.*;

@Entity
@Table(name = "offer", schema = "dbo")
public class AdminOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "discount")
    private Double discount;

    @Column(name = "pieces")
    private Integer pieces;

    @Column(name = "gift")
    private Integer gift;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getPieces() {
        return pieces;
    }

    public void setPieces(Integer pieces) {
        this.pieces = pieces;
    }

    public Integer getGift() {
        return gift;
    }

    public void setGift(Integer gift) {
        this.gift = gift;
    }

    @Override
    public String toString() {
        return "AdminOffer{" +
                "id=" + id +
                ", discount=" + discount +
                ", pieces=" + pieces +
                ", gift=" + gift +
                '}';
    }
}
