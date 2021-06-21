package com.example.mytodo.create

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.mytodo.R
import com.example.mytodo.page.create.createToDoViewmodel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class createToDoFragment: Fragment(R.layout.create_todo_fragment){
    private val vm:createToDoViewmodel by viewModels()

}