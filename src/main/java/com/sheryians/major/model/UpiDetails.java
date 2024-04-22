package com.sheryians.major.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// UpiDetails model class
@Entity
public class UpiDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mobileNumber;
    private String bankName;
    private String upiPassword;

    // Constructors, getters, and setters
}

