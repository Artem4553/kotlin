fun main() {
    println("Введите строку:")
    val input = readlnOrNull()

    if (input != null) {
        val result = countConsecutiveCharacters(input)
        println(result)
    } else {
        println("Ошибка: Ввод пуст.")
    }
}

fun countConsecutiveCharacters(input: String): String {
    if (input.isEmpty()) return ""

    val result = StringBuilder()
    var currentChar = input[0]
    var count = 1

    for (i in 1 until input.length) {
        if (input[i] == currentChar) {
            count++
        } else {
            result.append(currentChar)
            if (count > 1) {
                result.append(count)
            }
            currentChar = input[i]
            count = 1
        }
    }

    result.append(currentChar)
    if (count > 1) {
        result.append(count)
    }

    return result.toString()
}