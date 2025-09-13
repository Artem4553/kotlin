fun main() {
    println("Введите натуральное число:")
    val input = readlnOrNull()

    if (input != null) {
        try {
            val decimalNumber = input.toInt()
            if (decimalNumber < 0) {
                println("Ошибка: Введите натуральное число (больше или равное 0).")
            } else {
                val binaryNumber = decimalToBinary(decimalNumber)
                println("Двоичное представление: $binaryNumber")
            }
        } catch (e: NumberFormatException) {
            println("Ошибка: Введите целое число.")
        }
    } else {
        println("Ошибка: Ввод пуст.")
    }
}

fun decimalToBinary(decimalNumber: Int): String {
    if (decimalNumber == 0) {
        return "0"
    }

    var number = decimalNumber
    val binary = StringBuilder()

    while (number > 0) {
        binary.insert(0, number % 2)
        number /= 2
    }

    return binary.toString()
}