open class Figure(var Area:Int,var Perimeter:Int,var Draw:Int){
    fun Start(){
        println("Pure Math")
    }
}

class Circle:Figure(25,50,64){
    fun Radius(){
        println(14)
    }
}

open class Rectangle:Figure(25,50,64){
    fun Width(){
        println(10)
    }
    fun Height(){
        println(16)
    }
}

class Square:Rectangle(){

}

fun main(){
    var c=Circle()
    println(c.Area)
    var s=Square()
    println(s.Draw)
    var r=Rectangle()
    println(r.Perimeter)
}