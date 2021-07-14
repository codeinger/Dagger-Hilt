package com.mastermind.daggerhilt.data.repo

import com.mastermind.daggerhilt.data.PostRequest
import javax.inject.Inject

class PostRepository @Inject constructor(val postRequest: PostRequest) {

    suspend fun getPost() = postRequest.getPost()
}