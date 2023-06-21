package com.example.Attendance.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="progressReport")
public class ProgressReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "progressReport_id")
    private Long id;
    private String task;
    private String challenges;
    private String mainAchievement;
    private String supervisorRemark;
    private String regNo;

//    @ManyToOne
//   @JoinColumn(name = "project_id")
//   private Project project;

}


