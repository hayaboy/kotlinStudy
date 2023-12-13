//고차함수 : 함수를 클래스에서 만들어낸 인스턴스처럼 취급하는 방법
//-> 함수를 파라미터로 넘겨줄 수 있음
//-> 결과값으로도 반환받을 수 있음.

// Unit : 자바의 void

 fun main(){
//    var msg=a("hi")
//     println(msg)
     b(::a) //함수를 넘겨줄때 ::을 붙인다.
}

fun a(str:String):String{
//    println(str)
    return str
}

//funs라는 고차함수
//b함수의 매개변수로 a 함수를 넣음
fun b(funs: (String)->String) : Unit{
    println(funs("ttt"))
}