package com.example.mytodo

import android.content.Context
import androidx.room.Room
import com.example.mytodo.model.todo.ToDoDao
import com.example.mytodo.model.todo.ToDodatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton


@Module
@InstallIn(Singleton::class)
object ToDoModule {

    @Singleton
    @Provides
    fun provideTodoDatabase(
        @ApplicationContext context: Context
    ):ToDodatabase{
        return Room.databaseBuilder(
            context,
            ToDodatabase::class.java,"todo.db"
        ).build()
    }


    @Singleton
    @Provides
    fun providetododao(db :ToDodatabase):ToDoDao{

        return db.todoDao()
    }
}

@Module
abstract  class ToDoRepositoryModule{
    abstract fun ToDoRepositoryRepository()
}