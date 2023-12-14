import java.util.SimpleTimeZone

fun main(){

//    var immutableList =listOf(1,2,3)
//    println(immutableList[0])
//    listOf  리스트 자체에 변경(추가할 수 없음)을 가할 수 없음

    println("-------------------------")
//    immutableList[0] set이 없음


    // mutableList
//    var mutableList = mutableListOf(1,2,3)
//    //    mutableListOf  리스트 자체에 변경(추가할 수 없음)을 가할 수 있음
//    println(mutableList[0])
//    mutableList.add(0,5)
//    println(mutableList[0])
//    mutableList.set(2, 8)
//
//    for (i in 0..2){
//       println(mutableList[i])
//    }

    // mutableSet
//    var mutableSet = mutableSetOf(1,2,1,3)
//    //    mutableSetOf  셋 자체에 변경(추가할 수 없음)을 가할 수 있음
//    println(mutableSet)


    // mutableMap
//    var mutableMap = mutableMapOf<String, String>()
//
//    mutableMap.put("1","one")
//    mutableMap.put("2","two")
//    mutableMap.put("3","three")
//    mutableMap.remove("3")
//
//    println("${mutableMap.get("3")}")


//    for (i in 0..1000){
//        if(i>999){
//            println("${i}")
//        }
//    }

    var result = 1
    while(result < 100){
        result +=result
    }
    println(result)

}