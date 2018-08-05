package com.mgy.abstractfactory

/**
 *
 * The Abstract Factory pattern provides a way to encapsulate a group of individual factories that have a common theme
 * without specifying their concrete classes. In normal usage, the client software creates a concrete implementation of
 * the abstract factory and then uses the generic interface of the factory to create the concrete objects that are part
 * of the theme. The client does not know (or care) which concrete objects it gets from each of these internal
 * factories, since it uses only the generic interfaces of their products. This pattern separates the details of
 * implementation of a set of objects from their general usage and relies on object composition, as object creation is
 * implemented in methods exposed in the factory interface.
 * The essence of the Abstract Factory pattern is a factory interface ([KingdomFactory]) and its implementations (
 * [ElfKingdomFactory], [OrcKingdomFactory]). The example uses both concrete implementations to create a
 * king, a castle and an army.
 *
 */
class App(
    var king: King? = null,
    var castle: Castle? = null,
    var army: Army? = null
) {

    class FactoryMaker {
        enum class KingdomType {
            ELF, ORC
        }

        companion object {
            fun makeFactory(type: KingdomType) = when (type) {
                KingdomType.ELF -> ElfKingdomFactory()
                KingdomType.ORC -> OrcKingdomFactory()
            }
        }
    }

    fun createKingdom(factory: KingdomFactory) {
        this.king = factory.createKing()
        this.castle = factory.createCastle()
        this.army = factory.createArmy()
    }

    fun getKing(factory: KingdomFactory) = factory.createKing()
    fun getCastle(factory: KingdomFactory) = factory.createCastle()
    fun getArmy(factory: KingdomFactory) = factory.createArmy()
}

fun main(args: Array<String>) {
    val app = App()

    println("Elf Kingdom")
    app.createKingdom(App.FactoryMaker.makeFactory(App.FactoryMaker.KingdomType.ELF))
    println(app.army!!.getDescription())
    println(app.castle!!.getDescription())
    println(app.king!!.getDescription())

    println("Orc Kingdom")
    app.createKingdom(App.FactoryMaker.makeFactory(App.FactoryMaker.KingdomType.ORC))
    println(app.army!!.getDescription())
    println(app.castle!!.getDescription())
    println(app.king!!.getDescription())
}