package com.mgy.strategy

interface DragonSlayingStrategy {
    fun execute()
}

class SpellStrategy : DragonSlayingStrategy {
    override fun execute() {
        println("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!")
    }

}

class ProjectileStrategy : DragonSlayingStrategy {
    override fun execute() {
        println("You shoot the dragon with the magical crossbow and it falls dead on the ground!")
    }
}

class MeleeStrategy : DragonSlayingStrategy {
    override fun execute() {
        println("With your Excalibur you sever the dragon's head!")
    }
}