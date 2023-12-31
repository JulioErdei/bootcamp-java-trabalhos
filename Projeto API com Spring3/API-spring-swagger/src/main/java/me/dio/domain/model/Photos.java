package me.dio.domain.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity(name = "tb_photos")
public class Photos {

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
