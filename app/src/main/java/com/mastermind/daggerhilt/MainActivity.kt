package com.mastermind.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.mastermind.daggerhilt.model.Battery
import com.mastermind.daggerhilt.model.Camera
import com.mastermind.daggerhilt.model.Mobile
import com.mastermind.daggerhilt.model.Processor
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject



//Processor : Application   ----------------------------------
//Battery : Activity        --------------
//Camera : Fragment         ----------






@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var battery1: Battery

    @Inject
    lateinit var battery2: Battery


    @Inject
    lateinit var process1: Processor

    @Inject
    lateinit var process2: Processor



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.i("MyDaggerHilt", "MainActivity: ===================================== ")

        Log.i("MyDaggerHilt", "MainActivity: process1 $process1")
        Log.i("MyDaggerHilt", "MainActivity: process2 $process2")

        Log.i("MyDaggerHilt", "MainActivity: battery1 $battery1")
        Log.i("MyDaggerHilt", "MainActivity: battery2 $battery2")



        replace(MainFragment())


    }

    fun replace(fragment: Fragment){
        val beginTransaction = supportFragmentManager.beginTransaction()
        beginTransaction.replace(R.id.frame,fragment)
        beginTransaction.commit()
    }


}