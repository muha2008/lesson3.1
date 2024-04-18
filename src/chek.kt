class chek {fun checkGoingOut(age: Int, temperature: Int): String {
    return when {
        (age in 20..45 && temperature in -20..30) -> "Можно идти гулять"
        (age < 20 && temperature in 0..28) -> "Можно идти гулять"
        (age > 45 && temperature in -10..25) -> "Можно идти гулять"
        else -> "Оставайтесь дома"
    }
}

    fun main() {
        println(checkGoingOut(25, 15))
        println(checkGoingOut(18, 25))
        println(checkGoingOut(50, 20))
        println(checkGoingOut(30, 5))
        println(checkGoingOut(40, 35))
    }
}