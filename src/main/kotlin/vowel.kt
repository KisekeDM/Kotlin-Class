import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter a letter:")
    var letter = read.nextLine()

    var vowels = listOf("a", "e", "i", "o", "u")

    if (letter in vowels) {
        println("The entered letter '$letter' is a vowel.")
    } else {
        println("The entered letter '$letter' is not a vowel.")
    }
}
