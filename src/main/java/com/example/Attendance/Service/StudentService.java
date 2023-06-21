package com.example.Attendance.Service;


import com.example.Attendance.Model.Student;
import com.example.Attendance.Model.Task;
import com.example.Attendance.Repository.StudentRepository;
import com.example.Attendance.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student s){
        return studentRepository.save(s);
    }

    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    public Optional<Student> findById(Long id){
        return studentRepository.findById(id);
    }

    public void deleteById(Long id){
        studentRepository.deleteById(id);
    }
}


