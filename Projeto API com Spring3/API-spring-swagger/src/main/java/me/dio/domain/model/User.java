package me.dio.domain.model;

import jakarta.persistence.*;
import java.util.List;


@Entity(name = "td_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade= CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Icons icons;

    @OneToMany(cascade= CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Photos> photos;

    @OneToOne(cascade= CascadeType.ALL)
    private DownBar downBar;

    public Account getAccount() {return account;}
    public DownBar getDownBar() {return downBar;}
    public Icons getIcons() {return icons;}
    public String getName() {return name;}
    public List<Photos> getPhotos() {return photos;}
    public Long getId() {return id;}

    public void setAccount(Account account) {this.account = account;}
    public void setDownBar(DownBar downBar) {this.downBar = downBar;}
    public void setIcons(Icons icons) {this.icons = icons;}
    public void setId(Long id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setPhotos(List<Photos> photos) {this.photos = photos;}
    
}
