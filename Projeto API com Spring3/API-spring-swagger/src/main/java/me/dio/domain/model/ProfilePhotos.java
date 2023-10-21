package me.dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_ProfPhotos")
public class ProfilePhotos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String photo;
    private String description;

    public void setPhoto(String photo) {this.photo = photo;}
    public String getPhoto() {return photo;}
    public void setDescription(String description) {this.description = description;}
    public String getDescription() {return description;}
    public void setId(Long id) {this.id = id;}
    public Long getId() {return id;}
}