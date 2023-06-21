package com.example.Attendance.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;
@Data
@Entity

@NoArgsConstructor
@AllArgsConstructor

@Table(name ="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String userName;
    private String userLastName;
    private String userPassword;
    private String email;
    private String role;

//    @OneToOne(mappedBy = "user")
//   private Student student;


}
