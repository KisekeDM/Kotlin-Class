import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)

    println("Enter your name:")
    var name= readln()
    println("My name is $name")

    println("Enter an integer:")
    var num=read.nextInt()
    println("You entered $num")

    println("Enter your float:")
    var num2=read.nextFloat()
    println("You entered $num2")
}
