import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)

    println("Length:")
    var length=read.nextDouble()

    println("Width:")
    var width=read.nextDouble()

    var perimeter=length*2+width*2
    print("Perimeter is equal to: ")
    println(perimeter)

}