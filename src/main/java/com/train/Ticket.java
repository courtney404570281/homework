package com.train;

import static java.lang.Math.round;

public class Ticket {
    int oneWay;
    int roundTrip;

    public Ticket(int oneWay, int roundTrip) {
        this.oneWay = oneWay;
        this.roundTrip = roundTrip;
    }

    public int total(){
        int total = 1000 * oneWay + round((2000 * roundTrip) * 0.9f);
        return total;
    }
}
