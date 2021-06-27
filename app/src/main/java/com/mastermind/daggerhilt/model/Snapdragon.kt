package com.mastermind.daggerhilt.model

import android.util.Log
import javax.inject.Inject

class Snapdragon @Inject constructor() : Processor{
    init {
        Log.i("MyLog", "Snapdragon: "+this)
        start()
    }
    override fun start() {
        Log.i("MyLog", "start: ")
    }
}