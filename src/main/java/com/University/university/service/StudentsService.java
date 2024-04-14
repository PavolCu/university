package com.University.university.service;

import com.University.university.entity.Students;
import com.University.university.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {

    @Autowired
    private StudentsRepository studentsRepository;

    public List<Students> getAllStudents() {
        return studentsRepository.findAll();
    }

    public Students createStudent(Students student) {
        return studentsRepository.save(student);
    }

}
