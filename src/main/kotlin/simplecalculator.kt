import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Simple Calculator")

    print("Enter the first number: ")
    var num1 = read.nextDouble()

    print("Enter the second number: ")
    var num2 = read.nextDouble()

    print("Enter the operator (+, -, *, /): ")
    var operator = readLine()

    var result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> "Invalid operator"
    }

    println("Result: $result")
}
