package com.mastermind.daggerhilt.ui.post

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mastermind.daggerhilt.data.repo.PostRepository
import com.mastermind.daggerhilt.model.Post
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PostViewModel @Inject constructor (val postRepository: PostRepository) : ViewModel() {

    val postLiveData = postRepository.loadAll()

    fun insertAll(vararg  post : Post) = viewModelScope.launch {
        postRepository.insertAll(*post)
    }

}