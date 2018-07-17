package com.mgy.proxy

interface WizardTower {
    fun enter(wizard: Wizard)
}

class IvoryTower : WizardTower {
    override fun enter(wizard: Wizard) {
        println("$wizard enters the tower.")
    }
}