package com.University.university.service;


import com.University.university.repository.TeachersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.University.university.entity.Teachers;
import java.util.List;
@Service
public class TeachersService {

    @Autowired
    private TeachersRepository teachersRepository;

    public List<Teachers> getAllTeachers() {
        return teachersRepository.findAll();
    }

    public Teachers createTeacher(Teachers teacher) {
        return teachersRepository.save(teacher);
    }
}
