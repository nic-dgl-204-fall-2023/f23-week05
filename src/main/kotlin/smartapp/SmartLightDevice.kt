package smartapp

import enums.DeviceCategory
import enums.SmartDeviceType
import util.RangeRegulator

class SmartLightDevice(deviceName: String, deviceCategory: DeviceCategory) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    override val deviceType = SmartDeviceType.LIGHT
    private var brightnessLevel by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name is turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("$name turned off")
    }

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }
}
