package com.example.Bibliotheque.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import com.example.Bibliotheque.interfaceEntity.SuperObject;


@Entity
public class Livre extends SuperObject{

    String nom;

    List<String> authors;

    Date dateSortie;

    protected Livre() {};    
    public Livre(List<String> authors, String nom)
    {
        this.nom = nom;
        this.authors = authors;
    }

    public List<String> getAuthors(){
        return authors;
    }

    public String getNom(){
        return nom;
    }

}
