package rsTask.subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {
        var resultsList = mutableListOf<Int>()

        for (i in input.indices){
            resultsList.add(getSumExсept(input, i))
        }
        return intArrayOf(resultsList.min()!!, resultsList.max()!!)
    }

    private fun getSumExсept(input: IntArray, position: Int) = input.sum() - input[position]

}
