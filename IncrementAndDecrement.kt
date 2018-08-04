/*
 * Created by Tanushka Bandara on 6/17/18 6:43 PM
 * Copyright (c) 2018.  All Rights Reserved
 * https://tanu31195.github.io/
 *
 * Last Modified 6/17/18 6:37 PM
 */


fun main(args: Array<String>) {

    var x = 10
    var y = 11

    var z = x + y
    var z1 = ++x //(++x) (x = x + 1) // (--x) (x = x - 1)
    var z2 = x++

    //++x affects current step, x++ affects next step

    println("$z $z1 $z2")
}