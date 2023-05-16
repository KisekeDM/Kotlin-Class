import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)

    var pie:Double
    pie=3.142

    println("Radius:")
    var radius=read.nextDouble()

    var perimeter=pie*radius*2
    print("Perimeter is equal to: ")
    println(perimeter)

}