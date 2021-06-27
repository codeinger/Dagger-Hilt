package com.mastermind.daggerhilt.modules

import com.mastermind.daggerhilt.model.Processor
import com.mastermind.daggerhilt.model.Snapdragon
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class SnapdragonModule {

    @Binds
    abstract  fun getProcessor(snapdragon: Snapdragon): Processor


}