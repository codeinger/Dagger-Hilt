package com.mastermind.daggerhilt

import android.app.Application
import android.util.Log
import com.mastermind.daggerhilt.model.Camera
import com.mastermind.daggerhilt.model.Processor
import com.mastermind.daggerhilt.model.Snapdragon
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MainApplication : Application() {

    @Inject
    lateinit var process1: Processor

    @Inject
    lateinit var process2: Processor



    @Inject
    lateinit var snapdragon1: Snapdragon

    @Inject
    lateinit var snapdragon2: Snapdragon





    override fun onCreate() {
        super.onCreate()

        Log.i("MyDaggerHilt", "MainApplication: ===================================== ")

        Log.i("MyDaggerHilt", "MainApplication: process1 $process1")
        Log.i("MyDaggerHilt", "MainApplication: process2 $process2")


        Log.i("MyDaggerHilt", "MainApplication: snapdragon1 $snapdragon1")
        Log.i("MyDaggerHilt", "MainApplication: snapdragon2 $snapdragon2")

    }

}