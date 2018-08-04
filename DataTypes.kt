/*
 * Created by Tanushka Bandara on 6/17/18 6:37 PM
 * Copyright (c) 2018.  All Rights Reserved
 *
 * Last Modified 6/17/18 3:19 PM
 */


fun main (args:Array<String>) {

    //var: can be read and write
    var x = 2
    var y = 20

    var age = x + y

    //val is read only (same as 'final' modifier in java)
    //val age = x + y
//    age = 23

    var name = "Tanushka"

    //? says the value can be nullable (allow nulls)
    var job: String?

    job = "Trainee Software Engineer"

//    println("Name: " + name + "\n" + "Age: " + age + "\n" + "Job: " + job )
    println("Name: $name\nAge: $age\nJob: $job")

    //add F to number when using floats
    var pi:Float = 3.4F
    var pid:Double = 3.4

    println("F: "+ pi + "\nD: " + pid)
}