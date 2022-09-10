package com.plcoding.mvvmtodoapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Todo::class], //Tabelas no projeto
    version = 1
)
abstract class TodoDatabase: RoomDatabase() {

    abstract val dao: TodoDao
}