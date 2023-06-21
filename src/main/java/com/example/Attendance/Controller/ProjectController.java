package com.example.Attendance.Controller;

import com.example.Attendance.Model.Project;
import com.example.Attendance.Model.Task;
import com.example.Attendance.Service.ProjectService;
import com.example.Attendance.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


    @CrossOrigin
    @RestController
    @RequestMapping("/api/project")
    public class ProjectController {
        @Autowired
        private ProjectService projectService;

        @PostMapping("/add")
        public Project addProject(@RequestBody Project s){

            return projectService.addProject(s);
        }

        @GetMapping("/all")
        public List<Project> getAll(){
            return projectService.getAll();
        }

        @GetMapping("/{id}")
        public Optional<Project> getById(@PathVariable Long id){

            return projectService.findById(id);
        }

        @PutMapping("/{id}")
        public Project updateProject(@RequestBody Project s,@PathVariable Long id){
            s.setId(id);
            return projectService.addProject(s);
        }

        @DeleteMapping("/{id}")
        public void deleteMe(@PathVariable Long id){
            projectService.deleteById(id);
        }
    }




