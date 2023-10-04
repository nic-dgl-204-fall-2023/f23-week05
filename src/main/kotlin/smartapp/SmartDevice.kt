package smartapp

import enums.*

sealed class SmartDevice (val name: String, val category: DeviceCategory) {
    var deviceStatus = Status.ONLINE
        protected set

    open val deviceType = SmartDeviceType.UNKNOWN

    open fun turnOn() {
        deviceStatus = Status.ON
    }

    open fun turnOff() {
        deviceStatus = Status.OFF
    }
}
