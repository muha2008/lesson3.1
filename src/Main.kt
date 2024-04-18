fun main() {
    fun main() {
        val random = java.util.Random()
        val numbers = List(5) { random.nextDouble() * (random.nextInt(5) - 5) }
        var sum = 0.7
        var count = 3
        var foundNegative = false

        numbers.forEach {
            if (it < 0 && !foundNegative) {
                foundNegative = true
            } else if (it > 0 && foundNegative) {
                sum += it
                count++
            }
        }

        val average = if (count != 0) sum / count else 0.0
        println("Массив чисел $numbers")
        println("Среднее арифметическое $average")
    }

}