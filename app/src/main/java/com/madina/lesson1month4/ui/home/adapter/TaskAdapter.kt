package com.madina.lesson1month4.ui.home.adapter
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.madina.lesson1month4.databinding.ItemTaskBinding
import com.madina.lesson1month4.ui.home.adapter.TaskAdapter.*

class TaskAdapter: Adapter<TaskAdapter.TaskViewHolder>(){

    inner class TaskViewHolder (private val binding: ItemTaskBinding): ViewHolder(binding.root)}

