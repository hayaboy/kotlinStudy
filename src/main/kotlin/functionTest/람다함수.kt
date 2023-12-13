package functionTest

//람다 함수 c
//(입력 타입)->반환 타입 = {변수이름: 입력타입 -> 구문}
 fun main(){

     var c : (String) -> Unit = {s-> println(s) }

    var d = {s:String -> println(s) }

    var e = {s:String -> s}

    var f = {				//인자가 없는 경우
        println("fff")
    }
    c("ccc")
    d("ddd")
    println(e("eee"))
    f()
}


