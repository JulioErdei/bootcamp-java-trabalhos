package me.dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "td_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne(cascade= CascadeType.ALL)
    private ProfilePhotos profilePhoto;

    @Column(unique=true)
    private String username;

    @Column(precision = 5)
    private int accountFollowers;
    @Column(precision = 5)
    private int accountFollowing;

    private String bio;

    public int getAccountFollowers() {return accountFollowers;}
    public int getAccountFollowing() {return accountFollowing;}
    public String getAccountUsername() {return username;}
    public String getBio() {return bio;}
    public ProfilePhotos getProfilePhoto() {return profilePhoto;}
    
    public void setAccountFollowers(int accountFollowers) {this.accountFollowers = accountFollowers;}
    public void setAccountFollowing(int accountFollowing) {this.accountFollowing = accountFollowing;}
    public void setAccountUsername(String username) {this.username = username;}
    public void setBio(String bio) {this.bio = bio;}
    public void setProfilePhoto(ProfilePhotos profilePhoto) {this.profilePhoto = profilePhoto;}

    public void setId(Long id) {this.id = id;}
    public Long getId() {return id;}
}
