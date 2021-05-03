package com.stutx.conditionmatcher.conditions

import com.stutx.conditionmatcher.conditions.Condition
import com.stutx.conditionmatcher.conditions.DigMultipleCondition
import com.stutx.conditionmatcher.conditions.DigSumCondition
import com.stutx.conditionmatcher.conditions.SevenMultipleCondition

object ConditionProvider {
    private val DIG_SUM: Int = 11
    private val DIG_MULTIPLE: Int = 16

    enum class Type {
        NAZONAZO
    }

    fun create(type: Type): Condition {
        return when (type) {
            Type.NAZONAZO -> {
                AbstractCondition(true).apply {
                    registerLeaf(SevenMultipleCondition())
                    registerLeaf(DigSumCondition(DIG_SUM))
                    registerLeaf(DigMultipleCondition(DIG_MULTIPLE))
                }
            }
            else -> {
                throw IllegalArgumentException("no match type")
            }
        }
    }
}
