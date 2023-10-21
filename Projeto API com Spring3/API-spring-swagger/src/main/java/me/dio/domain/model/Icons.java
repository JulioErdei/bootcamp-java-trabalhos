package me.dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_icons")
public class Icons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String icon1;
    private String icon2;

    public String getIcon1() {return icon1;}
    public String getIcon2() {return icon2;}

    public void setIcon1(String icon1) {this.icon1 = icon1;}
    public void setIcon2(String icon2) {this.icon2 = icon2;}
    public void setId(Long id) {this.id = id;}
    public Long getId() {return id;}
}
