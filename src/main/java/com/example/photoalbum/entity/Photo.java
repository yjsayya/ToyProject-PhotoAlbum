package com.example.photoalbum.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter @Setter
public class Photo {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="photo_id")
    private Long id;

    private String file_name;
    private String thumb_url;
    private String original_url;

    private int file_size;
    private LocalDate uploaded_at;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="album_id")
    private Album album;

} // photo entity