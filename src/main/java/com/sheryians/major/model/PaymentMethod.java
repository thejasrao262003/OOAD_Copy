package com.sheryians.major.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "payment_method_id")
    private int id;
    private String name;
}
// Add other properties as needed