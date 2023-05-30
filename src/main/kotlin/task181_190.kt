import kotlin.math.sqrt

fun main() {


    //135
    println("Task 25 (185)")
    println(task185(10))

    //138
    println("Task 28 (188)")
    println(task188_1(10))
    println(task188_2(10))

    println(11.isPrime())


}


// Task 35 (185)
fun task185(p: Int) {
    if (p !in 1 until 25) return

    var x = 30_000
    var m = 0
    do {
        x += x * p / 100
        m++
    } while (x < 100_000)

    println("Total $x AMD in $m months")
}

// Task 38 (188)
fun task188_1(n: Int): Boolean {
    var x = 2
    var currentFibNumber = fib(x++)
    while (currentFibNumber < n) {
        currentFibNumber = fib(x++)
    }
    return currentFibNumber == n
}


fun fib(x: Int): Int {
    if (x <= 2) return 1
    return (fib(x - 1) + fib(x - 2))
}

fun task188_2(n: Int): Boolean {
    val value = 5 * n * n
    return (value + 4).isPerfectSquare() ||
            (value - 4).isPerfectSquare()
}


fun Int.isPerfectSquare(): Boolean {
    val sqrt = sqrt(toFloat())
    return sqrt - sqrt.toInt() == 0.0f
}

fun Int.isPrime(): Boolean {
    for (i in 1..this) {
        return this % i != 2
    }
    return false
}

fun Int.isPrimeNumber(): Boolean =
    !(2..sqrt(this.toFloat()).toInt())
        .any { this % it == 0 }

fun Int.isPrimeNumber2(): Boolean =
    ((this - 1) / 6f).isNaturalNumber() ||
            ((this + 1) / 6f).isNaturalNumber()

fun Float.isNaturalNumber(): Boolean =
    this - toInt() == 0.0f

//fun Int.elementAt(index:Int):Int{
//    var element = -1
//    var count= 0
//    do {
//        element =this
//    }
//
//    return element
//}

