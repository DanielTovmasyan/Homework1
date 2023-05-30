import java.math.BigDecimal

fun main() {
//
//    //  TASK 1 (151)
//    println("task 1 (151)")
//    println(task1numberList(1, 10000))
//
//    //  TASK 2 (152)
//    println("task 2 (152)")
//    println(task2numberList(1, 10000))

//    //  TASK 3 (153)
//    println("task 3 (156)")
//    println(task3(1, 100))
//
//    println("task 3 (153)")
//    println(task3numberList(1, 100))
//
//    //  TASK 5 (155)
//    println("task 5 (155)")
//    println(task5(10, 99))
//
//    //  TASK 6 (156)
//    println("task 6 (156)")
//    println(task6(10, 99))
//
//    //  TASK 7 (157)
//    println("task 7 (157)")
//    println(task7(100, 999))
//
//    //  TASK 8 (158)
//    println("task 8 (158)")
//    println(task8(100, 999))
//
//    //  TASK 9 (159)
//    println("task 9 (159)")
//    println(task9(100, 999))
//


    //  TASK 10 (160)
    println("task 10 (160)")
    println(task10())

}

    //  TASK 1 (151)
    fun task1numberList(startNumber: Int, endNumber: Int): ArrayList<Int> {
        val numberList = arrayListOf<Int>()
        for (i in startNumber..endNumber) if (sumOfDividers(i) == i) numberList.add(i)
        return numberList
    }

    fun sumOfDividers(number1: Int): Int {
        var sumNumber = 0
        for (i in 1 until number1) if (number1 % i == 0) sumNumber += i
        return sumNumber
    }

    // TASK 2 (152)
    fun task2numberList(startNumber: Int, endNumber: Int): ArrayList<Int> {
        val numberList = arrayListOf<Int>()
        for (i in startNumber..endNumber) if (productOfDividers(i) == i) numberList.add(i)
        return numberList
    }

    fun productOfDividers(number2: Int): Int {
        var productNumber = 1
        for (i in 1 until number2) if (number2 % i == 0) productNumber *= i
        return productNumber
    }

    // TASK 3 (153)
    fun task3(startNumber: Int, endNumber: Int): Int {
        var sumOfNum2remainder = 0
        for (i in startNumber..endNumber) if (i == 2) sumOfNum2remainder += i
        return sumOfNum2remainder
    }


    fun task3() {
        val n = 100
        var sum = 0
        for (i in 1..n) if (i % n == 2) sum += i
        println(sum)
    }


    //TASK 5 (155)
    fun task5(startNumber: Int, endNumber: Int): Int {
        var sumOfNumbersDivisibleByThree = 0
        for (i in startNumber..endNumber) if (i % 3 == 0) sumOfNumbersDivisibleByThree += i
        return sumOfNumbersDivisibleByThree
    }


    //TASK 6 (156)
    fun task6(startNumber: Int, endNumber: Int): Long {
        var sumOfNumbersDivisibleByThreeAndFive: Long = 1
        for (i in startNumber..endNumber) if (i % 5 == 0 && i % 3 == 0) sumOfNumbersDivisibleByThreeAndFive *= i
        return sumOfNumbersDivisibleByThreeAndFive
    }

    //TASK 7 (157)
    fun task7(startNumber: Int, endNumber: Int): Int {
        var sumOfNumbersNotDivisibleByFive = 0
        for (i in startNumber..endNumber) if (i % 5 !== 0) sumOfNumbersNotDivisibleByFive += i
        return sumOfNumbersNotDivisibleByFive
    }

    //TASK 8 (158)
    fun task8(startNumber: Int, endNumber: Int): Long {
        var productionOfNumbersNotDivisibleByTwoAndThree: Long = 1
        for (i in startNumber..endNumber) if (i % 2 !== 0 && i % 3 !== 0) productionOfNumbersNotDivisibleByTwoAndThree *= i
        return productionOfNumbersNotDivisibleByTwoAndThree
    }

    //TASK 9 (159)
    fun task9(startNumber: Int, endNumber: Int): String {
        var productionOfNumbersDivisibleBy3and4remainder = BigDecimal("1")
        for (i in startNumber..endNumber) {
            if (i % 3 == 1 && i % 4 == 2) {
                productionOfNumbersDivisibleBy3and4remainder =
                    productionOfNumbersDivisibleBy3and4remainder.multiply(BigDecimal(i))
//            println("$productionOfNumbersDivisibleBy3and4remainder - $i")
            }
        }
        return productionOfNumbersDivisibleBy3and4remainder.toPlainString()
    }

    //TASK 10 (160)
    fun task10() {
        var number = 100
        var found = false

        while (!found) {
            val product = number * 16
            val squareRoot = Math.sqrt(product.toDouble())

            if (squareRoot % 1 == 0.0) {
                println(number)
                found = true
            }
            number++
        }

    }

//fun task10(startNumber: Int, endNumber: Int): Double {
////    val numberList = arrayListOf<Int>()
////    val a = 1.0 .. 100.0
////    val min = findMin(i)
////    for (i in startNumber..endNumber) if ((i * 16).toDouble() == sqrt(a)) {
////        println(Math.sqrt(x*16).roundToInt().toFloat() == Math.sqrt(x*16))
////
////    }
////        return
////}
////
////
////fun findMin(list: List<Int>): Int? {
////    return list.min()
//}