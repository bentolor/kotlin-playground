package advanced.whenadvanced

import basics.extensions.isOdd                          // Extension req' import!


fun if_else_on_drugs(obj : Any?)  {
    when (obj) {
        is String -> Integer.parseInt(obj) - 1          // smartcast to String
        is Int -> obj + 1
        !is Number -> "Not even a number"
        else -> "No clue what to do"                    // else mandatory
    }
}

fun if_else_on_speed(num : Int) : String {
    return when (num) {
        0 -> "Zero"
        1, 2, 3 -> "One, two or three"
        in 4..100 ->                                    // Ranges
        if (num.isOdd())
               "An odd number between 5 und 99"
           else
               "An equal number between 5 und 99"       // Future: 'continue' possible
        in 100..100000 -> "A large number"
        else -> "Some number"
    }
}

fun main(args: Array<String>) {
    println(if_else_on_speed(13))
    println(if_else_on_speed(130))
    println(if_else_on_speed(1))
    println(if_else_on_speed(-1))
}