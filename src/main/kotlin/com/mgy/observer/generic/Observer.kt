package com.mgy.observer.generic

import com.mgy.observer.WeatherType

interface Observer<S : Observable<S, O, A>, O : Observer<S, O, A>, A> {
    fun update(subject: S, argument: A)
}

interface Race : Observer<Weather, Race, WeatherType>

class Orcs : Race {

    override fun update(subject: Weather, argument: WeatherType) {
        when (argument) {
            WeatherType.COLD -> println("The orcs are freezing cold.")
            WeatherType.RAINY -> println("The orcs are dripping wet.")
            WeatherType.SUNNY -> println("The sun hurts the orcs' eyes.")
            WeatherType.WINDY -> println("The orc smell almost vanishes in the wind.")
        }
    }
}

class Hobbits : Race {

    override fun update(subject: Weather, argument: WeatherType) {
        when (argument) {
            WeatherType.COLD -> println("The hobbits are shivering in the cold weather.")
            WeatherType.RAINY -> println("The hobbits look for cover from the rain.")
            WeatherType.SUNNY -> println("The happy hobbits bade in the warm sun.")
            WeatherType.WINDY -> println("The hobbits hold their hats tightly in the windy weather.")
        }
    }
}
