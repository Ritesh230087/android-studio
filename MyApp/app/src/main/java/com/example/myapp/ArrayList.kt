package com.example.myapp

fun main() {
//    var data= arrayListOf<Any>("Ram","Sita")
//    var a= mutableListOf<String>("Ram","Sita")
//    a.add("Shyam")
//    println(a)
//    data[0]="shyam"


//fun main(Array<String>) {
    var b=mapOf(
        "Nepal" to "Beautiful Country",
        "Apple" to "fruit",
    )
    println("Enter any words:")
    var word : String=readln()
    var result: String= b[word].toString()
    println("The meaning of $word is")
}