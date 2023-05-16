import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)

    println("Side A:")
    var A=read.nextDouble()

    println("Side B:")
    var B=read.nextDouble()

    println("Height:")
    var height=read.nextDouble()

    var area=0.5*(A+B)*height
    print("Area is equal to: ")
    println(area)
}