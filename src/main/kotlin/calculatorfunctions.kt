//calculator with a different function for each operator
fun main(){
    sum(3092,808)
    difference(14,7)
    multiplication(6,9)
    division(81,3)
}

fun sum(num1:Int,num2:Int){
    println(num1+num2)
}

fun difference(num1:Int,num2:Int){
    println(num1-num2)
}

fun multiplication(num1:Int,num2:Int){
    println(num1*num2)
}

fun division(num1:Int,num2:Int){
    println(num1/num2)
}