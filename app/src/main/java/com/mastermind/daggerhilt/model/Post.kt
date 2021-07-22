package com.mastermind.daggerhilt.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Post(
    @PrimaryKey(autoGenerate = true)
    var id : Long,
    var title : String,
    var Des : String
)