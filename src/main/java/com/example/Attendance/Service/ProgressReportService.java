package com.example.Attendance.Service;


import com.example.Attendance.Model.ProgressReport;
import com.example.Attendance.Model.Task;
import com.example.Attendance.Repository.ProgressReportRepository;
import com.example.Attendance.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgressReportService {
    @Autowired
    private ProgressReportRepository progressReportRepository;

    public ProgressReport addProgressReport(ProgressReport s){
        return progressReportRepository.save(s);
    }

    public List<ProgressReport> getAll(){
        return progressReportRepository.findAll();
    }

    public Optional<ProgressReport> findById(Long id){
        return progressReportRepository.findById(id);
    }

    public void deleteById(Long id){
        progressReportRepository.deleteById(id);
    }
}


