package codelab4

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    val subtractResult1 = subtract(firstNumber, secondNumber)
    val subtractResult2 = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    println("$firstNumber - $secondNumber = $subtractResult1")
    println("$firstNumber - $thirdNumber = $subtractResult2")
}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun subtract(num1: Int, num2: Int): Int {
    return num1 - num2
}