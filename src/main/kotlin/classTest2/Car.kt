package classTest2

class Car {


    var company:String = "hd"   //property
    constructor(){
        println(1)
    }

    constructor(color:String){
        println(color)
    }

    constructor(color:String, model:String){
        println(color + model )
    }

    fun run1(){
        println("달림")
    }
}