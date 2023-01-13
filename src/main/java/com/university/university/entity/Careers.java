package com.university.university.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

@Entity
public class Careers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200)
    private String career_name;


    @Lob
    @Column(nullable = false,unique = false)
    private String description;


    @Lob
    @Column(nullable = false,unique = false)

    private String objective;

    @Lob
    @Column(nullable = false,unique = false)
    private String learning;


    @Lob
    @Column(nullable = false,unique = false)
    private String yourJob;

    @Column(nullable = false,unique = false)
    private String admissionProfileString;

    @Column(nullable = false,unique = false)
    private String graduateProfile;


    private Long likes;
    
    @ManyToOne()
    @JoinColumn(name = "university_id")
    private University university;

}