package oop


// A simple class
class Example1(param1 : Int, param2 : Int) {
    val prop1 = param1  // ro
    var prop2 = param2  // rw
}


// class usage
fun createExample() {
    // no "new" required
    val e1 = Example1(1,2)

    //e1.prop1 = 2
    e1.prop2 = 4
}


// Shorthand
class Example2(val prop1 : Int, var prop2 : Int)


// non-final
open class Example3(val prop1 : Int, var prop2 : Int) {
    open fun A(a : Int) = a + 1
}


// Derived classes.  Base-type _must_ be init'ed here!
class Example4(prop2 : Int) : Example3(1, prop2) {

    // overriden func
    override fun A(a: Int): Int = a - 1
}