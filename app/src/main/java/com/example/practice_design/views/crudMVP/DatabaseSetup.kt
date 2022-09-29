package com.example.practice_design.views.crudMVP

import android.app.Application
import androidx.room.Room
import com.example.practice_design.roomConfig.RoomDB

class DatabaseSetup:Application() {
    companion object{
        lateinit var room:RoomDB
    }
    override fun onCreate() {
        super.onCreate()
        //agregamos a application este contexto name=".path.DatabaseSetup"
        room = Room.databaseBuilder(applicationContext, RoomDB::class.java, "utez").build()
    }
}