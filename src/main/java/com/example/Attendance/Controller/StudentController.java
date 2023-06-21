package com.example.Attendance.Controller;

import com.example.Attendance.Model.Student;
import com.example.Attendance.Model.Task;
import com.example.Attendance.Service.StudentService;
import com.example.Attendance.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student s){

        return studentService.addStudent(s);
    }

    @GetMapping("/all")
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Student> getById(@PathVariable Long id){

        return studentService.findById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@RequestBody Student s,@PathVariable Long id){
        s.setId(id);
        return studentService.addStudent(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        studentService.deleteById(id);
    }
}




