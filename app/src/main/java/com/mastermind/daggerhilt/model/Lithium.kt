package com.mastermind.daggerhilt.model

import android.util.Log

class Lithium {
    //we don't own this class so we can't annotate it with @Inject

    init {
        Log.i("MyLog", "Lithium: "+this)
    }

    fun test(){
        Log.i("MyLog", "test: ")
    }
}