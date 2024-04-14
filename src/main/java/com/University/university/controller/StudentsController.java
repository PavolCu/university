package com.University.university.controller;

import com.University.university.entity.Students;
import com.University.university.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private StudentsService studentsService;

    @GetMapping
    public List<Students> getAllStudents() {
        return studentsService.getAllStudents();
    }

}
