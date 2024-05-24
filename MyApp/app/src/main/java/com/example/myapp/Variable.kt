package com.example.myapp

fun main() {
//    println("Hello World")
//    var a: Int=10;
//    a=20
//    println(a)
//    val b: Double=10.26;
//    println(b.toString())

    var a: String="softwarica";
    var sizee: Int= a.length
    var isEqual: Boolean=a.equals("dadadadad")
    var spaced: String="sasasas"
    var sp: String="softwarica college"
    print(a)
    println(a.uppercase())
    println(sizee)
    println(isEqual)
    println(spaced)
    println(spaced.trim())
    println(sp.replace("Softwarica college","Coventry University"))
    println(sp.plus(a))
    println("hello ${sp.length}")
}
