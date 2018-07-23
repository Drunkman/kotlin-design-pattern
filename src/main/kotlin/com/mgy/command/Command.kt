package com.mgy.command

interface Command {
    fun execute(target: Target)

    fun undo()

    fun redo()

    override fun toString(): String
}

class ShrinkSpell(
    private var oldSize: Size? = null,
    private var target: Target? = null
) : Command {
    override fun execute(target: Target) {
        oldSize = target.size
        target.size = Size.SMALL
        this.target = target
    }

    override fun undo() {
        if (oldSize != null && target != null) {
            val temp = target!!.size
            target!!.size = oldSize!!
            oldSize = temp
        }
    }

    override fun redo() = undo()

    override fun toString() = "Shrink spell"

}

class InvisibilitySpell(
    private var target: Target? = null
) : Command {
    override fun execute(target: Target) {
        target.visibility = Visibility.INVISIBLE
        this.target = target
    }

    override fun undo() {
        if (target != null) {
            target!!.visibility = Visibility.VISIBLE
        }
    }

    override fun redo() {
        if (target != null) {
            target!!.visibility = Visibility.INVISIBLE
        }
    }

    override fun toString() = "Invisibility spell"

}