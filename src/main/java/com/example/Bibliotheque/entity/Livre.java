package com.example.Bibliotheque.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

@Entity
public class Livre {

    @Id
    @GeneratedValue
    private int id;

    String nom;

    List<String> authors;

    Date dateSortie;

}
