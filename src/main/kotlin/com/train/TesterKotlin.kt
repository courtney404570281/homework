package com.train

import java.lang.Math.round
import java.util.*

fun main() {
    var leave = 0
    val scanner = Scanner(System.`in`)

    while (leave != -1) {

        // 輸入欲購買之票數
        print("Please enter number of tickets: ")
        var allTickets = scanner.nextInt()

        // 輸入來回票之票數
        print("How many round-trip tickets: ")
        val roundTrip = scanner.nextInt()

        if (allTickets < 1 || roundTrip < 0) {

            println("Please enter the TRUE number!")

        } else {

            // 計算票價與張數
            val ticket = Tickets(allTickets - roundTrip, roundTrip)
            print("Total tickets: " + allTickets + "\n" + "Round-trip: " + roundTrip + "\n" + "Total: " + ticket.total())

            // 是否繼續交易
            println("Next Transaction?(if yes, please enter 0. Otherwise, -1)")
            leave = scanner.nextInt()
        }

    }

    println("Thanks for having me!")
}

class Tickets(var oneWay: Int, var roundTrip: Int){

    fun total(): Int {
        // 計價方式：假設只有台北到高雄的票，單程票價1000元，來回票為2000元再打九折
        val total = 1000 * oneWay + round((2000 * roundTrip) * 0.9f)
        return total
    }
}