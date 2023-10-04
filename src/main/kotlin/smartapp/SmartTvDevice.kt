package smartapp

import data.User
import data.UserRepository
import enums.DeviceCategory
import enums.SmartDeviceType
import util.RangeRegulator

class SmartTvDevice(deviceName: String, deviceCategory: DeviceCategory, user: User?) :
    SmartDevice(name = deviceName, category = deviceCategory),
    UserRepository {

    override val deviceType = SmartDeviceType.TV
    val user = user

    private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)
    private var channelNumber by RangeRegulator(initialValue = user?.channelNumber ?: 2, minValue = 0, maxValue = 200)

    override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on. Speaker volume set to $speakerVolume and channel number is " +
                    "set to $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
        updateUser(channelNumber)
        println("$name turned off")
    }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    override fun updateUser(channelNumber: Int?): User? {
        user?.channelNumber = channelNumber
        return user
    }
}

