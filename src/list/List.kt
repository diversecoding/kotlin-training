package list

fun main(args: Array<String>){

    var list1: MutableList<Int> = mutableListOf(1,2,3,4,5)
    val list2: List<Int> = listOf(1,2,3)

    list1.add(6)

    println("1st : ${list1.first()}")
    println("Last : ${list1.last()}")

    var subList = list1.subList(0,3)
    println("Length : ${list1.size}")
//    list1.forEach { n -> println("Mutable List : $n") }

    subList.clear()
    list1.remove(1)

    list1.forEach { n -> println("Mutable List : $n") }

    val map = mutableMapOf<Int, Any?>()
    map[1] = "Mart"
    map[2] = 21
    val map2 = mutableMapOf(1 to "Doug", 2 to 25)

    for ((key,value) in map){
        println("Key : $key and Value : $value")
    }

    for ((key,value) in map2){
        println("Key : $key and Value : $value")
    }
}