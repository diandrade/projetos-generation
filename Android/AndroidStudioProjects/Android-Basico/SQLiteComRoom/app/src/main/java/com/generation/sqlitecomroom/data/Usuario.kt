package com.generation.sqlitecomroom.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "user_table")
data class Usuario (
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    var nome: String,
    var sobrenome: String,
    var idade: Int,
        ){
}