package com.example.recyclerviewanddatabase1.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)
