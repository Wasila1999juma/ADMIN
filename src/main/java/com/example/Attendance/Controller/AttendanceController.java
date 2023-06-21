package com.example.Attendance.Controller;


import com.example.Attendance.Model.Attendance;
import com.example.Attendance.Model.Task;
import com.example.Attendance.Service.AttendanceService;
import com.example.Attendance.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;

    @PostMapping("/add")
    public Attendance addAttendance(@RequestBody Attendance s){

        return attendanceService.addAttendance(s);
    }

    @GetMapping("/all")
    public List<Attendance> getAll(){
        return attendanceService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Attendance> getById(@PathVariable Long id){

        return attendanceService.findById(id);
    }

    @PutMapping("/{id}")
    public Attendance updateAttendance(@RequestBody Attendance s,@PathVariable Long id){
        s.setId(id);
        return attendanceService.addAttendance(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        attendanceService.deleteById(id);
    }
}



