package com.mgy.abstractfactory

interface Castle {
    fun getDescription(): String
}

class ElfCastle : Castle {

    companion object {
        const val DESCRIPTION = "This is the Elven castle!"
    }

    override fun getDescription() = DESCRIPTION
}

class OrcCastle : Castle {

    companion object {
        const val DESCRIPTION = "This is the Orc castle!"
    }

    override fun getDescription() = DESCRIPTION
}