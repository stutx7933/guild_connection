package com.stutx.conditionmatcher.conditions

import com.stutx.conditionmatcher.conditions.Condition

open class AbstractCondition(
    private val isAndMatch: Boolean
): Condition {
    private val conditionList: MutableList<Condition>

    init {
        conditionList = mutableListOf()
    }

    override fun isMatch(input: Int): Boolean {
        return if (isAndMatch) {
            isAndMatch(input)
        } else {
            isOrMatch(input)
        }
    }

    override fun registerLeaf(condition: Condition): Boolean {
        return conditionList.add(condition)
    }

    override fun unregisterLeaf(condition: Condition): Boolean {
        return conditionList.remove(condition)
    }
    
    private fun isAndMatch(input: Int): Boolean {
        return if (conditionList.isNotEmpty()) {
            conditionList.find {
                !it.isMatch(input)
            } ?.let {
                false
            } ?: true
        } else {
            true
        }
    }

    private fun isOrMatch(input: Int): Boolean {
        return if (conditionList.isNotEmpty()) {
            conditionList.find {
                it.isMatch(input)
            } ?.let {
                true
            } ?: false
        } else {
            true
        }
    }
}
