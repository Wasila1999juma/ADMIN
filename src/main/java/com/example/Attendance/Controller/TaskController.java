package com.example.Attendance.Controller;


import com.example.Attendance.Model.Task;
import com.example.Attendance.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/task")
public class TaskController {
    @Autowired
    private TaskService taskServices;

    @PostMapping("/add")
    public Task addTask(@RequestBody Task s){

        return taskServices.addTask(s);
    }

    @GetMapping("/all")
    public List<Task> getAll(){
        return taskServices.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Task> getById(@PathVariable Long id){

        return taskServices.findById(id);
    }

    @PutMapping("/{id}")
    public Task updateTask(@RequestBody Task s,@PathVariable Long id){
        s.setId(id);
        return taskServices.addTask(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        taskServices.deleteById(id);
    }
}


