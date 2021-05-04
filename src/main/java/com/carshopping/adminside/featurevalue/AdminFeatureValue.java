package com.carshopping.adminside.featurevalue;

import javax.persistence.*;

@Entity
@Table(name = "feature_vale", schema = "dbo")
public class AdminFeatureValue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "feature_id")
    private Long featureId;

    @Column(name = "title")
    private String title;

    @Column(name = "name_en")
    private String nameEn;

    @Column(name = "name_ar")
    private String nameAr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Long featureId) {
        this.featureId = featureId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    @Override
    public String toString() {
        return "AdminFeatureValue{" +
                "id=" + id +
                ", featureId=" + featureId +
                ", title='" + title + '\'' +
                ", nameEn='" + nameEn + '\'' +
                ", nameAr='" + nameAr + '\'' +
                '}';
    }
}
