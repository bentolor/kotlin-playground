package oop.traits

// traits:
//   - no fields, no constructors
//   - can “require” classes in the set of supertypes
//   - no automatic conflict resolution for overriding

open class A() {
    open fun a() { println("a") }
}

open class B(var prop1 : Int) : A()


trait T1  {
    var b : String                      // "abstract" field b
    open fun a() { println("a'") }      // conflicting with A.a()
    open fun b() { println(b) }
}


trait T2  : B {                         // require & access supertype B
    open fun c() { println(prop1 + 1) }
}

class C(i : Int) : B(i), T1, T2 {       // Only 1 supertype allowed!
    override var b = "b"                // implement 'abstract' field
    override fun a() {                  // Compiler requires conflict clarification here!

        super<B>.a()                    // call to A.a()
        super<T1>.a()                   // call to T.a()
    }
}

fun main(args: Array<String>) {
    C(1).a()
    C(1).b()
    C(1).c()
}