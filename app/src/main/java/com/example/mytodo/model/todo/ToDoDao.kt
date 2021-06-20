package com.example.mytodo.model.todo

import androidx.room.*


@Dao
interface ToDoDao {

    @Query("select * from TODO where created < :startCreated order by created desc Limit:Limit")
    fun getWithCreated(startCreated: Long,Limit:Int): kotlinx.coroutines.flow.Flow<List<ToDo>>

    @Insert
    suspend fun create(todo :ToDo)

    @Update
    suspend fun update(todo : ToDo)

    @Delete
    suspend fun delete(todo : ToDo)

}