package com.stutx.conditionmatcher

import com.stutx.conditionmatcher.conditions.Condition
import com.stutx.conditionmatcher.conditions.ConditionProvider

class NazonazoMatcher {
    private val conditions = ConditionProvider.create(ConditionProvider.Type.NAZONAZO)

    private var max: Int = 0
    private var min: Int = 0

    constructor(min: Int, max: Int) {
        setRange(min, max)
    }

    fun setRange(min: Int, max: Int) {
        check(min > 0 && max > 0) { "min and max value must be over 0." }
        check(max >= min) { "max value must be over min value." }

        this.min = min
        this.max = max
    }

    fun listUp(): List<Int> {
        return mutableListOf<Int>().apply {
            for (i in min..max ) {
                if (conditions.isMatch(i)) {
                    add(i)
                }
            }
        }
    }
}
