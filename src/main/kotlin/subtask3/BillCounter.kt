package rsTask.subtask3

class BillCounter {

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, brayansPosition: Int, annsMoney: Int): String {
        var brayansBill = (bill.sum() - bill[brayansPosition]) / 2 + bill[brayansPosition]
        var annsBill = bill.sum() - brayansBill
        return if (annsMoney == annsBill)
            "bon appetit"
        else
            annsMoney.minus(annsBill).toString()

    }
}
