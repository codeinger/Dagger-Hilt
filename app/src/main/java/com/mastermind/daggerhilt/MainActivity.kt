package com.mastermind.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mastermind.daggerhilt.model.Mobile
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject



@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var mobile: Mobile


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.i("MyLog", "onCreate: "+mobile)

    }

}