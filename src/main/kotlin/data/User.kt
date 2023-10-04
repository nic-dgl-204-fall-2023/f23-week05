package data

interface UserRepository {
    fun updateUser(channelNumber: Int?): User?
}

data class User(val name: String, val profileID: Int, var channelNumber: Int?)
