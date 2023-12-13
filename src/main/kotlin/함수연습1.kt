
//fun f1(){
//    println("hi")
//}

fun main() {
//    f1()
    f2("사탕")
//    var gift=f3()
//    println(gift)

//    var gift2=f4("사탕")
//    println(gift2)
}

fun f1(){  // X,X
    println("hi")
}
fun f2(gift:String, cnt:Int =1 ){   // O,X
    println(gift + cnt+" 받음")
}
fun f3(): String {   // X,O
    return "초콜렛"
}
fun f4(gift: String): String {   // X,O
    println(gift+" 받음")
    return "초콜렛"
}
