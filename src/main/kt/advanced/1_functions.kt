package advanced.functions

class Sum {
    var sum : Int = 0

    fun add(howmuch: Int) : Int  {  sum += howmuch; return sum }

    fun apply(operation : (x : Int) -> Int) {
        sum = operation(sum)
    }
}

fun main(args: Array<String>) {
    val sum = Sum()

    // First-class / higher order fuction
    sum.apply { s -> s / -2 }
    println(sum.sum)

    // Alternativ infix equivalent
    sum.add(1)
    sum add 1
    println(sum.sum)

}


