package function

fun main(args:Array<String>){

    println(add(8,9))
    println(substract(58,95))
    println(multiply(58))
    println(getSum(8,9,8,4,5,2,3,6,8,5))
    println(fact(9))
}

//function normal
fun add(num1: Int,num2: Int) : Int {
    return num1 + num2
}
//function single line
fun substract(num1: Int, num2:Int) : Int = num1-num2
//default value
fun multiply(num1: Int, num2: Int = 20) : Int = num1*num2

//many argument of number
fun getSum(vararg nums:Int):Int {
    var sum = 0
    nums.forEach { number -> sum += number }
    return sum
}

//recursive
fun fact(numberOfFactorial: Int): Int {
    tailrec fun factTail(startFact: Int, data: Int): Int {
        if(startFact == 0) return data
        else return factTail(startFact-1,startFact*data)
    }
    return factTail(numberOfFactorial,1)
}