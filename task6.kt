fun main() {
    println("Введите первую цифру:")
    val digit1Input = readlnOrNull()

    println("Введите вторую цифру:")
    val digit2Input = readlnOrNull()

    if (digit1Input != null && digit2Input != null) {
        try {
            val digit1 = digit1Input.toInt()
            val digit2 = digit2Input.toInt()

            if (digit1 < 0 || digit1 > 9 || digit2 < 0 || digit2 > 9) {
                println("Ошибка: Введите цифры от 0 до 9.")
            } else if (digit1 == digit2) {
                println("Ошибка: Цифры должны быть различными.")
            }
            else {

                val result = createOddNumber(digit1, digit2)

                if (result != null) {
                    println("Нечетное число: $result")
                } else {
                    println("Создать нечетное число невозможно")
                }
            }

        } catch (e: NumberFormatException) {
            println("Ошибка: Введите целые числа.")
        }
    } else {
        println("Ошибка: Ввод пуст.")
    }
}

fun createOddNumber(digit1: Int, digit2: Int): Int? {
    if (digit1 % 2 != 0) {
        return digit2 * 10 + digit1
    } else if (digit2 % 2 != 0) {
        return digit1 * 10 + digit2
    }

    return null
}