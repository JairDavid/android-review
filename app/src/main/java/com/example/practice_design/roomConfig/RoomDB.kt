package com.example.practice_design.roomConfig

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [EmpleadoEntity::class],
    version = 1
)

abstract class RoomDB:RoomDatabase() {
    abstract fun getEmpleadoDao():IEmpleadoDao
}