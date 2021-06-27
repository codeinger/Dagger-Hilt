package com.mastermind.daggerhilt.model

import android.util.Log
import javax.inject.Inject

class Processor @Inject constructor() {
    init {
        Log.i("MyLog", "Processor: "+this)
    }
}