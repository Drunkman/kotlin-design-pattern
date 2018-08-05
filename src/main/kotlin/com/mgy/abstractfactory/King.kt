package com.mgy.abstractfactory

interface King {
    fun getDescription(): String
}

class ElfKing : King {

    companion object {
        const val DESCRIPTION = "This is the Elven king!"
    }

    override fun getDescription() = DESCRIPTION
}

class OrcKing : King {

    companion object {
        internal val DESCRIPTION = "This is the Orc king!"
    }

    override fun getDescription() = DESCRIPTION
}