package com.stutx.conditionmatcher.conditions

import com.stutx.conditionmatcher.conditions.AbstractCondition

class DigSumCondition(private val expect: Int): AbstractCondition(true) {

    companion object {
        private val DIG: Int = 10
    }

    override fun isMatch(input: Int): Boolean {
        return calculateSum(input) == expect
    }

    private fun calculateSum(value: Int): Int {
        var sum: Int = 0
        var dig: Int
        var num: Int = value

        while (num > 0) {
            dig = num % DIG
            sum += dig
            num /= DIG
        }

        return sum
    }
}
