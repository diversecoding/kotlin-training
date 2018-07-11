package variable

fun main(args: Array<String>){
    var myArray = arrayOf(1,2.155,"Mart")
    //Not access like This
    println(myArray)
    for (i in myArray)
        print("$i ")
    println()

    myArray[1] = 50
    //Not access like This
    println(myArray)
    for (i in myArray)
        print("$i ")
    println()

    // 5..20
    var range = 5.rangeTo(20)
    println(range)
    for (i in range)
        print("$i ")
    println()

    var down = 5.downTo(2)
    for (i in down)
        print("$i ")
    println()

    var alphabet = "A".."Z"
    print("Alphabet : ${"R" in alphabet}")
    println()


}
