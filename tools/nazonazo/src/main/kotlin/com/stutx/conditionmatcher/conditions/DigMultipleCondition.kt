package com.stutx.conditionmatcher.conditions

import com.stutx.conditionmatcher.conditions.AbstractCondition

class DigMultipleCondition(private val expect: Int): AbstractCondition(true) {
    
    companion object {
        private val DIG = 10
    }

    override fun isMatch(input: Int): Boolean {
        return calculateMultiple(input) == expect
    }

    private fun calculateMultiple(value: Int): Int {
        check(value > 0) { "value must be over 0" }

        var multiple: Int = 1
        var dig: Int
        var num: Int = value

        while (num > 0) {
            dig = num % DIG
            multiple *= dig
            num /= DIG
        }

        return multiple
    }
}
