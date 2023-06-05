package com.example.teste.ui.dashboard


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.teste.R

class UsersViewModel : ViewModel() {
    private val _userList = MutableLiveData<List<Users>>()
    fun getUserList(): LiveData<List<Users>> {
        return _userList
    }
   /* fun fetchUsers() {
        val users = listOf(
            //Users("John Doe", "johndoe@example.com"),
            //Users("Jane Smith", "janesmith@example.com"),
            /*Users("Bob Johnson", "bobjohnson@example.com"),
            Users("Emily Davis", "emilydavis@example.com")*/
        )
        _userList.value = users
    }*/
}
