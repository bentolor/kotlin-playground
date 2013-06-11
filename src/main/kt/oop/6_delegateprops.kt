package oop.delegateprops

import kotlin.properties.Delegates


// delegate properties

class BeanWithDelegatedProperties {
    var delegatedProperty : String by MyStringDelegate()

    // Standard-Delegate Implementation available, i.e.
    //      Delegates.notNull/lazy/observable/vetoable/mapVar
    val lazyProperty : Long by Delegates.lazy { System.currentTimeMillis() }
}

class MyStringDelegate {
    fun get(thisRef: Any?, prop: PropertyMetadata): String {
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    fun set(thisRef: Any?, prop: PropertyMetadata, value: String) {
        println("$value has been assigned")
    }
}

fun main(args: Array<String>) {
    val b2 = BeanWithDelegatedProperties()
    b2.delegatedProperty = "Foo"
    println(b2.delegatedProperty)

    println("Now : ${System.currentTimeMillis()}")
    Thread.sleep(1)
    println("Lazy property ${b2.lazyProperty}")
}



