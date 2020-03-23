package rsTask.subtask1

class HappyArray {
    var recheck: Boolean = true

    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyList = ArrayList<Int>()
        happyList.addAll(sadArray.toList())
        while (recheck) {
            recheck = false
            happyList = check(happyList)
        }
        return happyList.toIntArray()
    }

    private fun check(sadList: ArrayList<Int>): ArrayList<Int> {
        if (sadList.isEmpty())
            return sadList
        var list = ArrayList<Int>()
        list.add(sadList.first())

        for (i in 1 until sadList.indices.last) {
            if (sadList[i] < sadList[i - 1] + sadList[i + 1])
                list.add(sadList[i])
            else
                recheck = true
        }
        list.add(sadList.last())
        return list
    }
}
