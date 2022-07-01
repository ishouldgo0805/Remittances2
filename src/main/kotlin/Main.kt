fun main() {
    print("Ваша комиссия составит: ${commission("Visa", 100.0, 0.0)}")
}

fun commission(cardType: String, remittance: Double, previousRemittances: Double): Double {
    var commissionIs = 0.00
    when (cardType) {
        "Vk Pay" -> commissionIs
        "Mastercard" -> commissionIs = (remittance / 100.0 * 6.0) + 20.0
        "Maestro" -> commissionIs = (remittance / 100.0 * 0.06) + 20.0
        "Visa" -> commissionIs = if ((remittance / 100.0 * 0.75) > 35.0) remittance / 100.0 * 0.75 else 35.00
        "Mir" -> commissionIs = if ((remittance / 100.0 * 0.75) > 35.0) remittance / 100.0 * 0.75 else 35.00
    }
    return commissionIs
}