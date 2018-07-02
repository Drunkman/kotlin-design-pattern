package com.mgy.strategy

/**
 *
 * The Strategy pattern (also known as the policy pattern) is a software design pattern that enables
 * an algorithm's behavior to be selected at runtime.
 * <p>
 * In kotlin, you needn't defined any interfaces and subclass by using kotlin lambdas.
 * <p>
 * In this example ({@link DragonSlayingStrategy}) encapsulates an algorithm. The containing object
 * ({@link DragonSlayer}) can alter its behavior by changing its strategy.
 *
 */
fun main(args: Array<String>) {
    println("Green dragon spotted ahead!")
    val dragonSlayer = DragonSlayer(MeleeStrategy())
    dragonSlayer.goToBattle()
    println("Red dragon emerges.")
    dragonSlayer.changeStrategy(ProjectileStrategy())
    dragonSlayer.goToBattle()
    println("Black dragon lands before you.")
    dragonSlayer.changeStrategy(SpellStrategy())
    dragonSlayer.goToBattle()

    println("Green dragon spotted ahead!")
    val otherDragonSlayer = OtherDragonSlayer(
        { println("With your Excalibur you severe the dragon's head!") })
    otherDragonSlayer.goToBattle()
    println("Red dragon emerges.")
    otherDragonSlayer.changeStrategy {
        println(
            "You shoot the dragon with the magical crossbow and it falls dead on the ground!"
        )
    }
    otherDragonSlayer.goToBattle()
    println("Black dragon lands before you.")
    otherDragonSlayer.changeStrategy {
        println(
            "You cast the spell of disintegration and the dragon vaporizes in a pile of dust!"
        )
    }
    otherDragonSlayer.goToBattle()
}