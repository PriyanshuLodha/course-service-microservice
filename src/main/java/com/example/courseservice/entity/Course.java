package com.example.courseservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "COURSES")
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String image;
    private String description;
    private String price;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="highlight_id")
    private Highlights highlights;
}
