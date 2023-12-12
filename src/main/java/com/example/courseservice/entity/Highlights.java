package com.example.courseservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "highlights")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Highlights {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HIGHLIGHT_ID")
    private Integer id;
    private String des1;
    private String des2;
    private String des3;
    private String des4;
    private String des5;
    private String des6;
}
