package rsTask.subtask5

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var availableChanges = k
        var necessaryChanges = getNecessaryChanges(digitString)
        var array: CharArray = digitString.toCharArray()

        for (i in 0 until digitString.length / 2) {
            var digitFromTheBeginning = array[i]
            var digitFromTheEnd = array[array.size - 1 - i]
            if (digitFromTheBeginning != digitFromTheEnd) {
                when {
                    availableChanges > necessaryChanges -> {
                        array[i] = '9'
                        array[array.size - 1 - i] = '9'
                        availableChanges--
                    }
                    necessaryChanges == availableChanges -> {
                        if (digitFromTheBeginning.toInt() > digitFromTheEnd.toInt()) {
                            array[array.size - 1 - i] = digitFromTheBeginning
                        } else {
                            array[i] = digitFromTheEnd
                        }
                    }
                    else -> return "-1"
                }
            }
        }
        return array.joinToString("")
    }

    private fun getNecessaryChanges(digitString: String): Int {
        var changesCount: Int = 0
        for (i in 0 until digitString.length / 2) {
            var firstDigit = digitString[i]
            var secondDigit = digitString[digitString.length - 1 - i]
            if (firstDigit != secondDigit) changesCount++
        }
        return changesCount
    }
}