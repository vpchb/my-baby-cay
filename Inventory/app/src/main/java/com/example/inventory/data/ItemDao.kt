package com.example.inventory.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update


interface ItemDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: Item)

    @Update
    suspend fun update(item: Item)

    @Delete
    suspend fun delete(item: Item)

    @Query("SELECT * from items Where id = :id")
    fun getItem(id: Int): List<Item>

    @Query("SELECT * from student_table ORDER BY first_name ASC")
    fun getAllItems(): List<List<Item>>
}