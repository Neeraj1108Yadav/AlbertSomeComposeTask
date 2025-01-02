package com.example.albertsomecomposetask.nav

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.albertsomecomposetask.screens.UserInfoScreen
import com.example.albertsomecomposetask.screens.users.UserListScreen

@Composable
fun App(){
    val navController = rememberNavController()
    //val currentBackstack by navController.currentBackStackEntryAsState()
    //val currentDestination = currentBackstack?.
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = UserList.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = UserList.route){
                UserListScreen()
            }

            composable(route = UserInfo.route){
                UserInfoScreen()
            }
        }
    }
}