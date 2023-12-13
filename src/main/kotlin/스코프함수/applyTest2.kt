package 스코프함수


// 함수형 언어를 좀 더 편리하게 사용할 수 있도록 하는 기본 함수

// apply, run(apply랑 똑같은 기능이지만 마지막 구문에 있는 값을 반환해주는 차이가 있음), with (run이랑 똑같지만 사용법만 다름 , a.run -> with(a)  ) arw

// also, let이 있음, also, let의 공통된 차이점은 it키워드를 사용해 객체 변수를 참조한다는 것.

//apply
//인스턴스의 값을 람다함수를 사용해 변경할 수 있는 함수 그리고 변경된 객체를 반환
//예제를 보고 이해하는게 빠르다
//장점 : 코드가 깔끔해짐

fun main() {
    var a = Book("a", 20000)
    //apply 스코프람다함수를 통해 a객체의 속성과 함수 변경및 사용가능
    a.apply {
        a.name = "apply ${name}"
        dc()
    }

//    var b=a.run {
//        name = "apply $name"
//        dc()
//        "b"
//    }

    var b=with(a)  {
        name = "apply $name"
        dc()
        "b_with"
    }

//    a.printName()
    println(b)
}

class Book constructor(var name:String, var price:Int){
    fun dc(){
        price -=2000
    }

    fun printName(){
        println("${name}   ${price}")
    }
}