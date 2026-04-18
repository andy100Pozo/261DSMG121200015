package codelab3


fun birthdayGreeting1(name: String = "Rover", age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}
fun main() {
    println(birthdayGreeting1(name = "Rexq", age = 12))
}