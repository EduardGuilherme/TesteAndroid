package com.example.teste.ui.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.example.teste.R

class UsersAdapter : RecyclerView.Adapter<UsersAdapter.ViewHolder>() {
    private var userList: List<Users> = emptyList()
    val userListObserver = Observer<List<Users>> { newUserList ->
        userList = newUserList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = userList[position]
        holder.bind(user)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textViewName: TextView = itemView.findViewById(R.id.name)
        private val textViewEmail: TextView = itemView.findViewById(R.id.avatar)

        fun bind(user: Users) {
            textViewName.text = user.name
            textViewEmail.text = user.avatar
        }
    }
}