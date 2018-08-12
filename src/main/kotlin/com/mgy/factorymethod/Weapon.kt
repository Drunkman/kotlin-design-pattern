package com.mgy.factorymethod

interface Weapon {
    fun getWeaponType(): WeaponType
}

class ElfWeapon(
    private val weaponType: WeaponType
) : Weapon {
    override fun getWeaponType() = weaponType
    override fun toString() = "Elven $weaponType"
}

class OrcWeapon(
    private val weaponType: WeaponType
) : Weapon {
    override fun getWeaponType() = weaponType
    override fun toString() = "Orcish $weaponType"
}