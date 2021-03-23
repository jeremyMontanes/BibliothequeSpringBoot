package com.example.Bibliotheque.interfaceEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class SuperObject {
    
    @GeneratedValue
    private int id;
    private String name;

    protected SuperObject() {};
    public SuperObject(String name)
    {
        this.name= name;
    }

    public String getName()
    {
        return name;
    }
}
