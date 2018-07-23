package com.mgy.command

abstract class Target(
    var size: Size,
    var visibility: Visibility
) {
    abstract override fun toString(): String

    fun printStatus() = println("$this, [size=$size], [visibility=$visibility]")
}

class Goblin : Target(Size.NORMAL, Visibility.VISIBLE) {
    override fun toString() = "Goblin"
}