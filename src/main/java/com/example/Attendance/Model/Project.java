package com.example.Attendance.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table(name ="project")
    public class Project {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "project_id")
        private Long id;
        private String proName;
        private String supervisorName;
        private String year;
        private String stdName;
        private String regNo;

//        @ManyToOne
//        @JoinColumn(name = "supervisor_id")
//        private Supervisor supervisor;



//        @OneToOne
//        @JoinColumn(name = "student_id")
//    private Student student;

//        @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
//       private List<Task> tasks;
//  @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Attendance> attendances = new ArrayList<>();
//
//
//
//    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
//    private List<ProgressReport> progressReports;
    }
