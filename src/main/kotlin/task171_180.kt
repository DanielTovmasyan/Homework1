fun main() {

    //  TASK 23 (173)
    println("task 23 (173)")
    println(task23(3, 4f, 8f))


    //  TASK 30 (180)
    println("task 30 (180)")
    val givenNum = 27
    val isPower = task15(givenNum)
    println(isPower)
}

//TASK 23 (173)
fun task23(n: Int, a: Float, b: Float): Float {
    if (a < 1 || a > b) return -1f

    val h = (b - a) / n

    repeat(n) { next ->
        println(a + next * h)
        println(" ")

    }
    println(b)
    println()
    return h
}



fun task175(n:Int){
    var x = 1f
    val data = mutableListOf<Float>()
    (1..n).forEach { index ->
        x = (x + 1) / index
        data.add(x)
    }
    println(data)
}