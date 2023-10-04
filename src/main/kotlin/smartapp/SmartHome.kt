package smartapp

import data.User
import enums.DeviceCategory

class SmartHome() {

    companion object {
        val smartTvDevice = SmartTvDevice(deviceName = "Android TV", deviceCategory = DeviceCategory.ENTERTAINMENT, user = User("Ashley", 1, 10))
        val smartLightDevice = SmartLightDevice(deviceName = "Google light", deviceCategory = DeviceCategory.UTILITY)
        var deviceTurnOnCount = 0
            private set

        fun turnOnTv() {
            deviceTurnOnCount++
            smartTvDevice.turnOn()
        }

        fun turnOffTv() {
            deviceTurnOnCount--
            smartTvDevice.turnOff()
        }

        fun increaseTvVolume() {
            smartTvDevice.increaseSpeakerVolume()
        }

        fun changeTvChannelToNext() {
            smartTvDevice.nextChannel()
        }

        fun turnOnLight() {
            deviceTurnOnCount++
            smartLightDevice.turnOn()
        }

        fun turnOffLight() {
            deviceTurnOnCount--
            smartLightDevice.turnOff()
        }

        fun increaseLightBrightness() {
            smartLightDevice.increaseBrightness()
        }

        fun turnOffAllDevices() {
            turnOffTv()
            turnOffLight()
        }
    }
}