package com.example.mytodo.model.todo

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ToDoDao::class],version = 1)
abstract class ToDodatabase : RoomDatabase() {
    abstract fun todoDao() :ToDoDao

}