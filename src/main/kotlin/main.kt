fun main() {
    println(calculateFee(amount = 10000))
    println(calculateFee("Visa", amount = 700000))
    println(calculateFee("Maestro", 7400000, 50000))
    println(calculateFee("Mastercard", 7500000, 100000))
}

fun calculateFee(typeOfCard: String = "Vk Pay", monthAmounts: Int = 0, amount: Int): Int {
    val fee = when (typeOfCard) {
        "Mastercard" -> mastercardMaestroFee(amount, monthAmounts)
        "Maestro" -> mastercardMaestroFee(amount, monthAmounts)
        "Visa" -> visaMirFee(amount)
        "Мир" -> visaMirFee(amount)
        else -> 0
    }
    return amount - fee
}

fun mastercardMaestroFee(amount: Int, monthAmounts: Int) = when {
    amount > 30000 && monthAmounts < 7500000 -> 0
    else -> (amount * 0.006 + 2000).toInt()
}

fun visaMirFee(amount: Int) = when {
    (amount * 0.0075).toInt() < 3500 -> 3500
    else -> (amount * 0.0075).toInt()
}
