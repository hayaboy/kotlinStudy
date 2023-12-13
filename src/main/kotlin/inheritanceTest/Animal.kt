package inheritanceTest

open class Animal constructor() {
    var name:String="aa"

    open fun breathe(){
        println("breathe")
    }
}