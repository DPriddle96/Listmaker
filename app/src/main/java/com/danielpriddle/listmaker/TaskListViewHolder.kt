package com.danielpriddle.listmaker

import androidx.recyclerview.widget.RecyclerView
import com.danielpriddle.listmaker.databinding.TaskListViewHolderBinding

class TaskListViewHolder(binding: TaskListViewHolderBinding) : RecyclerView.ViewHolder(binding.root) {
    val taskTextView = binding.taskTextView

}