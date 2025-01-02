package com.example.albertsomecomposetask.nav

interface AppDestinations {
    val route: String
}

object UserList : AppDestinations{
    override val route: String
        get() = "users"

}

object UserInfo : AppDestinations{
    override val route: String
        get() = "user_info"
}