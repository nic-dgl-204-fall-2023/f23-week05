import smartapp.*

fun main() {
    SmartHome.turnOnTv()
    SmartHome.turnOnLight()
    println("Total number of devices currently turned on: ${SmartHome.deviceTurnOnCount}")
    println()

    SmartHome.increaseTvVolume()
    SmartHome.changeTvChannelToNext()
    SmartHome.increaseLightBrightness()
    println()

    SmartHome.turnOffAllDevices()
    println("Total number of devices currently turned on: ${SmartHome.deviceTurnOnCount}.")
}
