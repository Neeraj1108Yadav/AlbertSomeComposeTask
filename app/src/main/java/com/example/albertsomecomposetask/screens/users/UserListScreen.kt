package com.example.albertsomecomposetask.screens.users

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.albertsomecomposetask.components.TopAppBar
import com.example.albertsomecomposetask.components.UserCard

@Composable
fun UserListScreen(
    viewModel: UserListViewModel = viewModel<UserListViewModel>()
){
    Column{
        TopAppBar(title = "Home")
        Box{
            LazyColumn {
                itemsIndexed(
                    items = viewModel.listOfUsers,
                    key = {index,user->
                        index
                    },
                    itemContent = {index,user->
                        UserCard(user)
                    }
                )
            }
        }
    }
}