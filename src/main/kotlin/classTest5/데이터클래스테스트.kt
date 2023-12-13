package classTest5

fun main() {
// 클래스가 틀
//  val va=A("a",123)
//  println(va)
//  println(A("a",123))
//  println(  va == A("a",123))

//데이터 클래스(간단한 값의 저장 용도)
  val vb=B("b",123)
  println(vb)

  val vb2=B("b",123)
  println(vb2)

  println(  vb == B("b",123))

}

//데이터 클래스(간단한 값의 저장 용도)

class A constructor(val name:String, val id:Int){}

data class B constructor(val name:String, val id:Int){}


