package com.example.Attendance.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Long id;
    private String date;
    private String disc;
    private String time;


//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "project_id", nullable = false)
//   private Project project;



}



