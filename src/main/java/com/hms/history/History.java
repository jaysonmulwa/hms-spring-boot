package com.hms.history;

import java.util.Date;
import java.util.Random;

public class History {

    public int historyId;
    public Date date;
    public String narrative;
    public int staffId;

    public History (Date date, String narrative, int staffId) {
        Random rand = new Random();
        this.historyId  = rand.nextInt(1000);
        this.date = date;
        this.narrative = narrative;
        this.staffId = staffId;
    }
}
