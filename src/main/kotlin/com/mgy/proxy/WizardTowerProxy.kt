package com.mgy.proxy

class WizardTowerProxy(
    private val wizardTower: WizardTower
) : WizardTower {

    companion object {
        private val NUM_WIZARDS_ALLOWED = 3
    }

    private var numWizards = 0

    override fun enter(wizard: Wizard) {
        if (numWizards < NUM_WIZARDS_ALLOWED) {
            wizardTower.enter(wizard)
            numWizards++
        } else {
            println("$wizard is not allowed to enter!")
        }
    }

}