package com.example.practice_design.roomConfig

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "empleado")
data class EmpleadoEntity(

    @PrimaryKey(autoGenerate = true)
    var id:Int?,
    var nombre:String?,
    var paterno:String?,
    var edad:Int?

)