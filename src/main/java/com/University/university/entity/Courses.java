package com.University.university.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
@Entity
public class Courses{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String courseName;
    private int teacherId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String courseDescription;
    private int creditsCourse;
}
