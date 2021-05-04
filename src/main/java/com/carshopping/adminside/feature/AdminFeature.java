package com.carshopping.adminside.feature;


import javax.persistence.*;

@Entity
@Table(name = "feature" , schema = "dbo")
public class AdminFeature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private
    Long id ;

    @Column(name = "title")
    private
    String title ;

    @Column(name = "name_en")
    private
    String nameEn;

    @Column(name = "name_ar")
    private
    String nameAr ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "AdminFeature{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", nameEn='" + nameEn + '\'' +
                ", nameAr='" + nameAr + '\'' +
                '}';
    }
}
