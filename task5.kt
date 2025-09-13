import kotlin.math.log

fun main() {
    println("Введите целое число n:")
    val nInput = readlnOrNull()
    println("Введите основание степени x:")
    val xInput = readlnOrNull()

    if (nInput != null && xInput != null) {
        try {
            val n = nInput.toInt()
            val x = xInput.toInt()

            val y = findIntegerExponent(n, x)

            if (y != null) {
                println("Целочисленный показатель: $y")
            } else {
                println("Целочисленный показатель не существует")
            }

        } catch (e: NumberFormatException) {
            println("Ошибка: Введите целые числа.")
        }
    } else {
        println("Ошибка: Ввод пуст.")
    }
}

fun findIntegerExponent(n: Int, x: Int): Int? {
    if (n <= 0 || x <= 0) return null // negative numbers

    if(x == 1) {
        if(n == 1) return 1
        else return null
    }

    val y = log(n.toDouble(), x.toDouble())
    if (y == Math.floor(y)) {
        return y.toInt()
    }

    return null
}