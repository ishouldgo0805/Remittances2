import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun main() {
    }

    @Test
    fun commission_When_Is_Default() {
        // arrange
        val cardType = "Vk Pay"
        val remittance = 100.0
        val previousRemittances = 0.0

        // act
        val commissionIs = commission(
            cardType = cardType,
            remittance = remittance,
            previousRemittances = previousRemittances
        )

        // assert
        assertEquals(0, commissionIs.toInt())
    }
}

@Test
fun commission_when_MC() {

    // arrange
    val cardType = "Mastercard"
    val remittance = 100.0
    val previousRemittances = 0.0

    // act
    val commissionIs = commission(
        cardType = cardType,
        remittance = remittance,
        previousRemittances = previousRemittances
    )

    // assert
    assertEquals(26, commissionIs.toInt())
}

@Test
fun commission_when_Maestro() {

    // arrange
    val cardType = "Maestro"
    val remittance = 100.0
    val previousRemittances = 0.0

    // act
    val commissionIs = commission(
        cardType = cardType,
        remittance = remittance,
        previousRemittances = previousRemittances
    )

    // assert
    assertEquals(26, commissionIs.toInt())
}

@Test
fun commission_when_Visa() {

    // arrange
    val cardType = "Visa"
    val remittance = 100.0
    val previousRemittances = 0.0

    // act
    val commissionIs = commission(
        cardType = cardType,
        remittance = remittance,
        previousRemittances = previousRemittances
    )

    // assert
    assertEquals(35, commissionIs.toInt())
}

@Test
fun commission_when_Mir() {

    // arrange
    val cardType = "Mir"
    val remittance = 100.0
    val previousRemittances = 0.0

    // act
    val commissionIs = commission(
        cardType = cardType,
        remittance = remittance,
        previousRemittances = previousRemittances
    )

    // assert
    assertEquals(35, commissionIs.toInt())
}
