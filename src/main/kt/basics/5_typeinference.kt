package basics.typinfer


// Type inference
//   parameters must wear a type
//   implicit return type is Unit
fun TypInference(obj : String) {

    // Parameters is a 'val'
    // 'val' are read-only values. Therefore illegal:
    //      obj = "str2"
    obj.length()

    // var are r/w
    // s is inferred as <Nothing?>
    var s = null

    // Therefore illegal:
    //      s = "foo"

    // WTF?
    s?.substring(2)
}