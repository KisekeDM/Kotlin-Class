class DOG(var Breed:String,var Size:String,var Age:Int,var Color:String){

    fun Eat(food:String){
        println(food)
    }
    fun Sleep(){}
    fun Sit(){}
    fun Run(){}

}
fun main(){
    var dog1=DOG("Neapolitan Mastiff","Large",5,"Black")
    println(dog1.Breed)

    var dog2=DOG("Maltese","Small",2,"White")
    println(dog2.Breed)

    var dog3=DOG("Chow Chow","Medium",3,"Brown")
    println(dog3.Breed)


}