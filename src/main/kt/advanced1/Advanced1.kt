package advanced

fun smartcast(obj : Any?) {
    // smart cast
    if (obj is String) {
        obj.substring(2)
    }

}

// smart cast, pattern matching
fun if_else_on_drugs(obj : Any?)  {
    when (obj) {
        is String -> Integer.parseInt(obj) - 1
        is Int -> obj + 1
        !is Number -> "Not even a number"
        else -> "No clue what to do"
    }
}

fun if_else_on_speed(num : Int) : String {
    // Ranges
    return when (num) {
        0 -> "Zero"
        1, 2, 3 -> "One, two or three"
        in 4..100 ->
           if (num.isOdd())
               "An odd number between 5 und 99"
           else
               // continue - not yet implemented
               "An equal number between 5 und 99"
        in 100..100000 -> "A large number"
        else -> "Some number"
    }
}

// extension function
//
fun Int.isOdd() : Boolean =  this % 2 != 0

fun main(args: Array<String>) {
    println(if_else_on_speed(13))
    println(if_else_on_speed(130))
    println(if_else_on_speed(1))
    println(if_else_on_speed(-1))
}