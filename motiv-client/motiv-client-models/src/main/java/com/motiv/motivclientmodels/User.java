package com.motiv.motivclientmodels;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    //public User(int id) {
    //    this.id = id;
    //}

    @Id
    @GeneratedValue
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
