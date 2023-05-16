fun main() {
    var languages = arrayOf("python", "kotlin", "java")
    println(languages[0])//accessing an element

    //changing an element
    languages[0] = "javascript"
    println(languages[0])

    for (t in languages) {
        println(t)
    }
    //number of elements in array
    var length = languages.size
    println("Array size : $length")

    //adding an element
    var language = languages.plus(element = "C++")
    for (lang in language){
        println(lang)
    }

}