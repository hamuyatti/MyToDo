package com.example.mytodo.detail

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.mytodo.R
import com.example.mytodo.page.detail.TodoDetailViewmodel

class ToDoDetailFragment() : Fragment(R.layout.todo_detail_fragment) {
    private val vm : TodoDetailViewmodel by viewModels()
}