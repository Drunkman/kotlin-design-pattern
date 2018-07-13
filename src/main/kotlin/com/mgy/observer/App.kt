package com.mgy.observer

/**
 *
 * The Observer pattern is a software design pattern in which an object, called the subject,
 * maintains a list of its dependents, called observers, and notifies them automatically of any
 * state changes, usually by calling one of their methods. It is mainly used to implement
 * distributed event handling systems. The Observer pattern is also a key part in the familiar
 * model–view–controller (MVC) architectural pattern. The Observer pattern is implemented in
 * numerous programming libraries and systems, including almost all GUI toolkits.
 *
 * In this example [Weather] has a state that can be observed. The [Orcs] and
 * [Hobbits] register as observers and receive notifications when the [Weather] changes.
 *
 */
fun main(args: Array<String>) {
    val weather = Weather()
    val orcs = Orcs()
    weather.addObserver(orcs)
    weather.addObserver(Hobbits())

    weather.timePasses()
    weather.timePasses()
    weather.timePasses()

    weather.removeObserver(orcs)
    weather.timePasses()
}