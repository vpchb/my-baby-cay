package com.example.dataroom

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "student_table")
data class Student(
    @PrimaryKey(autoGenerate = true)
    val sno: Int? = null,

    @ColumnInfo(name = "first_name")
    val firstName:String,

    @ColumnInfo(name = "last_name")
    val lastname: String,

    @ColumnInfo(name = "birthday")
    val nationality: String,

    @Ignore
    val playSmartphoneINClass :Boolean,

    @Embedded
    val course: Course
)
@Entity(tableName = "Course")
data class Course(
    @PrimaryKey(autoGenerate = true)
    val sno: Int? = null
    )