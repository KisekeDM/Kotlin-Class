class Dog(var color:String,var breed:String,var sex:String,var age:Int){

}

fun main(){
    var d=Dog("black","Rottweiler","male",5)
    println(d.color+" "+d.breed+" "+d.sex+" "+d.age)

    var puppy=Dog("brown","Chihuahua","male",2)
    println(puppy.breed)
}