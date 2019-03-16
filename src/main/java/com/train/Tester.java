package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int leave = 0;
        Scanner scanner = new Scanner(System.in);

        while (leave != -1) {
            // 輸入欲購買之票數
            System.out.print("Please enter number of tickets: ");
            int allTickets = scanner.nextInt();
            // 輸入來回票之票數
            System.out.print("How many round-trip tickets: ");
            int roundTrip = scanner.nextInt();

            Ticket ticket = new Ticket(allTickets - roundTrip, roundTrip);
            System.out.println("Total tickets: " + allTickets + "\n" + "Round-trip: " + roundTrip + "\n" + "Total: " + ticket.total());
            // 是否結束本程式
            System.out.println("Do you want to end the service?(if yes, please enter -1): ");
            leave = scanner.nextInt();
        }
    }
}
