package com.example.Attendance.Service;


import com.example.Attendance.Model.Task;
import com.example.Attendance.Model.User;

import com.example.Attendance.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.Id;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public User addUser(User s) {
        return userRepository.save(s);
    }

    public List<User> getAllUser() {
        return (List<User>) this.userRepository.findAll();
    }


    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }
}







