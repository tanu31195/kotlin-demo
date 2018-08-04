/*
 * Created by Tanushka Bandara on 6/17/18 6:37 PM
 * Copyright (c) 2018.  All Rights Reserved
 *
 * Last Modified 6/17/18 4:09 PM
 */


fun main (args: Array<String>) {

    print("Please Enter your name: ")
    var name = readLine()
    print("Please Enter your age: ")
//    var age = readLine() //takes as string
    var age:Int = readLine()!!.toInt()

    println("\n**** Output **** \nYour Name: $name\nYour Age: $age")
}