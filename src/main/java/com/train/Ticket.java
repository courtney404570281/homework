package com.train;

import static java.lang.Math.round;

public class Ticket {
    int oneWay;
    int roundTrip;
    int leave;

    public Ticket(int oneWay, int roundTrip) {
        this.oneWay = oneWay;
        this.roundTrip = roundTrip;
    }

    public int total(){
        // 計價方式：假設只有台北到高雄的票，單程票價1000元，來回票為2000元再打九折
        int total = 1000 * oneWay + round((2000 * roundTrip) * 0.9f);
        return total;
    }

}
