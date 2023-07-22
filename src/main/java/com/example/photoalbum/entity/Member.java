package com.example.photoalbum.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="member_id")
    private Long id;

    @Column(name="user_id")
    private String userID;

    @Column(name="user_pw")
    private String userPW;

    @Column(name="user_name")
    private String userName;

    private LocalDate created_at;

    private LocalDate login_at;

    @OneToMany(mappedBy = "member")
    private List<Album> albums = new ArrayList<>();

} // member entity