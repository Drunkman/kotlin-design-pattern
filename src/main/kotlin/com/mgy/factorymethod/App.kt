package com.mgy.factorymethod

/**
 *
 * The Factory Method is a creational design pattern which uses factory methods to deal with the
 * problem of creating objects without specifying the exact class of object that will be created.
 * This is done by creating objects via calling a factory method either specified in an interface
 * and implemented by child classes, or implemented in a base class and optionally overridden by
 * derived classes—rather than by calling a constructor.
 * In this Factory Method example we have an interface ([Blacksmith]) with a method for
 * creating objects ([Blacksmith.manufactureWeapon]). The concrete subclasses (
 * [OrcBlacksmith], [ElfBlacksmith]) then override the method to produce objects of
 * their liking.
 *
 */
class App(
    private val blacksmith: Blacksmith
) {
    fun manufactureWeapons() {
        var weapon: Weapon?
        weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR)
        println(weapon.toString())
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE)
        println(weapon.toString())
    }
}

fun main(args: Array<String>) {
    App(OrcBlacksmith()).manufactureWeapons()
    App(ElfBlacksmith()).manufactureWeapons()
}