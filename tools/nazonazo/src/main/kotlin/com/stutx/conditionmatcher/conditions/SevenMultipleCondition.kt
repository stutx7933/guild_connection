package com.stutx.conditionmatcher.conditions

import com.stutx.conditionmatcher.conditions.AbstractCondition

class SevenMultipleCondition: AbstractCondition(true) {

    companion object {
        private val MULTIPLE_NUMBER: Int = 7
    }

    override fun isMatch(input: Int): Boolean {
        return if (input >= 0 && input % MULTIPLE_NUMBER == 0) {
            true
        } else {
            false
        }
    }
}
