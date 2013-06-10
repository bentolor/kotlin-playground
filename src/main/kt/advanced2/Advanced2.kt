package advanced2

import de.exxcellent.toolbox.StringTools


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

fun Java_Library_Nullsafty() {
    val strVal : String = java.lang.String.valueOf(null)
    // val desc : String = StringTools.abbreviate(10, "This is a long string");
}

fun main(args: Array<String>) {
    nullsafety(null)
}
