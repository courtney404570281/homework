package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number of tickets: ");
        int allTickets = scanner.nextInt();

        System.out.print("How many round-trip tickets: ");
        int roundTrip = scanner.nextInt();

        Ticket ticket = new Ticket(allTickets - roundTrip, roundTrip);
        System.out.println("Total tickets: " + allTickets + "\n" + "Round-trip: " + roundTrip + "\n" + "Total: " + ticket.total());
    }
}
