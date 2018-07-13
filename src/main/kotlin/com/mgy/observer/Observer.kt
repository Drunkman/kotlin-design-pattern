package com.mgy.observer

interface WeatherObserver {
    fun update(weatherType: WeatherType)
}

class Orcs : WeatherObserver {

    override fun update(weatherType: WeatherType) {
        when (weatherType) {
            WeatherType.COLD -> println("The orcs are freezing cold.")
            WeatherType.RAINY -> println("The orcs are dripping wet.")
            WeatherType.SUNNY -> println("The sun hurts the orcs' eyes.")
            WeatherType.WINDY -> println("The orc smell almost vanishes in the wind.")
        }
    }
}

class Hobbits : WeatherObserver {

    override fun update(weatherType: WeatherType) {
        when (weatherType) {
            WeatherType.COLD -> println("The hobbits are shivering in the cold weather.")
            WeatherType.RAINY -> println("The hobbits look for cover from the rain.")
            WeatherType.SUNNY -> println("The happy hobbits bade in the warm sun.")
            WeatherType.WINDY -> println("The hobbits hold their hats tightly in the windy weather.")
        }
    }
}
