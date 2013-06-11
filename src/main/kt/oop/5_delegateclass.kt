package oop.delegateclass


trait Base {                                // "interface"
    fun print()
}

class BaseImpl(val x : Int) : Base {        // an implementation
    override fun print() { print(x) }
}

class Derived(b : Base) : Base by b         // another, which delegates to b

fun main() {
    val b = BaseImpl(10)
    Derived(b).print() // prints 10
}