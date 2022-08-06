import org.junit.Test

import org.junit.Assert.*

class MainKtTest {
    @Test
    fun calculateFeeForVkPay() {
        val typeOfCard = "VK Pay"
        val monthAmounts = 5000
        val amount = 500000

        val result = calculateFee(typeOfCard, monthAmounts, amount)
        assertEquals(500000, result)
    }

    @Test
    fun calculateFeeForVisaMinFee() {
        val typeOfCard = "Visa"
        val monthAmounts = 5000
        val amount = 50000

        val result = calculateFee(typeOfCard, monthAmounts, amount)
        assertEquals(46500, result)
    }

    @Test
    fun calculateFeeForMir() {
        val typeOfCard = "Мир"
        val monthAmounts = 5000
        val amount = 500000

        val result = calculateFee(typeOfCard, monthAmounts, amount)
        assertEquals(496250, result)
    }

    @Test
    fun calculateFeeForMastercardPercentFee() {
        val typeOfCard = "Mastercard"
        val monthAmounts = 7500000
        val amount = 70000

        val result = calculateFee(typeOfCard, monthAmounts, amount)
        assertEquals(67580, result)
    }

    @Test
    fun calculateFeeForMastercardMinAmountFee() {
        val typeOfCard = "Mastercard"
        val monthAmounts = 0
        val amount = 10000

        val result = calculateFee(typeOfCard, monthAmounts, amount)
        assertEquals(7940, result)
    }

    @Test
    fun calculateFeeForMaestroWithoutFee() {
        val typeOfCard = "Maestro"
        val monthAmounts = 1000000
        val amount = 100000

        val result = calculateFee(typeOfCard, monthAmounts, amount)
        assertEquals(100000, result)
    }


}


