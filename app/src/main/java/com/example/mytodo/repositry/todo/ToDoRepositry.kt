package com.example.mytodo.repositry.todo

interface ToDoRepositry {
    suspend fun create(title :String,detail:String)
}