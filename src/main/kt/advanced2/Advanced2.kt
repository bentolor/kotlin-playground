package advanced2

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

fun Java_Library_Nullsafty() {
    // Call any Java libary. Method returns a List<T> in Java
    val list = Wrap.intoList("A", "B", "C")

    // which would become a List<T>? per default an require
    // list?.get(1);

    // with KAnnotator it infers non-nullability
    println(list.get(1));
}

fun Nullability_I_know_it_better() {
    // KAnnotator fails yet. So we get a <String?>
    val s = StringTools.abbreviate(5, null)

    // this fails:
    //   println(s.toString())

    // I know it better,
    println(s!!.toString())
}

fun main(args: Array<String>) {
    General_Nullsafety()
    Java_Library_Nullsafty()
    Nullability_I_know_it_better()
}
