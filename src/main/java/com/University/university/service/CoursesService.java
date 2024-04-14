package com.University.university.service;



import com.University.university.repository.CoursesRepository;
import com.University.university.entity.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CoursesService {

    @Autowired
    private CoursesRepository coursesRepository;

    public List<Courses> getAllCourses() {
        return coursesRepository.findAll();
    }

    public Courses createCourse(Courses course) {
        return coursesRepository.save(course);
    }
}
