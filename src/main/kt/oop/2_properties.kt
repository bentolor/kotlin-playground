package oop.properties

open class Bean() {
    // var p0 : String                  // invalid. Must be initalized!
    var p1 : String = "Foo"
    var p2 : Int                        // Manual getter/setters
        get() = 1
        set(value) { println(value) }
}



fun main(args: Array<String>) {
    val b1 = Bean()
    println(b1.p2)
    b1.p2 = 5
}

