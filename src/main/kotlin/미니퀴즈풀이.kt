fun main(){

//   var res1 = plus(1,2)
//    println(res1)
//    var res2=sum(10)
//    println(res2)

    printString("hi")

}

fun plus(x:Int, y:Int):Int{
    return x+y
}

fun sum(x:Int):Int{
    var result =0
    for (i in 0..x){
        result += i
    }
    return result
}


fun printString(word:String):Unit{
    println(word)
}