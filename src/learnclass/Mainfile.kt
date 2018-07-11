package learnclass

fun main(args: Array<String>){

    var dog = Animal("Dodo",85.52,66.20)
    dog.getInfo()

    var cat = Cat("Koko",20.25,12.02,"Smith")
    cat.getInfo()

    var bird = Bird("Lolo",true)
    bird.fly(152.211)
}