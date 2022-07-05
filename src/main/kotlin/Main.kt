fun main() {
    print("Ваша комиссия составит: ${commission("Vk Pay", 100.0, 0.0)}")
}

fun commission(cardType: String = "Vk Pay", remittance: Double, previousRemittances: Double = 0.0): Double {
    var commissionIs = 0.00
    when (cardType) {
        "Vk Pay" -> commissionIs
        "Mastercard", "Maestro"  -> commissionIs = (remittance / 100.0 * 6.0) + 20.0
        "Visa", "Mir" -> commissionIs = if ((remittance / 100.0 * 0.75) > 35.0) remittance / 100.0 * 0.75 else 35.00
    }
    return commissionIs
}