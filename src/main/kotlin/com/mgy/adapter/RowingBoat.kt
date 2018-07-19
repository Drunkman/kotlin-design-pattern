package com.mgy.adapter

interface RowingBoat {
    fun row()
}

class FishingBoatAdapter(
    private val boat: FishingBoat = FishingBoat()
) : RowingBoat {
    override fun row() = boat.sail()
}