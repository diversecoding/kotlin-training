package controlflow

fun main(args: Array<String>){
    print("Enter your score : ")
    val score = readLine()!!.toInt()
    when(score){
        in 80..100 -> println("Your grade : A")
        79,78,77,76,75 -> println("Your grade : B+")
        in 70..74 -> println("Your grade : B")
        in 65..69 ->  println("Your grade : C+")
        in 60..64 ->  println("Your grade : C")
        in 55..59 ->  println("Your grade : D+")
        in 50..54 ->  println("Your grade : D")
        else -> println("Out of range")
   }
}