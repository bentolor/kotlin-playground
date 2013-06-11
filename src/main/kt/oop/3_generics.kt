package oop.generics

// types as in Java
// - no wildcards, instead
//    -  <in T> : T never produced
//    -  <out T>: T never consumed

trait Source<out T> {
    fun nextT() : T
}

trait Comparable<in T> {
    fun compareTo(other : T) : Int
}


fun demo(p1: Source<String>, p2: Comparable<Number>) {

    val sString : Source<String> = p1
    val sAny    : Source<Any> = sString         // ozut - thus we can assign supertype

    val cNum    : Comparable<Number> = p2
    val cDouble : Comparable<Double> = cNum     // in - thus, we can assign a subtype

    p2.compareTo(1.0)                           // 1.0 = Double, subtype of Number
}