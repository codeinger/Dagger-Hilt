package com.mastermind.daggerhilt

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mastermind.daggerhilt.model.Battery
import com.mastermind.daggerhilt.model.Camera
import com.mastermind.daggerhilt.model.Processor
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainFragment : Fragment() {

    private lateinit var mView: View

    @Inject
    lateinit var camera1: Camera

    @Inject
    lateinit var camera2: Camera

    @Inject
    lateinit var battery1: Battery

    @Inject
    lateinit var battery2: Battery


    @Inject
    lateinit var process1: Processor

    @Inject
    lateinit var process2: Processor


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mView = inflater.inflate(R.layout.fragment_main, container, false)
        // Inflate the layout for this fragment


        Log.i("MyDaggerHilt", "MainFragment: ===================================== ")

        Log.i("MyDaggerHilt", "MainFragment: process1 $process1")
        Log.i("MyDaggerHilt", "MainFragment: process2 $process2")

        Log.i("MyDaggerHilt", "MainFragment: battery1 $battery1")
        Log.i("MyDaggerHilt", "MainFragment: battery2 $battery2")

        Log.i("MyDaggerHilt", "MainFragment: camera1 $camera1")
        Log.i("MyDaggerHilt", "MainFragment: camera1 $camera2")



        return mView
    }


}