package com.example.Attendance.Service;


import com.example.Attendance.Model.Supervisor;
import com.example.Attendance.Model.Task;
import com.example.Attendance.Repository.SupervisorRepository;
import com.example.Attendance.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupervisorService {
    @Autowired
    private SupervisorRepository supervisorRepository;

    public Supervisor addSupervisor(Supervisor s){
        return supervisorRepository.save(s);
    }

    public List<Supervisor> getAll(){
        return supervisorRepository.findAll();
    }

    public Optional<Supervisor> findById(Long id){
        return supervisorRepository.findById(id);
    }

    public void deleteById(Long id){
        supervisorRepository.deleteById(id);
    }
}


