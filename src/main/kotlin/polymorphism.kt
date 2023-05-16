//parent class
open class Shape{
    open fun draw(){
        println("Drawing")
    }
}

//child classes
class Rectangles:Shape(){
   override fun draw(){
        println("Drawing a rectangle")
    }
}

class Squares:Shape(){
    override fun draw(){
        println("Drawing a square")
    }
}

fun main(){
    var r=Rectangles()
    r.draw()

    var s=Squares()
    s.draw()
}