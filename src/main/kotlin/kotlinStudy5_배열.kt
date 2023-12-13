fun main(){

//   var intArr =  arrayOf(1,2,3,4,5)
//
//    println(intArr)
//    println(intArr[0])
//int형으로 1 2 3 4 배열 생성
//    var intArr: Array<Int> =  arrayOf(1,2,3,4,5)
//    println(intArr)
//    println(intArr[0])
//
//    //type 생략 가능
//    var intArr2 = arrayOfNulls<Int>(5)
//    println(intArr2)
//    println(intArr2[0])

    var strArr3 = arrayOf<String>("월","화","수")
//    println(strArr3)
//    println(strArr3[0])
//    println(strArr3.size)


    strArr3.set(0,"일")

    var str1=strArr3.get(0)
    println(str1)

//    for (i in 0..2){
//        println(strArr3[i])
//    }





}