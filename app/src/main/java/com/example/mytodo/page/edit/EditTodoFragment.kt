package com.example.mytodo.page.edit

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.mytodo.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EditTodoFragment : Fragment(R.layout.edit_todo_fragment){
    private val vm: editviewmodel by viewModels()
}