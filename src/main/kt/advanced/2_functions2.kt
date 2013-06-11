package advanced

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

/* In java wouldn't it be great to transform

    lock.lock()
    try {                               using (lock) {
      // sth                into           // sth
    } finally {                         }
      lock,release
    }

*/

inline fun using(l: Lock, body : () -> Unit) {   // inline: Copy the code
    l.lock()
    try {
        body()
    } finally {
        l.unlock()
    }
}


fun main(args: Array<String>) {
    // The inner block becomes the 2n arg of 'using'
    using(ReentrantLock()) {
        println("Only one at once")
    }
}



// Combined with infix ideal for builders, DSLs, ...