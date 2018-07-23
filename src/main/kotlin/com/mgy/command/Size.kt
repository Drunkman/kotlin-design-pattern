package com.mgy.command

enum class Size(
    private val title: String
) {
    SMALL("small"), NORMAL("normal");

    override fun toString() = title
}