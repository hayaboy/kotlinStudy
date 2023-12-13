fun main() {
    var result1=add(1,2,3)
    println(result1)
}

//단일 표현식 함수
//int a,b,c를 더하므로 반환형 타입이 int라 추론 가능
fun add(a:Int, b:Int,c:Int ) = a+b+c

//fun add(a:Int, b:Int,c:Int ):Int = a+b+c



