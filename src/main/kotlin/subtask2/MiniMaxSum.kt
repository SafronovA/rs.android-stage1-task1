package rsTask.subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {
        var sum = input.sum()
        var minInt = input.min()
        var maxInt = input.max()
        return intArrayOf(sum - maxInt!!, sum - minInt!!)
    }
}