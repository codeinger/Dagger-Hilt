package com.mastermind.daggerhilt.ui.post

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.mastermind.daggerhilt.R
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class PostActivity : AppCompatActivity() {

    private val postViewModel : PostViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        postViewModel.getPostLiveData().observe(this){
            Log.i("chjbdf", "onCreate: "+it)
        }

        postViewModel.getPost()

    }
}