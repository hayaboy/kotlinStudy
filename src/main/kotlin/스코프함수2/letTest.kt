package 스코프함수2

fun main() {


    var fruits=mutableListOf("Apple","Banana")

    val result=fruits.let {
        it.add("Mellon")
        it.count()

    }


    println(result)
}