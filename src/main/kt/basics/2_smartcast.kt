package basics.smartcast

fun smartcast(obj : Any?) {
    // smart cast
    if (obj is String) {
        obj.substring(2)
    }
}
