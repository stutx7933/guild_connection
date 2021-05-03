package com.stutx.conditionmatcher

import com.stutx.conditionmatcher.NazonazoMatcher

fun main() {
    val matcher = NazonazoMatcher(1, 1000)
    
    matcher.listUp().forEach {
        println("i: $it")
    }
}
