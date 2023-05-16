import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter number: ")
    var num=read.nextInt()
    if (num>0){
        println("Number is positive")
    }
    else if (num==0){
        println("neutral")
    }
    else{
        println("Number is negative")
    }

}