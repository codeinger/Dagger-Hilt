package com.mastermind.daggerhilt.data.repo

import com.mastermind.daggerhilt.data.room.dao.PostDao
import com.mastermind.daggerhilt.model.Post
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class PostRepository  @Inject constructor(val postDao: PostDao) {

    suspend fun insertAll(vararg post: Post) = withContext(Dispatchers.IO){
        postDao.insertAllPost(*post)
    }

   fun loadAll() = postDao.loadAllPost()

}