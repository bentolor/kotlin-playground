package advanced2


fun nullsafety(obj: Any?) {
    // would fail:
    //    obj.hashCode()

    // Conditional execution
    obj?.hashCode()

    // Smart cast
    if (obj != null) {
        // Any? -> Any
        obj.hashCode()
    }

    // Overriden methods taking Any?
    println(obj.toString())
}

fun main(args: Array<String>) {
    nullsafety(null)
}
