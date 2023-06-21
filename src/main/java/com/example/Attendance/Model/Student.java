package com.example.Attendance.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;
    private String userName;
    private String regNo;
    private String email;
    private  String password;
    private String program;
    private String level;


//    @OneToOne
//   @JoinColumn(name = "user_id")
//   private User user;
//
//
//   @OneToOne(mappedBy = "student")
//   private Project project;




}
