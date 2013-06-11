package basics.safecast

fun safecast(aObj : Any) : Int {
    // safe case + elvis operator
    return (aObj as? Int) ?: -1
}

fun main(args: Array<String>) {
    println(safecast("Foo"))
    println(safecast(12))
}
