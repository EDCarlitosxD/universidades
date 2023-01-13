package com.university.university.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class University {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String nombreUniversidad;

    private String phone;

    private Long likes;

    private Double latitud;
    
    private Double longitud;


    @ManyToOne()
    @JoinColumn(name = "municipality_id")
    private Municipality municipality;



    @OneToMany(mappedBy = "university",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Careers> careers;
    




    public University(Long id, String nombreUniversidad){
        this.id = id;
        this.nombreUniversidad = nombreUniversidad;
    }
    public University(){}

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombreUniversidad() {
        return nombreUniversidad;
    }
    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }



    @Override
    public String toString() {
        return "University [id=" + id + ", nombreUniversidad=" + nombreUniversidad + "]";
    }


    

}
