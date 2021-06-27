package com.mastermind.daggerhilt.model

import android.util.Log

class Cobalt {
    //we don't own this class so we can't annotate it with @Inject
    init {
        Log.i("MyLog", "Cobalt: "+this)
    }
}