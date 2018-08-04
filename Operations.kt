/*
 * Created by Tanushka Bandara on 6/17/18 6:37 PM
 * Copyright (c) 2018.  All Rights Reserved
 *
 * Last Modified 6/17/18 5:38 PM
 */


fun main (args:Array<String>) {

    println("**** Calculator ****")
    print("Enter first number: ")
    var n1: Float = readLine()!!.toFloat()
    print("Enter second number: ")
    var n2: Float = readLine()!!.toFloat()

    var sum: Float? = n1 + n2
    var sub: Float? = n1 - n2
    var mul: Float? = n1 * n2

    print("Total: $sum\nSub: $sub\nMul: $mul")
}