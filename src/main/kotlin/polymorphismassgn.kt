open class Shapes{
    open fun area(){
        println("OK")
    }
}

class Circles:Shapes(){
    override fun area(){
        println("area of a circle")
    }
}

class Triangle:Shapes(){
    override fun area(){
        println("area of a triangle")
    }
}

class Rectangles2:Shapes(){
    override fun area(){
        println("area of a rectangle")
    }
}

fun main(){
    var c=Circles()
    c.area()
    var t=Triangle()
    t.area()
    var r=Rectangles2()
    r.area()
}