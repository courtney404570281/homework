package com.train

import java.lang.Math.round
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    print("Please enter number of tickets: ")
    var allTickets = scanner.nextInt()

    print("How many round-trip tickets: ")
    val roundTrip = scanner.nextInt()

    val ticket = Tickets(allTickets - roundTrip, roundTrip)
    print("Total tickets: " + allTickets + "\n" + "Round-trip: " + roundTrip + "\n" + "Total: " + ticket.total())
}

class Tickets(var oneWay: Int, var roundTrip: Int){
    fun total(): Int {
        val total = 1000 * oneWay + round((2000 * roundTrip) * 0.9f)
        return total
    }
}