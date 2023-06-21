package com.example.Attendance.Service;

import com.example.Attendance.Model.Attendance;
import com.example.Attendance.Model.Project;
import com.example.Attendance.Repository.AttendanceRepository;
import com.example.Attendance.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttendanceService   {
    @Autowired
    private AttendanceRepository attendanceRepository;

    public Attendance addAttendance(Attendance s){
        return attendanceRepository.save(s);
    }

    public List<Attendance> getAll(){
        return attendanceRepository.findAll();
    }

    public Optional<Attendance> findById(Long id){
        return attendanceRepository.findById(id);
    }

    public void deleteById(Long id){
        attendanceRepository.deleteById(id);
    }
}



