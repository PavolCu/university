package com.University.university.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String zip;
    private String city;
    private String state;
    private double grade;


}
