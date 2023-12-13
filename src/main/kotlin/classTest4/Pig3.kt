package classTest4

class Pig3 {


    //companion object블록으로 감싸주면 생성과정 없이 오브젝트처럼 사용
    companion object {
        var name:String ="None"

        fun printname1(){
            println("${name}")
        }
    }

    fun walk(){
        println("돼지가 걸어요")
    }

}