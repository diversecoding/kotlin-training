package variable

fun main(args: Array<String>){

    //Immutable Read-only variable unchanged
    val name = "Thanaphoom"
    val surname = "Babparn"

    val fullName = name+" "+surname
    //Mutable can change variable for the next time
    var myAge: Int = 21

    //Can insert type to specific variable
    val bigInt:Int = Int.MAX_VALUE
    val smallInt:Int = Int.MIN_VALUE
    //We have Double Short Long Int Byte

    //String Literal for insert variable into String
    println("Big Integer has $bigInt and Small Integer has $smallInt")

    var letterGrade: Char = 'A'
    println("$letterGrade is Character : ${ letterGrade is Char} ")
    println("3.14 to Int : "+(3.14.toInt()))
    println("A to Int : "+(letterGrade.toInt()))
    println(fullName)

}