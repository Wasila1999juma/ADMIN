package com.example.Attendance.Repository;


import com.example.Attendance.Model.Student;
import com.example.Attendance.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
