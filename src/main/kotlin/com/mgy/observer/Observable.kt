package com.mgy.observer

class Weather {
    private var currentWeather = WeatherType.SUNNY
    private val observers = mutableListOf<WeatherObserver>()

    fun addObserver(observer: WeatherObserver) = observers.add(observer)
    fun removeObserver(observer: WeatherObserver) = observers.remove(observer)

    fun timePasses() {
        currentWeather = WeatherType.values()[(currentWeather.ordinal + 1) % WeatherType.values().size]
        println("The weather changed to $currentWeather")
        notifyObservers()
    }

    private fun notifyObservers() = observers.forEach { it.update(currentWeather) }
}

enum class WeatherType {
    SUNNY, RAINY, WINDY, COLD;

    override fun toString(): String {
        return name.toLowerCase()
    }
}