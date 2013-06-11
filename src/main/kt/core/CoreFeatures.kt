package core


// Type inference
//   parameters must wear a type
//   implicit return type is Unit
fun TypInference(obj : String) {

    // Parameters is a 'val'
    // 'val' are read-only values. Therefore illegal:
    //      obj = "str2"

    // var are r/w
    var s = null

    // s becomes Nothing?. Therefore illegal_
    //      s = "foo"

    // WTF?
    val sub = s?.substring(2)
}