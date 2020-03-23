package rsTask.subtask4

class StringParser {

    fun getResult(inputString: String): Array<String?> {
        var bracketsMap = hashMapOf(Pair('(', ')'), Pair('<', '>'), Pair('[', ']'))
        var resultArray: ArrayList<String> = arrayListOf()

        for (inputI in inputString.indices) {
            if (bracketsMap.containsKey(inputString[inputI])) {
                var subStr: String = inputString.substring(inputI + 1)
                var openBracket = inputString[inputI]
                var closeBracket = bracketsMap.getValue(openBracket)
                var missingBracketsNumber = 0

                loop@ for (subI in subStr.indices) {
                    when (subStr[subI]) {
                        openBracket -> missingBracketsNumber++
                        closeBracket -> if (missingBracketsNumber == 0) {
                            subStr = subStr.substring(0, subI)
                            resultArray.add(subStr)
                            break@loop
                        } else {
                            missingBracketsNumber--
                        }
                    }
                }
            }
        }

        val array = arrayOfNulls<String>(resultArray.size)
        resultArray.toArray(array)
        return array
    }
}