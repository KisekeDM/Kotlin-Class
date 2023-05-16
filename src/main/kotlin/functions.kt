fun main(){
    //Predefined functions
    println("Kotlin")

    var squareroot=Math.sqrt(5.0)
    println(squareroot)

    var round=Math.ceil(3.45)
    println(round)

    var round2=Math.round(3.5)
    println(round2)

    myfunction()
    add(64,65)
    add(4,5)
    mydetails("Daniel", 17)
    mydetails("Mutunga", 19)
}

//User-defined functions
fun myfunction(){
    println("Today is friday")
}

fun add(num1:Int, num2:Int){
    println(num1+num2)
}

fun mydetails(name:String, age:Int){
    println("$name is $age years old")
}