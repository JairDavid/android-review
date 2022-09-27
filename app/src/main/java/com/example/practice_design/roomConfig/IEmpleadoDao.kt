package com.example.practice_design.roomConfig

import androidx.room.*

@Dao
interface IEmpleadoDao {
    @Insert
    suspend fun insert(empleadoEntity: EmpleadoEntity):Long

    @Query("SELECT * FROM empleado")
    suspend fun getAll():List<EmpleadoEntity>

    @Update
    suspend fun update(empleadoEntity: EmpleadoEntity)

    @Delete
    suspend fun delete(empleadoEntity: EmpleadoEntity)

    @Query("SELECT * FROM empleado WHERE id = :id")
    suspend fun getOne(id:Int):EmpleadoEntity

}