import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)

    println("Enter the first number:")
    var num1 = scanner.nextDouble()

    println("Enter the second number:")
    var num2 = scanner.nextDouble()

    println("Enter the third number:")
    var num3 = scanner.nextDouble()

    var min = if (num1 <= num2 && num1 <= num3) {
        num1
    } else if (num2 <= num1 && num2 <= num3) {
        num2
    } else {
        num3
    }

    println("The minimum number is: $min")
}
