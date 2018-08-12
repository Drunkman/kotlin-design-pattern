package com.mgy.factorymethod

enum class WeaponType(
    private val title: String
) {
    SHORT_SWARD("short sward"), SPEAR("spear"), AXE("axe"), UNDEFINED("");

    override fun toString() = title
}