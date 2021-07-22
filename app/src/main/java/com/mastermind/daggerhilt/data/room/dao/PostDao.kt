package com.mastermind.daggerhilt.data.room.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.mastermind.daggerhilt.model.Post

@Dao
interface PostDao {

    @Insert
    suspend fun insert(post: Post)

    @Update
    suspend fun update(post: Post)

    @Delete
    suspend fun delete(post: Post)

    @Query("Select * from Post")
    fun loadAllPost() : LiveData<List<Post>>

    @Insert
    suspend fun insertAllPost(vararg post : Post)

}