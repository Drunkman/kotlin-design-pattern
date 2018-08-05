package com.mgy.abstractfactory

interface Army {
    fun getDescription(): String
}

class ElfArmy : Army {

    companion object {
        const val DESCRIPTION = "This is the Elven Army!"
    }

    override fun getDescription() = DESCRIPTION
}

class OrcArmy : Army {

    companion object {
        const val DESCRIPTION = "This is the Orc Army!"
    }

    override fun getDescription() = DESCRIPTION
}