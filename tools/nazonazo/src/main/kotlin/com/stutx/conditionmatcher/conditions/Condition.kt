package com.stutx.conditionmatcher.conditions

/**
 * This class provides Condition interface.
 */
interface Condition {
    /**
     * Check condition.
     *
     * @param input The value checked condition.
     */
    fun isMatch(input: Int): Boolean

    /**
     * Register leaf condition.
     * 
     * @param condition The leaf condition.
     */
    fun registerLeaf(condition: Condition): Boolean

    /**
     * Remove leaf condition.
     * 
     * @param condition The condition removed.
     */
    fun unregisterLeaf(condition: Condition): Boolean
}
