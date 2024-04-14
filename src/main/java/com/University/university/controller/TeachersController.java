package com.University.university.controller;


import com.University.university.entity.Teachers;
import com.University.university.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeachersController {

    @Autowired
    private TeachersService teachersService;

    @GetMapping
    public List<Teachers> getAllTeachers() {
        return teachersService.getAllTeachers();
    }
}
