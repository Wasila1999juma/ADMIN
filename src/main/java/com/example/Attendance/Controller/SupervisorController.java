package com.example.Attendance.Controller;

import com.example.Attendance.Model.Supervisor;
import com.example.Attendance.Model.Task;
import com.example.Attendance.Service.SupervisorService;
import com.example.Attendance.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/supervisor")

public class SupervisorController {


    @Autowired
    private SupervisorService supervisorService;

    @PostMapping("/add")
    public Supervisor addSupervisor(@RequestBody Supervisor s){

        return supervisorService.addSupervisor(s);
    }

    @GetMapping("/all")
    public List<Supervisor> getAll(){
        return supervisorService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Supervisor> getById(@PathVariable Long id){

        return supervisorService.findById(id);
    }

    @PutMapping("/{id}")
    public Supervisor updateSupervisor(@RequestBody Supervisor s, @PathVariable Long id){
        s.setId(id);
        return supervisorService.addSupervisor(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        supervisorService.deleteById(id);
    }
}


