package com.mgy.strategy

class DragonSlayer(
    private var strategy: DragonSlayingStrategy
) {
    fun changeStrategy(strategy: DragonSlayingStrategy) {
        this.strategy = strategy
    }

    fun goToBattle() = strategy.execute()
}

class OtherDragonSlayer(
    private var strategy: () -> Unit
) {
    fun changeStrategy(strategy: () -> Unit) {
        this.strategy = strategy
    }

    fun goToBattle() = strategy()
}