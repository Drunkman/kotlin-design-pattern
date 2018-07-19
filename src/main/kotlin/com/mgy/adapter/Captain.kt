package com.mgy.adapter

class Captain(
    private var rowingBoat: RowingBoat? = null
) {
    fun setRowingBoat(rowingBoat: RowingBoat) {
        this.rowingBoat = rowingBoat
    }

    fun row() = rowingBoat!!.row()
}