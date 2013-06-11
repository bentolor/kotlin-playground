package bugs

open class A() {
    open fun a() { print("a") }
}

open class B(var prop1 : Int)

trait T : B {
    open fun a() { print("a'") }
    open fun b() { print(prop1 + 1) }
}

class C() : A(), T {
    override fun a() {
        super<A>.a() // call to A.a()
        super<T>.a() // call to T.a()
        b()          // call to T.b()
    }
}

fun main(args: Array<String>) {
    // Bug: http://youtrack.jetbrains.com/issue/KT-3006
    C().a() // throws VerifyError: (class: bugs/C, method: a signature: ()V) Incompatible argument to function
}