package com.danielpriddle.listmaker

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.danielpriddle.listmaker.databinding.TodoListViewHolderBinding

class TodoListViewHolder(binding: TodoListViewHolderBinding) : RecyclerView.ViewHolder(binding.root) {
    var listPositionTextView = binding.itemNumber
    var listTitleTextView = binding.itemString
}