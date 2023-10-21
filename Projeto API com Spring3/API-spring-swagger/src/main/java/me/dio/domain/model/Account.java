package me.dio.domain.model;

public class Account {
    
    private Long id;
    private String profilePhoto;
    private String accountUsername;
    private int accountFollowers;
    private int accountFollowing;
    private String bio;

    public int getAccountFollowers() {return accountFollowers;}
    public int getAccountFollowing() {return accountFollowing;}
    public String getAccountUsername() {return accountUsername;}
    public String getBio() {return bio;}
    public String getProfilePhoto() {return profilePhoto;}
    
    public void setAccountFollowers(int accountFollowers) {this.accountFollowers = accountFollowers;}
    public void setAccountFollowing(int accountFollowing) {this.accountFollowing = accountFollowing;}
    public void setAccountUsername(String accountUsername) {this.accountUsername = accountUsername;}
    public void setBio(String bio) {this.bio = bio;}
    public void setProfilePhoto(String profilePhoto) {this.profilePhoto = profilePhoto;}

    public void setId(Long id) {this.id = id;}
    public Long getId() {return id;}
}
