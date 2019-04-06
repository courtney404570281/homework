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

            if (allTickets < 1 || roundTrip < 0) {

                System.out.println("Please enter the TRUE number!");

            } else {

                // 計算票價與張數
                Ticket ticket = new Ticket(allTickets - roundTrip, roundTrip);
                System.out.println("Total tickets: " + allTickets + "\n" + "Round-trip: " + roundTrip + "\n" + "Total: " + ticket.total());

                // 是否繼續交易
                System.out.println("Next Transaction?(if yes, please enter 0. Otherwise, -1)");
                leave = scanner.nextInt();

            }
        }

        System.out.println("Thanks for having me!");

    }
}
