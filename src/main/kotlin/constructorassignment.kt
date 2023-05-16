class Persona(var name:String,var age:Int,var jobstatus:String,var gender:String){

}

fun main(){
    var person1=Persona("Rita",18,"Unemployed","Female")
    println(person1.name)
    var person2=Persona("David",43,"Unemployed","Male")
    println(person2.age)
}