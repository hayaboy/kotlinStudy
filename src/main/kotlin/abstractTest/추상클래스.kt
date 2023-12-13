package abstractTest

// 추상 클래스
//자바랑 똑같음
fun main(){
    var rabbit=Rabbit()
    rabbit.eat()
    rabbit.sniff()
}

abstract class Animal constructor(){

    abstract fun eat()

    fun sniff(){
        println("킁킁")
    }

}

class  Rabbit constructor(): Animal(){
    override fun eat() {
        println("토끼가 냠냠")
    }

}