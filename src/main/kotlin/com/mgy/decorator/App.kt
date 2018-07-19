package com.mgy.decorator

/**
 *
 * The Decorator pattern is a more flexible alternative to subclassing. The Decorator class
 * implements the same interface as the target and uses aggregation to "decorate" calls to the
 * target. Using the Decorator pattern it is possible to change the behavior of the class during
 * runtime.
 * In this example we show how the simple [SimpleTroll] first attacks and then flees the battle.
 * Then we decorate the [SimpleTroll] with a [ClubbedTroll] and perform the attack again. You
 * can see how the behavior changes after the decoration.
 *
 */
fun main(args: Array<String>) {
    // simple troll
    println("A simple looking troll approaches.")
    var troll: Troll = SimpleTroll()
    troll.attack()
    troll.fleeBattle()
    println("Simple troll power ${troll.getAttackPower()}")

    // clubbed troll
    println("A troll with huge club surprises you.")
    troll = ClubbedTroll(troll)
    troll.attack()
    troll.fleeBattle()
    println("Simple troll power ${troll.getAttackPower()}")
}