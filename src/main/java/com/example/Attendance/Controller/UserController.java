package com.example.Attendance.Controller;

import com.example.Attendance.Model.Task;
import com.example.Attendance.Model.User;
import com.example.Attendance.Repository.UserRepository;

import com.example.Attendance.Service.TaskService;
import com.example.Attendance.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;


@RequestMapping("/api/user")
@RestController
@CrossOrigin
public class UserController {


    @Autowired
    private UserService userServices;

    @PostMapping("/add")
    public User addUser(@RequestBody User s) {

        return userServices.addUser(s);
    }

    @GetMapping("/all")
    public List<User> getAll() {
        return userServices.getAllUser();
    }

    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable Long id){

        return userServices.findById(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@RequestBody User s, @PathVariable Long id) {
        s.setId(id);
        return userServices.addUser(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id) {
        userServices.deleteById(id);
    }
}












