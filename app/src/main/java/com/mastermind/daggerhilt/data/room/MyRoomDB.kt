package com.mastermind.daggerhilt.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mastermind.daggerhilt.data.room.dao.PostDao
import com.mastermind.daggerhilt.model.Post

@Database(entities = [Post::class],version = 1,exportSchema = false)
abstract class MyRoomDB : RoomDatabase() {
    abstract fun getPostDao():PostDao
}