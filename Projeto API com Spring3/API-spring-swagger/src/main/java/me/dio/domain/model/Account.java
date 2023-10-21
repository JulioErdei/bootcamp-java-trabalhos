package me.dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "td_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Photos profilePhoto;

    @Column(unique=true)
    private String accountUsername;

    @Column(scale = 5)
    private int accountFollowers;
    @Column(scale = 5)
    private int accountFollowing;

    private String bio;

    public int getAccountFollowers() {return accountFollowers;}
    public int getAccountFollowing() {return accountFollowing;}
    public String getAccountUsername() {return accountUsername;}
    public String getBio() {return bio;}
    public Photos getProfilePhoto() {return profilePhoto;}
    
    public void setAccountFollowers(int accountFollowers) {this.accountFollowers = accountFollowers;}
    public void setAccountFollowing(int accountFollowing) {this.accountFollowing = accountFollowing;}
    public void setAccountUsername(String accountUsername) {this.accountUsername = accountUsername;}
    public void setBio(String bio) {this.bio = bio;}
    public void setProfilePhoto(Photos profilePhoto) {this.profilePhoto = profilePhoto;}

    public void setId(Long id) {this.id = id;}
    public Long getId() {return id;}
}
