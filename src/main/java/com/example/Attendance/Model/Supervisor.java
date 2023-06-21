package com.example.Attendance.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="supervisor")
public class Supervisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supervisor_id")
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String stuName;
    private String year;

//    @OneToMany(mappedBy = "supervisor", cascade = CascadeType.ALL)
//    private List<Project> projects;

}
