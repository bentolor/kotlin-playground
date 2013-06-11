package basics.helloname

fun main(args: Array<String>) {
    if (args.size == 0)
        println("Please provide a name as a command-line argument")
    else
        println("Hello, ${args[0]}!")
}
