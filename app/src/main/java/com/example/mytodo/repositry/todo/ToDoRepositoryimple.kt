package com.example.mytodo.repositry.todo

import com.example.mytodo.model.todo.ToDo
import com.example.mytodo.model.todo.ToDoDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ToDoRepositoryimple @Inject constructor(
    private val dao: ToDoDao):ToDoRepositry{
    override suspend fun create(title: String, detail: String) {
       val now = System.currentTimeMillis()
       val todo = ToDo(title = title, detail = detail,created = now,modified = now)
        withContext(Dispatchers.IO){
            dao.create(todo)
        }

    }
}