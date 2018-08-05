package com.mgy.abstractfactory

interface KingdomFactory {
    fun createKing(): King
    fun createCastle(): Castle
    fun createArmy(): Army
}

class ElfKingdomFactory : KingdomFactory {

    override fun createCastle() = ElfCastle()

    override fun createKing() = ElfKing()

    override fun createArmy() = ElfArmy()
}

class OrcKingdomFactory : KingdomFactory {

    override fun createCastle() = OrcCastle()

    override fun createKing() = OrcKing()

    override fun createArmy() = OrcArmy()
}