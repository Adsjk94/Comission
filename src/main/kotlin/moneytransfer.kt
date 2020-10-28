fun main () {
    val amount = 1_000_000
    val commission = if (amount * 0.0075 < 3500) 3500 else amount * 0.0075

    println("Commission: $commission")
}
