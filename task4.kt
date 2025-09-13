fun main() {
    println("Введите два числа и операцию (например, 1.5 2.0 +):")
    val input = readlnOrNull()

    if (input != null) {
        val parts = input.split(" ")

        if (parts.size != 3) {
            println("Ошибка: Неверный формат ввода. Пример: ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ")
        } else {
            try {
                val num1 = parts[0].toDouble()
                val num2 = parts[1].toDouble()
                val operation = parts[2]

                val result = calculate(num1, num2, operation)

                if (result != null) {
                    println("Результат: $result")
                } else {
                    println("Ошибка: Недопустимая операция.")
                }

            } catch (e: NumberFormatException) {
                println("Ошибка: Введите корректные числа.")
            }
        }
    } else {
        println("Ошибка: Ввод пуст.")
    }
}

fun calculate(num1: Double, num2: Double, operation: String): Double? {
    return when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 == 0.0) {
                println("Ошибка: Деление на ноль!")
                null
            } else {
                num1 / num2
            }
        }
        else -> null
    }
}