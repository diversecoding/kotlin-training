package controlflow

fun main(args:Array<String>){

    //Manage Nullable type
    var name: String? = "Thanaphoom"
    println(name)
    println(name?.length)
    name = null
    println(name?.length)

    print("Please Insert your age : ")

    var age: Int = readLine()!!.toInt()
    if(age in 21..29){
        println("Teenager")
    } else {
        println("Out of range check")
    }
}