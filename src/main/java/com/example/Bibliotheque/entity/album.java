package com.example.Bibliotheque.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class album {

    @GeneratedValue
    private long id;
    private List<musique> nombreChanson;
    private String nomGroupe;

    protected album() {};    
    public album(List<musique> nombreChanson, String nomGroupe)
    {
        this.nomGroupe = nomGroupe;
        this.nombreChanson = nombreChanson;
    }

    public List<musique> getNombreChanson(){
        return nombreChanson;
    }

    public String getNomGroupe(){
        return nomGroupe;
    }



    
}
