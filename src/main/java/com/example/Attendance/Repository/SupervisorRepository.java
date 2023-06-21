package com.example.Attendance.Repository;


import com.example.Attendance.Model.Supervisor;
import com.example.Attendance.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupervisorRepository extends JpaRepository<Supervisor, Long> {
}


