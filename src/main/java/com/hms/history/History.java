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

    public History (Date date, String narrative, int staffId) {
        Random rand = new Random();
        this.id  = rand.nextInt(1000);
        this.date = date;
        this.narrative = narrative;
        this.staffId = staffId;
    }
}
