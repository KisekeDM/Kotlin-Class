import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)

    println("Temperature:")
    var temp=read.nextInt()

    if (temp < 37){
        println("Too cold")
    }
    else if(temp == 37){
        println("Normal temperature")
    }
    else{
        println("Too hot")
    }
}