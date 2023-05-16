//arithmetic operators
fun main(){
    var num:Int
    num=25
    var num2:Int=6

    println(num+num2)
    println(num-num2)
    println(num/num2)
    println(num*num2)
    println(num%num2)//modulus


    //assignment operators
    var x=2
    println(x)

    var y=4
    y+=2
    println(y)

    var h=88
    h-=10
    println(h)

    var t=81
    t%=6
    println(t)


    //comparison operators
    var r:Int=100
    println(r<20)
    println(r>20)
    println(r==20)
    println(r<=20)
    println(r>=20)
    println(r!=20)


    //logical operators
    var mynumber=90
    println(mynumber<100 && mynumber==30)//and
    println(mynumber<100 || mynumber==30)//or
    println(!(mynumber<100 || mynumber==30))//not



}