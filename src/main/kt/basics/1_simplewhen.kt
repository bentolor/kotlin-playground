package basics.simplewhen

fun main(args: Array<String>) {
    when {
        args.size == 0  -> println("Please provide a name as a command-line argument")
        else            -> println("Hello, ${args[0]}!")
    }
}

