fun main(){

//    if(true){
//        println("hi")
//    }
//
//    if(false){
//        println("hi")
//    }

//    if(false){
//        println("hi")
//    }else{
//        println("hi2")
//    }

//    var score=60
//    //90<==score<==100 'A'
//    //80<==score<90 'B'
//    //70<==score<80 'C'
//    //0<=score<70 'D'
//
//    if(score >=90){
//        println("A")
//    }else if(score >=80){
//        println("B")
//    }else if(score >=70){
//        println("C")
//    }else{
//        println("D")
//    }



//    변수에 직접 if문 사용


//    var a=5
//    var b=8
//
//   var bigger = if(a>b){
//        a
//    }else{
//        b
//    }
//
//    println(bigger)


//    var a=5
//    var b=9
//
//    var bigger = if(a>b) a  else b
//
//    println(bigger)



//    var a=5
//    var b=3
//
//    var bigger = if(a>b){
//        // 여러 줄일 경우 마지막 줄을 변수값으로 사용
//        var c=30
//        a
//    }   else {
//     b
//    }
//
//    println(bigger)

    var eraOfRye=2.32
    var eraOfDegrom=2.43

    var era = if(eraOfRye<eraOfDegrom){
        // 여러 줄일 경우 마지막 줄을 변수값으로 사용
        println("2019 류현진이 디그롬을 이김")
        eraOfRye
    }   else {
        println("2019 디그롬이 유현진을 이김")
        eraOfDegrom
    }

    println("2019 MLB에서 가장 높은 ERA는 ${era}")







}