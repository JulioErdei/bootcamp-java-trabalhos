package me.dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_downbar")
public class DownBar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String home;
    private String search;
    private String reels;
    private String shop;
    private String profile;

    public String getHome() {return home;}
    public String getProfile() {return profile;}
    public String getReels() {return reels;}
    public String getSearch() {return search;}
    public String getShop() {return shop;}

    public void setHome(String home) {this.home = home;}
    public void setProfile(String profile) {this.profile = profile;}
    public void setReels(String reels) {this.reels = reels;}
    public void setSearch(String search) {this.search = search;}
    public void setShop(String shop) {this.shop = shop;}

    public void setId(Long id) {this.id = id;}
    public Long getId() {return id;}
}
