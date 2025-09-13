fun main() {
    println("Введите строку:")
    val input = readlnOrNull()

    if (input != null) {
        val charCounts = countDistinctCharacters(input)
        charCounts.forEach { (char, count) ->
            println("$char - $count")
        }
    } else {
        println("Ошибка: Ввод пуст.")
    }
}

fun countDistinctCharacters(input: String): Map<Char, Int> {
    val charCounts = mutableMapOf<Char, Int>()
    for (char in input) {
        charCounts[char] = charCounts.getOrDefault(char, 0) + 1
    }

    return charCounts.toSortedMap()
}