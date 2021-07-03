package com.mastermind.daggerhilt.model

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class Snapdragon @Inject constructor(@Named("Core") var core : Int,@Named("ClockSpeed") var clockSpeed : Int) : Processor{
    init {
        Log.i("MyLog", "Snapdragon: "+this+" created with core : "+core +" and clockspeed : "+clockSpeed)
        start()
    }
    override fun start() {
        Log.i("MyLog", "start: ")
    }
}