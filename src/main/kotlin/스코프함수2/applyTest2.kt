package 스코프함수2

//let/also

//apply = also
//run = let
//기능은 위처럼 같다
//
//하지만 also, let의 공통된 차이점은 it키워드를 사용해 객체 변수를 참조한다는 것.
//이유는 같은 이름 변수로 혼동이 올 수 있기 때문

fun main() {
    var price = 5000
    var a = Book("a", 20000)
//    a.run{
//        //20000원이 출력되야하지만 main문의 price가 스코프 우선순위가 높아 5000원 출력
//        println(price)
//    }
    a.let {    //let을 사용할 경우(also도 동일)
        println(it.price)
    }
}

class Book constructor(var name:String, var price:Int){

}