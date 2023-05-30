import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt

fun main() {


//  TASK 11 (161)

    println("task 11 (161)")
    println(task11())
//  TASK 12 (162)
    println("task 12 (162)")
    println(task12())
//  TASK 13 (163)
    println("task 13 (163)")
    println(task13())

//  TASK 15 (165)
    println("task 15 (165)")
    val givenNumber = 27
    val t = task15(givenNumber)
    println(t)

//  TASK 16 (166)
    println("task 16 (166)")
    val numberForFour = 64
    val y = if (task16(numberForFour)) 1 else 0
    println(y)


//  TASK 17 (167)
    println("task 17 (167)")
    println(task17(0))


//  TASK 18 (168)
    println("task 18 (168)")
    println(task18(11))

//  TASK 19 (169)
    println("task 19 (169)")
    println(task19(7, 4))
}


//TASK 11 (161)
fun task11() {
    var number = 1000
    var found = false

    while (!found) {
        val product = number * 26
        val squareRoot = Math.sqrt(product.toDouble())

        if (squareRoot % 1 == 0.0) {
            println(number)
            found = true
        }
        number++
    }
}

//TASK 12 (162)
fun task12() {
    var number = 9999
    var found = false

    while (!found) {
        val product = number * 14
        val squareRoot = Math.sqrt(product.toDouble())

        if (squareRoot % 1 == 0.0) {
            println(number)
            found = true
        }
        number--
    }
}

//TASK 13 (163)
fun task13() {
    var number = 9999
    var found = false

    while (!found) {
        val product = number * 18
        val squareRoot = Math.sqrt(product.toDouble())

        if (squareRoot % 1 == 0.0) {
            println(number)
            found = true
        }
        number--
    }
}

//TASK 14 (164)

fun task14(n: Int): Int {
    for (i in 100 until 1000) {
        if (sqrt(i.toDouble()) > n) {
            return i
        }
    }
    return -1
}

//TASK 15 (165)
fun task15(n: Int): Boolean {
    var num = n
    while (num % 3 == 0 && num > 1) {
        num /= 3
    }
    return num == 1
}

//TASK 16 (166)
fun task16(n: Int): Boolean {
    var numb = n
    while (numb % 4 == 0 && numb > 1) {
        numb /= 4
    }
    return numb == 1
}

//TASK 17 (167)
fun task17(x: Int): Boolean = (1..30).any { sin(x.toFloat().pow(it)) < 0 }
//{
//    val range = 1..30
//    var y = false
//    range.forEach {
//        y = sin(x.toFloat().pow(it)) < 0
//
//        if (y) return y
//    }
//    return y
//}


//TASK 18 (168)
fun task18(n: Int): Boolean {
    when (n) {
        0, 1 -> return false
        2 -> return true
        else -> {
            for (i in 2 until n) if (n % i == 0) return false
            return true
        }
    }
}

//TASK 19 (169)
fun task19(x: Int, y: Int) {
    val z = if (task18(x + y)) 5 else 6
    println(z)
}



