package com.example.blackholes

class Blackhole(val x: Float, val y: Float, val speed: Int) {
    val MAX = 400f
    val MIN = 30f
    var r = 30f
    var sign = 1

    fun grow() {
        if (r > MAX) {
            sign = -1
        }
        else if (r < MIN) {
            sign = 1
        }
        r += (speed * sign).toFloat()
    }
}