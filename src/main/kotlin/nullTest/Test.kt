package nullTest

fun main() {
    var a:Int = 1

    //null을 넣고자 할 경우(Nullable)
    var b:Int? = null

//    testSafeCall(null)

//    var res=testSafeCall("hi")
//    println(res)
    println(testSafeCall2("hi"))
    println(testSafeCall2(null))
}

fun testSafeCall(str:String?) : Int?{
//    var result:Int=0
    println(str)
    return null
}

// ?. 안전한 호출
fun testSafeCall2(str:String?) : Int?{
    // str이 null이면 length를 체크하지 않고 null을 반환
//    var resultNull:Int?   = str?.length // resultNull은 null이 가능한(Nullable), resultNull 변수 다음에 ?. 을 사용하면 해당 변수가 null일 경우 ?. 다음의 메서드나 프로퍼티를 호출하지 않는다.
    var resultNull2:Int?   = str ?.length?:0  // ?:을 사용하면 null일 경우 오른쪽의 값이 반환
    return resultNull2
}
