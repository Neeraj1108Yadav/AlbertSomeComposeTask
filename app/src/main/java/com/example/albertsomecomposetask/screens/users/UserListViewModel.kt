package com.example.albertsomecomposetask.screens.users

import androidx.lifecycle.ViewModel
import com.example.albertsomecomposetask.model.DummyUser

class UserListViewModel : ViewModel() {

    val listOfUsers = listOf<DummyUser>(
        DummyUser(
            "https://randomuser.me/api/portraits/women/44.jpg",
            "Mrs Najan Kristensen",
            "Silkeboeg",
            "Syddanmark",
            "Denmark",
            "76339"
        ),
        DummyUser(
            "https://randomuser.me/api/portraits/men/3.jpg",
            "Mr Kadir Beşerler",
            "Artvin",
            "Burdur",
            "Turkey",
            "17145"
        ),
        DummyUser(
            "https://randomuser.me/api/portraits/women/22.jpg",
            "Mrs Jessie Edwards",
            "Lakeland",
            "Texas",
            "United States",
            "37615"
        ),
        DummyUser(
            "https://randomuser.me/api/portraits/women/44.jpg",
            "Mrs Najan Kristensen",
            "Silkeboeg",
            "Syddanmark",
            "Denmark",
            "76339"
        ),
        DummyUser(
            "https://randomuser.me/api/portraits/men/3.jpg",
            "Mr Kadir Beşerler",
            "Artvin",
            "Burdur",
            "Turkey",
            "17145"
        ),
        DummyUser(
            "https://randomuser.me/api/portraits/women/22.jpg",
            "Mrs Jessie Edwards",
            "Lakeland",
            "Texas",
            "United States",
            "37615"
        ),
        DummyUser(
            "https://randomuser.me/api/portraits/women/44.jpg",
            "Mrs Najan Kristensen",
            "Silkeboeg",
            "Syddanmark",
            "Denmark",
            "76339"
        ),
        DummyUser(
            "https://randomuser.me/api/portraits/men/3.jpg",
            "Mr Kadir Beşerler",
            "Artvin",
            "Burdur",
            "Turkey",
            "17145"
        ),
        DummyUser(
            "https://randomuser.me/api/portraits/women/22.jpg",
            "Mrs Jessie Edwards",
            "Lakeland",
            "Texas",
            "United States",
            "37615"
        )
    )
}