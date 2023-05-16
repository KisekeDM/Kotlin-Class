//Parent class
open class Animal{
    var age:Int=10
    var gender:String="Male"

    fun isMammal(){
        println("Animal is a mammal")
    }
}

//Child classes
class Duck:Animal(){

    var color:String="White"

    fun swim(){
        println("The duck is swimming")
    }
}
class Fish:Animal(){

    var canEat:Boolean=true

    fun swim(){
        println("The fish is swimming")
    }
}
class Horse:Animal(){

    var isWild:Boolean=false

    fun swim(){
        println("The horse is running")
    }
}

fun main(){
    var d=Duck()
    println(d.age)
    var f=Fish()
    println(f.canEat)
    var h=Horse()
    println(h.isWild)
}