class Person{
    //Variables/Properties/Attributes/Data members
    var name:String="Daniel"
    var age:Int=17
    var location:String="Nairobi"
    var yearofbirth:Int=2000

    //Methods/Functions
    fun eat(){
        println("Eating")
    }
    fun sleep(){
        println("Sleeping")
    }
}

fun main(){
    var p=Person()
    println(p.name+" "+p.age+" "+p.location+" "+p.yearofbirth)
    var eng=Car()
    println(eng.model+" "+eng.make+" "+eng.color+" "+eng.drivingspeed)
}

class Car{
    var model:String="Toyota"
    var make:String="Prius"
    var color:String="Black"
    var drivingspeed:Int=180

    fun drive(){
        println("driving")
    }
    fun turn(){
        println("turn")
    }
    fun stop(){
        println("stopping")
    }
}
