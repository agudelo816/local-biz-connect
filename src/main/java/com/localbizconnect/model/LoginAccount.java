package com.localbizconnect.model;

import javax.persistence.*;

@Entity
public class LoginAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    private String hashedPassword;

    @OneToOne(mappedBy = "loginAccount")
    private Business business;

    // Constructors, Getters, and Setters
}
