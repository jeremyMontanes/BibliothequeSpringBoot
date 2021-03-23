package com.example.Bibliotheque.entity;

import java.util.List;

import javax.persistence.Entity;

import com.example.Bibliotheque.interfaceEntity.SuperObject;

@Entity
public class album extends SuperObject{
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
