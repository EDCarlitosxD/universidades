package com.university.university.entity;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "municipalities")
public class Municipality {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false,length = 200,unique = true)
    private String nameMunicipality;
  

    @OneToMany(mappedBy = "municipality",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<University> universities;


    
    @ManyToOne()
    @JoinColumn(name = "id_state")
    private State state;

  



    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }








}
