package learnclass

open class Animal (
        val name:String,
        var height: Double,
        var weight: Double
){
    init {
        //implement regular expression
        val regex = Regex(".*\\d+.*")
        require(!name.matches(regex)) {"Animal name can't contain Number"}
        require(height > 0) {"Height must be Greater than 0"}
        require(weight > 0) {"Height must be Greater than 0"}
    }

    open fun getInfo() : Unit {
        println("$name is $height tall and weight $weight")
    }
}


class Cat(
        name: String,
        height: Double,
        weight: Double,
        var owner: String) : Animal(name,height,weight)
{
    override fun getInfo(){
        println("$name is $height tall and weight $weight and by owner $owner")
    }
}


interface Flyable{
    var files: Boolean
    fun fly(distMile: Double) : Unit
}

class Bird constructor(val name: String, override var files: Boolean = true) : Flyable{
    override fun fly(distMile: Double) {
        if(files)
            println("This bird name $name can Fly $distMile")
        else
            println("Can't Fly")
    }
}