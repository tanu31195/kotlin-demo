/*
 * Created by Tanushka Bandara on 6/17/18 6:37 PM
 * Copyright (c) 2018.  All Rights Reserved
 *
 * Last Modified 6/17/18 5:43 PM
 */


fun main (args:Array<String>) {

    //To allow nulls, we can declare a variable as nullable string, written String?
    val name: String?
    name = "Tanushka"
//    name = null

    // !! = should have a value, cannot be null. An explicit call to throw NullPointerException()
//    print(name!!)

    print(name)
}