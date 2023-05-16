import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)

    println("Length:")
    var length=read.nextDouble()

    println("Width:")
    var width=read.nextDouble()

    println("Height:")
    var height=read.nextDouble()

    var volume=length*width*height
    print("Volume is equal to: ")
    println(volume)
}