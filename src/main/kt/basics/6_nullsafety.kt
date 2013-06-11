package basic.nullsafty

import de.exxcellent.toolbox.Wrap
import de.exxcellent.toolbox.StringTools

fun General_Nullsafety() {
    val obj: String? = null
    // would fail:
    //    obj.hashCode()

    // Safecall
    obj?.hashCode()

    // Nested safecall & type inference
    val s = null
    s?.substring(1)

    // Smart cast
    if (obj != null) {
        // Any? -> Any
        obj.hashCode()
    }

    // Overriden methods taking Any?
    println(obj.toString())

    // Evlis operator
    val r = obj?.substring(2) ?: "nope"
    println(r)
}

fun main(args: Array<String>) {
    General_Nullsafety()
}
