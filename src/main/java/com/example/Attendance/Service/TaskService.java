package com.example.Attendance.Service;


import com.example.Attendance.Model.Task;
import com.example.Attendance.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task addTask(Task s){
        return taskRepository.save(s);
    }

    public List<Task> getAll(){
        return taskRepository.findAll();
    }

    public Optional<Task> findById(Long id){
        return taskRepository.findById(id);
    }

    public void deleteById(Long id){
        taskRepository.deleteById(id);
    }
}

