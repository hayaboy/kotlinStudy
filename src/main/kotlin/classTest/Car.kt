package classTest

//class Car constructor() {
//    init {
//        println("기본 생성자 호출")
//    }
//
//    init {
//        println(1)
//    }
//}

//primary 생성자
class Car  constructor(val color:String){
   init {
      println("${this.color}")
   }
}

//class Car  (val color:String){
//    init {
//        println("${this.color}")
//    }
//}
