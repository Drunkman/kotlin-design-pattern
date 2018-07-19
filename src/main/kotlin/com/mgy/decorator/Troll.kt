package com.mgy.decorator

interface Troll {
    fun attack()
    fun getAttackPower(): Int
    fun fleeBattle()
}

class SimpleTroll : Troll {
    override fun attack() = println("The troll tries to grab you!")

    override fun getAttackPower() = 10

    override fun fleeBattle() = println("The troll shrieks in horror and runs away!")
}

class ClubbedTroll(
    private val decorated: Troll
) : Troll {
    override fun attack() {
        decorated.attack()
        println("The troll swings at you with a club!")
    }

    override fun getAttackPower() = decorated.getAttackPower() + 10

    override fun fleeBattle() = decorated.fleeBattle()
}
