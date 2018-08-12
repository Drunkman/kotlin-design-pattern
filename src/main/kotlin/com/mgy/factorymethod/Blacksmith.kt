package com.mgy.factorymethod

interface Blacksmith {
    fun manufactureWeapon(weaponType: WeaponType): Weapon
}

class ElfBlacksmith : Blacksmith {
    override fun manufactureWeapon(weaponType: WeaponType) = ElfWeapon(weaponType)
}

class OrcBlacksmith : Blacksmith {
    override fun manufactureWeapon(weaponType: WeaponType) = OrcWeapon(weaponType)
}