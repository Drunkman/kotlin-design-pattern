package com.mgy.observer.generic

import com.mgy.observer.WeatherType

abstract class Observable<S : Observable<S, O, A>, O : Observer<S, O, A>, A> {
    protected var observers = mutableListOf<O>()

    fun addObserver(observer: O) = observers.add(observer)

    fun removeObserver(observer: O) = observers.remove(observer)

    fun notifyObservers(argument: A) = observers.forEach { it.update(this as S, argument) }
}

class Weather : Observable<Weather, Race, WeatherType>() {
    private var currentWeather = WeatherType.SUNNY

    fun timePasses() {
        currentWeather = WeatherType.values()[(currentWeather.ordinal + 1) % WeatherType.values().size]
        println("The weather changed to $currentWeather")
        notifyObservers(currentWeather)
    }
}