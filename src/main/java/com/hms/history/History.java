package com.hms.history;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.Random;
@Entity
public class History {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int id;
    public Date date;
    public String narrative;
    public int staffId;

    public History() {
    }

}
