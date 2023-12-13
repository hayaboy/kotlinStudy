package inheritance2

open class Animal constructor(var name:String, var age:Int, var type: String) {
    open fun introduce(){
        println("${this.name}   ${this.age}   ${this.type}")
    }
}

class Dog constructor(var name1:String, var age1:Int) : Animal(name1,age1,"강아지" ){

    override fun introduce() {
//        super.introduce()
        println("override   ${this.name}   ${this.age}   ${this.type}")
    }

}

fun main(){
    var dog=Dog("puppy", 5)
    dog.introduce()
}