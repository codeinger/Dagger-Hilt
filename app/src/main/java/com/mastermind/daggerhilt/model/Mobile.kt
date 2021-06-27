package com.mastermind.daggerhilt.model

import android.util.Log
import javax.inject.Inject

class Mobile @Inject constructor(var battery : Battery, var processor : Processor){

    init {
        Log.i("MyLog", "Mobile: "+this)
    }
}