package com.localbizconnect.model;

//import javax.persistence.*;
import java.util.List;
import java.util.Map;

//@Entity
public class Business {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String services;
    private String location;

//    @ElementCollection
//    @CollectionTable(name = "business_hours", joinColumns = @JoinColumn(name = "business_id"))
//    @MapKeyColumn(name = "day_of_week")
//    @Column(name = "hours")
    private Map<String, String> hoursOfOperation;

//    @OneToMany(mappedBy = "business", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Appointment> appointments;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "login_account_id", referencedColumnName = "id")
    private LoginAccount loginAccount;

    // Constructors, Getters, and Setters
}
