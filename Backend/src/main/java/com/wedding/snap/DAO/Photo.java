package com.wedding.snap.DAO;

import jakarta.persistence.*;

@Entity
@Table(name = "photo")
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id")
    private Long id;

    @Lob
    @Column(name = "photo_data", columnDefinition = "bytea")
    private byte[] photoData;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "likes")
    private int likes;

}
