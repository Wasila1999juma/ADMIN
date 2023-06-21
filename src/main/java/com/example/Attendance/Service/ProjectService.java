package com.example.Attendance.Service;


import com.example.Attendance.Model.Project;
import com.example.Attendance.Model.Task;
import com.example.Attendance.Repository.ProjectRepository;
import com.example.Attendance.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project addProject(Project s){
        return projectRepository.save(s);
    }

    public List<Project> getAll(){
        return projectRepository.findAll();
    }

    public Optional<Project> findById(Long id){
        return projectRepository.findById(id);
    }

    public void deleteById(Long id){
        projectRepository.deleteById(id);
    }
}


