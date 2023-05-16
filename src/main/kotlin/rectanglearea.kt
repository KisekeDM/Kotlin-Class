import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)

    println("Length:")
    var length=read.nextDouble()

    println("Width:")
    var width=read.nextDouble()

    var area=length*width
    print("Area is equal to: ")
    println(area)
}