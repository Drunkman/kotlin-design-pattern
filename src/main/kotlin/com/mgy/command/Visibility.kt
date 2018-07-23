package com.mgy.command

enum class Visibility(
    private val title: String
) {
    VISIBLE("visible"), INVISIBLE("invisible");

    override fun toString() = title
}