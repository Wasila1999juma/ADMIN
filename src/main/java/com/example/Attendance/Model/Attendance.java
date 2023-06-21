package com.example.Attendance.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendance_id")
    private Long id;
    private String date;
    private Time time;
    private String disc;

    private String stuName;
    private  String supervisorName;
    private String task;

//   @ManyToOne
//    @JoinColumn(name = "attendance_id")
//    private Attendance attendance ;

}



