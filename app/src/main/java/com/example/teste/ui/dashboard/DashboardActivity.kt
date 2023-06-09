package com.example.teste.ui.dashboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
//import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.teste.R


class DashboardActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: UsersAdapter
    //private lateinit var viewModel: UsersViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        /*super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = UsersAdapter()
        recyclerView.adapter = adapter

        viewModel = ViewModelProvider(this).get(UsersViewModel::class.java)
        viewModel.userList.observe(this, adapter.userListObserver)

        viewModel.fetchUsers()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = UsersAdapter()
        recyclerView.adapter = adapter

        viewModel = ViewModelProvider(this).get(UsersViewModel::class.java)
        /*viewModel.userList.observe(this, { userList ->
            adapter.submitList(userList)
        })*/

        viewModel.fetchUsers()*/
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val userList = listOf(
            Users("John Doe", "john.doe@example.com", R.drawable.user1),
            Users("Jane Smith", "jane.smith@example.com", R.drawable.user2),
            Users("Robert Johnson", "robert.johnson@example.com", R.drawable.user3),
        )
        adapter = UsersAdapter(userList)
        recyclerView.adapter = adapter
    }
}