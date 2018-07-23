package com.mgy.command

import java.util.*

class Wizard(
    private val undoStack: Stack<Command> = Stack(),
    private val redoStack: Stack<Command> = Stack()
) {
    fun castSpell(command: Command, target: Target) {
        println("$this casts $command at $target")
        command.execute(target)
        undoStack.push(command)
    }

    fun undoLastSpell() {
        if (!undoStack.isEmpty()) {
            val previousSpell = undoStack.pop()
            redoStack.push(previousSpell)
            println("$this undoes $previousSpell")
            previousSpell.undo()
        }
    }

    fun redoLastSpell() {
        if (!redoStack.isEmpty()) {
            val previousSpell = redoStack.pop()
            undoStack.push(previousSpell)
            println("$this redoes $previousSpell")
            previousSpell.redo()
        }
    }

    override fun toString() = "Wizard"
}