package com.wedding.snap.DAO;

import jakarta.persistence.*;

    @Entity
    @Table(name = "person")
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long user_id;

        @Column
        private String name;

        @Column
        private boolean isAdmin;
    }