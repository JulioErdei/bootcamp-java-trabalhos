package me.dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_photos")
public class Photos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String photoN;

    public void setPhotoN(String photoN) {this.photoN = photoN;}
    public String getPhotoN() {return photoN;}
    public void setId(Long id) {this.id = id;}
    public Long getId() {return id;}
}
