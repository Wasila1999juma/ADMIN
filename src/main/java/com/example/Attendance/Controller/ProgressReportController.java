package com.example.Attendance.Controller;

import com.example.Attendance.Model.ProgressReport;
import com.example.Attendance.Model.Task;
import com.example.Attendance.Service.ProgressReportService;
import com.example.Attendance.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;




@CrossOrigin
@RestController
@RequestMapping("/api/progress")
public class ProgressReportController {
    @Autowired
    private ProgressReportService progressReportService;

    @PostMapping("/add")
    public ProgressReport addProgressReport(@RequestBody ProgressReport s){

        return progressReportService.addProgressReport(s);
    }

    @GetMapping("/all")
    public List<ProgressReport> getAll(){
        return progressReportService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<ProgressReport> getById(@PathVariable Long id){

        return progressReportService.findById(id);
    }

    @PutMapping("/{id}")
    public ProgressReport updateProgress(@RequestBody ProgressReport s,@PathVariable Long id){
        s.setId(id);
        return progressReportService.addProgressReport(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        progressReportService.deleteById(id);
    }
}


